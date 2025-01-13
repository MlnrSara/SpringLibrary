package com.example.demospringsecurity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Title is required.")
    @Size(min=3, max=50, message = "Title must contain at least 3 characters and cannot surpass 50 characters.")
    private String title;

    /*@ManyToMany(mappedBy = "books")
    @NotNull
    private List<Author> authors;*/

    @NotBlank(message = "There are no books without authors!")
    @Size(min=3, max=50, message = "Author's name must contain at least 3 characters.")
    private String author;

    @NotNull
    private Integer quantity;
}
