package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("section")
    private List<Book> books = new ArrayList<>();

    public Section() {
    }

    public Section(String sectionname) {
        this.name = sectionname;
    }

    public long getSectionid() {
        return sectionid;
    }

    public void setSectionid(long sectionid) {
        this.sectionid = sectionid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}