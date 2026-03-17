package com.booktracker.backend.service;

import com.booktracker.backend.model.Book;
import com.booktracker.backend.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // GET all books
    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    // ADD book
    public Book addBook(Book book) {
        List<Book> books = repository.getAllBooks();

        // simple ID generation
        int newId = books.size() > 0 ? books.get(books.size() - 1).getId() + 1 : 1;
        book.setId(newId);

        books.add(book);
        repository.saveAllBooks(books);

        return book;
    }

    // UPDATE book
    public Book updateBook(int id, Book updatedBook) {
        List<Book> books = repository.getAllBooks();

        Optional<Book> existingBook = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst();

        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setTotalPages(updatedBook.getTotalPages());
            book.setPagesRead(updatedBook.getPagesRead());
            book.setStatus(updatedBook.getStatus());

            repository.saveAllBooks(books);
            return book;
        }

        return null;
    }

    // DELETE book
    public boolean deleteBook(int id) {
        List<Book> books = repository.getAllBooks();

        boolean removed = books.removeIf(b -> b.getId() == id);

        if (removed) {
            repository.saveAllBooks(books);
        }

        return removed;
    }
}