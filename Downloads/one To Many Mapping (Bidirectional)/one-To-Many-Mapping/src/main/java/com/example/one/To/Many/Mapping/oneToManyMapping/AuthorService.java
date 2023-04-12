package com.example.one.To.Many.Mapping.oneToManyMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
@Autowired
    AuthorRepository authorRepository;


    public Author CreateAuthor(Author author) {

      /*  Author a1=new Author();

        a1.setAuthorId(author.getAuthorId());
        a1.setAuthorName(author.getAuthorName());
        a1.setBook(author.setBook(author.getBook()));*/

     List<Book> book=author.getBook();

     author.setBook(book);
        return authorRepository.save(author);


    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getById(int id) {
        return authorRepository.findById(id).orElse(null);
    }
}
