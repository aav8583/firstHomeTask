package com.example.hometasks.model;

public class Book {

    //можно ли как-то уменьшить количество генерируемого кода?

    private Integer id;
    private String title;
    private String author;

    public Book(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
