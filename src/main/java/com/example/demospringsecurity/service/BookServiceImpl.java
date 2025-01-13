package com.example.demospringsecurity.service;

import com.example.demospringsecurity.model.Book;
import com.example.demospringsecurity.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
