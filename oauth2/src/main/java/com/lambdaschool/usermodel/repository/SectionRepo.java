package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Section;
import org.springframework.data.repository.CrudRepository;

public interface SectionRepo extends CrudRepository<Section, Long> {
    Section findByNameIgnoreCase(String name);

}
