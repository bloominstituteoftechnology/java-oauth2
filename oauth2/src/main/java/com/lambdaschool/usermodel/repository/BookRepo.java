package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
