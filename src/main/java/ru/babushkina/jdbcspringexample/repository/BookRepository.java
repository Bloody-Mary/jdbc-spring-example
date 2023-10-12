package ru.babushkina.jdbcspringexample.repository;

import ru.babushkina.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}
