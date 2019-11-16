package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findBookById(long id);

    void delete(long id);

    Book save(Book book);

    Book update(long id, Book book);

}
