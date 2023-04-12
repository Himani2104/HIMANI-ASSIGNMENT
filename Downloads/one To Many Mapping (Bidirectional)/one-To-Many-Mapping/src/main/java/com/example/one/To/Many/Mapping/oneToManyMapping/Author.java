package com.example.one.To.Many.Mapping.oneToManyMapping;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch=FetchType.EAGER)

//    @JoinColumn(name = "author_id",referencedColumnName = "authorId")
  //  @Fetch(FetchType.EAGER)
    private List<Book> book;

   /* @OneToMany
    @JoinColumn(name = "author_id")
    private List<Subject> subjects;*/

    /*public Author(int authorId, String authorName, List<Subject> subjects, Address address) {
        AuthorId = authorId;
        AuthorName = authorName;
        this.subjects = subjects;
        this.address = address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }*/

   /* public Author(int authorId, String authorName, Book book, Address address) {
        AuthorId = authorId;
        AuthorName = authorName;
        this.book = book;
        this.address = address;
    }*/

    Author()
    {

    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    /*@Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Author(int authorId, String authorName, List<Book> book) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.book = book;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
