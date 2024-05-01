package com.pajarillo.jpa.author;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/e-learning/api")
public class AuthorController {


    private final AuthorService AUTHOR_SERVICE;


    public AuthorController(AuthorService authorService) {
        AUTHOR_SERVICE = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return AUTHOR_SERVICE.getAuthors();
    }

    @PostMapping("/authors/add-author")
    public Author insertAuthor(
            @RequestBody Author author
    ){
        return AUTHOR_SERVICE.insertAuthor(author);
    }
}
