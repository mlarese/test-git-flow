package com.example.test_git_flow.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AutoreRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("Spring Boot in Action");
        book.setIsbn("9781617292545");

        System.out.println("--------------------------" );
        System.out.println("Book: " + book);
        System.out.println("--------------------------" );

    }
}
