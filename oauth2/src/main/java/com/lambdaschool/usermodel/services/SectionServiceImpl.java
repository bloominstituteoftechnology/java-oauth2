package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceFoundException;
import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.logging.Loggable;
import com.lambdaschool.usermodel.models.Section;
import com.lambdaschool.usermodel.repository.AuthorRepo;
import com.lambdaschool.usermodel.repository.SectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Loggable
@Service(value = "sectionService")
public class SectionServiceImpl implements SectionService
{
    @Autowired
    SectionRepo sectionRepo;

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    UserAuditing userAuditing;

    @Override
    public List<Section> findAll()
    {
        List<Section> list = new ArrayList<>();
        sectionRepo.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }


    @Override
    public Section findSectionById(long id)
    {
        return sectionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Section id " + id + " not found!"));
    }

    @Override
    public Section findByName(String name)
    {
        Section rr = sectionRepo.findByNameIgnoreCase(name);

        if (rr != null)
        {
            return rr;
        } else
        {
            throw new ResourceNotFoundException(name);
        }
    }

    @Transactional
    @Override
    public void delete(long id)
    {
        sectionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sction id " + id + " not found!"));
        sectionRepo.deleteById(id);
    }


    @Transactional
    @Override
    public Section update(long id,
                       Section section) {
        if (section.getName() == null) {
            throw new ResourceNotFoundException("No section name found to update!");
        }
        return section;
    }


    @Transactional
    @Override
    public Section save(Section section)
    {
        Section newSection = new Section();
        newSection.setName(section.getName());
        if (section.getBooks()
                .size() > 0)
        {
            throw new ResourceFoundException("User Roles are not updated through Role. See endpoint POST: users/user/{userid}/role/{roleid}");
        }

        return sectionRepo.save(section);
    }
}

