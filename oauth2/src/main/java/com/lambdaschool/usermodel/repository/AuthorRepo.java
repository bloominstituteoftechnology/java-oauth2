package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Author;
import com.lambdaschool.usermodel.models.User;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {


}
