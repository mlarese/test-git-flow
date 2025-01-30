package com.example.test_git_flow.bookshelf;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookShelfRunner implements CommandLineRunner {
    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 5; i++) {
            BookShelf bookShelf = new BookShelf();
            bookShelf.setId(faker.number().randomNumber());
            bookShelf.setName(faker.book().title());
            bookShelf.setLocation(faker.address().fullAddress());

            System.out.println("BookShelf: " + bookShelf);
        }

    }
}
