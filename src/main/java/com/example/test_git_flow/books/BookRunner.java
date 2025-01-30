package com.example.test_git_flow.books;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements CommandLineRunner {
    @Autowired
    Faker faker ;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 35; i++) {
            Book book = new Book();
            book.setId(faker.number().randomNumber());
            book.setTitle(faker.book().title());
            book.setIsbn(faker.code().isbn10());

            System.out.println("Book: " + book);
        }

    }
}
