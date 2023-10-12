package ru.babushkina.jdbcspringexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.babushkina.jdbcspringexample.model.Book;
import ru.babushkina.jdbcspringexample.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }
}
