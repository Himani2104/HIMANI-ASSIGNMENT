package com.example.one.To.Many.Mapping.oneToManyMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MappingController {

    @Autowired
    AuthorService authorService;

    @Autowired
    BookService bookService;
    @PostMapping("/authors")
    public Author createNewAuthor(@RequestBody Author author)
    {
        return authorService.CreateAuthor(author);
    }

    @PostMapping("/book")
    public Book createNewAuthor(@RequestBody Book book)
    {
        return bookService.CreateBooks(book);
    }
    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable int id)
    {
        return  authorService.getById(id);
    }
    public List<Author> getAllAuthorDetails()
    {
        return authorService.getAllAuthors();
    }



}
