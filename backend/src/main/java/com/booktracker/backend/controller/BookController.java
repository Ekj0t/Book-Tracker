package com.booktracker.backend.controller;

import com.booktracker.backend.model.Book;
import com.booktracker.backend.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin // allow frontend to call backend
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    // GET all books
    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    // ADD book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    // UPDATE book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    // DELETE book
    @DeleteMapping("/{id}")
    public boolean deleteBook(@PathVariable int id) {
        return service.deleteBook(id);
    }
}