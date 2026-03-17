package com.booktracker.backend.model;

public class Book {

    private Integer coverId;
    private int id;
    private String title;
    private String author;
    private int totalPages;
    private int pagesRead;
    private String status; // WANT_TO_READ, READING, COMPLETED

    public Book() {}

    public Book(int id, String title, String author, int totalPages, int pagesRead, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.pagesRead = pagesRead;
        this.status = status;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }

    public int getPagesRead() { return pagesRead; }
    public void setPagesRead(int pagesRead) { this.pagesRead = pagesRead; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}