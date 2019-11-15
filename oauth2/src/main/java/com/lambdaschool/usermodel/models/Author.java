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

    @OneToMany(mappedBy = "author",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties("author")
    private List<Wrote> wrote = new ArrayList<>();

    @OneToMany(mappedBy = "author",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties("author")
    private List<Book> books = new ArrayList<>();

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

    public List<Wrote> getWrote() {
        return wrote;
    }

    public void setWrote(List<Wrote> wrote) {
        this.wrote = wrote;
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
