package com.example.hometasks.service.impl;

import com.example.hometasks.model.Book;
import com.example.hometasks.repository.BookExampleRepository;
import com.example.hometasks.service.BookService;

import java.util.ArrayList;
import java.util.List;

//это сервис, который реализует логику интерфейса
//какие аннотации могут понадобиться тут для работы с БД
public class BookServiceImpl implements BookService {

    private BookExampleRepository bookRepository;

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }
}
