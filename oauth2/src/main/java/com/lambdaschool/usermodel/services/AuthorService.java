package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Author;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {
    List<Author> findAll(Pageable pageable);

    List<Author> findByNameContaining(String username,
                                    Pageable pageable);

    Author findAuthorById(long id);

    Author findByName(String name);

    void delete(long id);

    Author save(Author author);

    Author update(Author author,
                long id);

    void deleteAuthorWrote(long bookid,
                        long authorid);

    void addAuthorWrote(long bookid,
                     long authorid);
}
