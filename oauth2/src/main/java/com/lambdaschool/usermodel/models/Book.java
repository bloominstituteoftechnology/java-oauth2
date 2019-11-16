package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Loggable
@Entity
@Table(name = "books")
public class Book extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookid;

    private String title;
    private String ISBN;
    @Column(nullable = true)
    private int copy;

    @ManyToMany
    @JsonIgnoreProperties("books")
    private List<Author> authors = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "sectionid")
    @JsonIgnoreProperties("books")
    private Section section;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("book")
    private List<Wrote> writers = new ArrayList<>();


    public Book(){}

    public Book(String title, String ISBN, int copy) {
        this.title = title;
        this.ISBN = ISBN;
        this.copy = copy;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<Wrote> getWriters() {
        return writers;
    }

    public void setWriters(List<Wrote> writers) {
        this.writers = writers;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopy() {
        return this.copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }
}
