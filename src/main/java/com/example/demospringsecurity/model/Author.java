package com.example.demospringsecurity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHORS")
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 3, message = "Author's name should have at least 3 characters.")
    private String name;

    @NotBlank
    @Size(max=50, message = "Nationality cannot have more than 50 characters.")
    private String nationality;

    @ManyToMany
    private List<Book> books;
}
