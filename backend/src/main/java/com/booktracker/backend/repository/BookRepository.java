package com.booktracker.backend.repository;

import com.booktracker.backend.model.Book;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final String FILE_PATH = "backend/src/main/resources/data/books.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Book> getAllBooks() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) return new ArrayList<>();
            return objectMapper.readValue(file, new TypeReference<List<Book>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveAllBooks(List<Book> books) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}