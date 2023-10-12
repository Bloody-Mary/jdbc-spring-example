package ru.babushkina.jdbcspringexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.babushkina.jdbcspringexample.repository.BookRepository;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
