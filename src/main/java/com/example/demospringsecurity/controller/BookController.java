package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.model.Book;
import com.example.demospringsecurity.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/books")
    public String showAllBooks(Model model, Authentication authentication){
        if(authentication != null){
            List<Book> books = bookService.findAllBooks();
            model.addAttribute("books", books);
        }
        model.addAttribute("title", "All Books");
        return "books/index";
    }

    @GetMapping("/books/create")
    public String renderCreateBookForm(Model model){
        model.addAttribute("title", "Insert new book into the database");
        model.addAttribute(new Book());
        return "books/create";
    }

    @PostMapping("/books/create")
    public String createBook(@ModelAttribute @Valid Book newBook, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Insert new book into the database");
            return "books/create";
        }
        bookService.saveBook(newBook);
        return "redirect:/books";
    }

    @GetMapping("/books/details")
    public String displayEventDetails(@RequestParam Long bookId, Model model){
        Optional<Book> result = bookService.findById(bookId);
        if(result.isEmpty()){
            model.addAttribute("title", "Event doesn't exist in the database");
        } else {
            Book book = result.get();
            model.addAttribute("book", book);
        }
        return "books/details";
    }

    @PostMapping("/books/delete")
    public String deleteBook(@RequestParam Long id){
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
