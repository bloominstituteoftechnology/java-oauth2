package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.usermodel.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Loggable
@Entity
@Table(name = "sections")
public class Section extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    private String name;

    @OneToMany(mappedBy = "section",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties("section")
    private List<Wrote> wrote = new ArrayList<>();


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

    public List<Wrote> getWrote() {
        return wrote;
    }

    public void setWrote(List<Wrote> wrote) {
        this.wrote = wrote;
    }

    public void setName(String name) {
        this.name = name;
    }
}
