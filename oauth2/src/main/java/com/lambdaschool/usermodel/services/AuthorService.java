package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();

    Author findAuthorById(long id);

    void delete(long id);

    Author save(Author author);

    Author update(long id, Author author);
}
