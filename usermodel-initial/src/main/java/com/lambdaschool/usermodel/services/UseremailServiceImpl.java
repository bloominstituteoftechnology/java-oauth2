package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.models.Useremail;
import com.lambdaschool.usermodel.repository.UseremailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements the UseremailService Interface
 */
@Transactional
@Service(value = "useremailService")
public class UseremailServiceImpl
        implements UseremailService
{
    /**
     * Connects this service to the Useremail model
     */
    @Autowired
    private UseremailRepository useremailrepos;

    /**
     * Connects this servive to the User Service
     */
    @Autowired
    private UserService userService;

    @Override
    public List<Useremail> findAll()
    {
        List<Useremail> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        useremailrepos.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Useremail findUseremailById(long id)
    {
        return useremailrepos.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Useremail with id " + id + " Not Found!"));
    }

    @Transactional
    @Override
    public void delete(long id)
    {
        if (useremailrepos.findById(id)
                .isPresent())
        {
            useremailrepos.deleteById(id);
        } else
        {
            throw new ResourceNotFoundException("Useremail with id " + id + " Not Found!");
        }
    }

    @Transactional
    @Override
    public Useremail update(
            long useremailid,
            String emailaddress)
    {
        if (useremailrepos.findById(useremailid)
                .isPresent())
        {
            Useremail useremail = findUseremailById(useremailid);
            useremail.setUseremail(emailaddress.toLowerCase());
            return useremailrepos.save(useremail);
        } else
        {
            throw new ResourceNotFoundException("Useremail with id " + useremailid + " Not Found!");
        }
    }

    @Transactional
    @Override
    public Useremail save(
            long userid,
            String emailaddress)
    {
        User currentUser = userService.findUserById(userid);

        Useremail newUserEmail = new Useremail(currentUser,
                                               emailaddress);
        return useremailrepos.save(newUserEmail);
    }
}
