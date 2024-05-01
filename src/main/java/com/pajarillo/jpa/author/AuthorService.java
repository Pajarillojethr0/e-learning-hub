package com.pajarillo.jpa.author;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository AUTHOR_REPOSITORY;


    public AuthorService(AuthorRepository authorRepository) {
        AUTHOR_REPOSITORY = authorRepository;
    }

    public List<Author> getAuthors(){
        return AUTHOR_REPOSITORY.findAll();
    }

    public Author insertAuthor(Author author) {
        return AUTHOR_REPOSITORY.save(author);
    }
}
