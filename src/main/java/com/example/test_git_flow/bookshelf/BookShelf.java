package com.example.test_git_flow.bookshelf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookShelf {
    private Long id;
    private String name;
    private String location;
}
