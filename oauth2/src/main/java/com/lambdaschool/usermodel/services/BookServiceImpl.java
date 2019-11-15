package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.Book;
import com.lambdaschool.usermodel.repository.AuthorRepo;
import com.lambdaschool.usermodel.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public List<Book> findAll() {
        List<Book> list = new ArrayList<>();
        bookRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Book findBookById(long id) {
        return bookRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("nothing to find by that id"));

    }

    @Override
    public void delete(long id) {
        bookRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("nothing to delete"));
        bookRepo.deleteById(id);
    }

    @Override
    public Book save(Book book) {
        Book newBook = new Book();
        newBook.setTitle(book.getTitle());
        newBook.setISBN(book.getISBN());
        newBook.setCopy(book.getCopy());
        return bookRepo.save(book);
    }

    @Override
    public Book update(long id, Book book) {
        Book currentBook = findBookById(id);
        if (book.getTitle() != null) {
            currentBook.setTitle(book.getTitle());
        }
        if (book.getISBN() != null) {
            currentBook.setISBN(book.getISBN());
        }
      
            currentBook.getCopy();

        return bookRepo.save(book);
    }
}
