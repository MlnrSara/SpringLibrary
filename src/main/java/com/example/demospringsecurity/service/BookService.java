package com.example.demospringsecurity.service;

import com.example.demospringsecurity.model.Author;
import com.example.demospringsecurity.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Long id);

    //List<Author> getAuthors(Book book);

    List<Book> findAllBooks();

    void deleteBook(Book book);

    Book saveBook(Book book);

}
