package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Loggable
@Entity
@Table(name = "authors")
public class Author extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookid;
    private String fname;
    private String lname;

    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "authors")
    private List<Book> books = new ArrayList<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("author")
    private List<Wrote> writer = new ArrayList<>();

    public Author() {}

    public Author(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public List<Wrote> getWriter() {
        return writer;
    }

    public void setWriter(List<Wrote> writer) {
        this.writer = writer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


}
