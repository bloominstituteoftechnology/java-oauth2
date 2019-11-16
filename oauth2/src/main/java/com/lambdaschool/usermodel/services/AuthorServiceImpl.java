package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.logging.Loggable;
import com.lambdaschool.usermodel.models.Author;
import com.lambdaschool.usermodel.repository.AuthorRepo;
import com.lambdaschool.usermodel.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Loggable
@Service(value = "authorService")
public class AuthorServiceImpl implements AuthorService {


    @Autowired
    AuthorRepo authorRepo;
    @Autowired
    BookRepo bookRepo;

    @Override
    public List<Author> findAll() {
        List<Author> list = new ArrayList<>();
        authorRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Author findAuthorById(long id) {
        return authorRepo.findById(id).orElseThrow( () -> new ResourceNotFoundException("could not find an author"));
    }

    @Override
    public void delete(long id) {
        authorRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("nothing to delete"));
        authorRepo.deleteById(id);
    }


    @Override
    public Author save(Author author) {
        Author newAuthor = new Author();
        newAuthor.setFname(author.getFname());
        newAuthor.setLname(author.getLname());
        if (author.getWriter().size() > 0) throw new ResourceNotFoundException("no author found");
        return authorRepo.save(author);
    }

    @Override
    public Author update(long id, Author author) {
        Author currentAuthor = findAuthorById(id);
        currentAuthor.setFname(author.getFname());
        currentAuthor.setLname(author.getLname());
        if (author.getWriter().size() > 0) throw new ResourceNotFoundException("no author found");
        return authorRepo.save(author);
    }
}


