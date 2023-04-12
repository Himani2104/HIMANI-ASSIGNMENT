package com.example.one.To.Many.Mapping.oneToManyMapping;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int bookId;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(int bookId, Author author, String bookName) {
        this.bookId = bookId;
        this.author = author;
        this.bookName = bookName;
    }
    Book()
    {

    }



    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
