package com.example.demospringsecurity.repository;

import com.example.demospringsecurity.model.Book;
import com.example.demospringsecurity.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
