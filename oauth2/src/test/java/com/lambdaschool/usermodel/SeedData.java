package com.lambdaschool.usermodel;

import com.lambdaschool.usermodel.models.Role;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.models.UserRoles;
import com.lambdaschool.usermodel.models.Useremail;
import com.lambdaschool.usermodel.services.RoleService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class SeedData implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {

        Pageable pageable = new Pageable() {
            @Override
            public int getPageNumber() {
                return 0;
            }

            @Override
            public int getPageSize() {
                return 10;
            }

            @Override
            public long getOffset() {
                return 0;
            }

            @Override
            public Sort getSort() {
                return null;
            }

            @Override
            public Pageable next() {
                return null;
            }

            @Override
            public Pageable previousOrFirst() {
                return null;
            }

            @Override
            public Pageable first() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }
        };

        List<User> userList = new ArrayList<>();
        userService.findAll(pageable).iterator().forEachRemaining(userList::add);

        for (User u : userList) {
            u.setUserroles(new ArrayList<>());
            userService.update(u, u.getUserid(), true);
        }
    }
}