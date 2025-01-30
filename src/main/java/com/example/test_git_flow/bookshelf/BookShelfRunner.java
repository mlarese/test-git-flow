package com.example.test_git_flow.bookshelf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookShelfRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        BookShelf bookShelf = new BookShelf();
        bookShelf.setId(1L);
        bookShelf.setName("Java Programming");
        bookShelf.setLocation("A1");

        System.out.println("--------------------------" );
        System.out.println("BookShelf: " + bookShelf);
        System.out.println("--------------------------" );
        System.out.println("--------------------------" );
    }
}
