package com.example.hometasks.service;

import com.example.hometasks.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findById(Integer id);
    Book save(Book book);
    void deleteById(Integer id);

}
