package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Book;
import com.lambdaschool.usermodel.services.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    // http://localhost:2021/book/books
    @GetMapping(value = "/books", produces = "application/json")
    ResponseEntity<?> getBooks(){
        logger.info("books/books Accessed");
        List<Book> books = bookService.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // http://localhost:2021/books/books/1
    @PutMapping(value = "/books/{id}", consumes = {"application/json"})
    public ResponseEntity<?> updateBookById(HttpServletRequest request, @RequestBody Book book, @PathVariable long id) {
        logger.info(request.getMethod().toUpperCase() + " " + request.getRequestURI() + " accessed");
        bookService.update(id, book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/books/{bookid}/authors/{authorid}", consumes = {"application/json"})
    public ResponseEntity postBookAuthorById(HttpServletRequest request, @PathVariable long bookid, @PathVariable Book authorid) {
        logger.info(request.getMethod().toUpperCase() + " " + request.getRequestURI() + " accessed");
        bookService.update(bookid, authorid);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/books/{id}")
    public ResponseEntity<?> deleteBook(HttpServletRequest request, @PathVariable long id) {
        logger.info(request.getMethod().toUpperCase() + " " + request.getRequestURI() + " accessed");
        bookService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}