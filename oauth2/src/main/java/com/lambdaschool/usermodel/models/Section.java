package com.lambdaschool.usermodel.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    private String name;


    public Section(){}
    public Section(String name) {
        this.name = name;
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
}
