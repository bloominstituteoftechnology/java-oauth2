package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Section;

import java.util.List;

public interface SectionService
{
    List<Section> findAll();

    Section findSectionById(long id);

    void delete(long id);

    Section save(Section section);

    Section findByName(String name);

    Section update(long id,
                Section section);
}
