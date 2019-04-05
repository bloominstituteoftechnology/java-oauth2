package com.lambdaschool.authenticatedusers.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaschool.authenticatedusers.model.Quote;
import com.lambdaschool.authenticatedusers.model.Role;
import com.lambdaschool.authenticatedusers.model.User;
import com.lambdaschool.authenticatedusers.model.UserRoles;
import com.lambdaschool.authenticatedusers.service.QuoteService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(value = QuotesController.class, secure = false)
public class QuotesControllerTest
{
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private QuoteService quoteService;

    List<Quote> quoteList;

    @Before
    public void setUp() throws Exception
    {
        quoteList = new ArrayList<>();

        Role r1 = new Role("admin");
        r1.setRoleid(21);
        Role r2 = new Role("user");
        r2.setRoleid(22);

        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        admins.add(new UserRoles(new User(), r2));

        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));

        User u1 = new User("barnbarn", "ILuvM4th!", users);
        u1.setUserid(11);

        quoteList.add(new Quote("Live long and prosper", u1));
        quoteList.get(0).setQuotesid(0);
        quoteList.add(new Quote("The enemy of my enemy is the enemy I kill last", u1));
        quoteList.get(1).setQuotesid(1);
        quoteList.add(new Quote("Beam me up", u1));
        quoteList.get(2).setQuotesid(2);

        User u2 = new User("admin", "password", admins);
        u2.setUserid(12);
        quoteList.add(new Quote("A creative man is motivated by the desire to achieve, not by the desire to beat others", u2));
        quoteList.get(3).setQuotesid(3);
        quoteList.add(new Quote("The question isn't who is going to let me; it's who is going to stop me.", u2));
        quoteList.get(4).setQuotesid(4);
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void listAllQuotes() throws Exception
    {
        String apiUrl = "/quotes/quotes";

        Mockito.when(quoteService.findAll()).thenReturn(quoteList);

        RequestBuilder rb = MockMvcRequestBuilders.get(apiUrl).accept(MediaType.APPLICATION_JSON);

        // the following actually performs a real controller call
        MvcResult q = mockMvc.perform(rb).andReturn(); // this could throw an exception
        String tq = q.getResponse().getContentAsString();

        ObjectMapper mapper = new ObjectMapper();
        String eq = mapper.writeValueAsString(quoteList);

        assertEquals("Rest API Returns List", eq, tq);
    }
}