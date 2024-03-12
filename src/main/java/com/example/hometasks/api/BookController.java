package com.example.hometasks.api;

import com.example.hometasks.model.Book;
import com.example.hometasks.service.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//Этот контроллер должен вызывать все методы по пути host:8080/books/....
public class BookController {

    private BookService bookService;

    //get метод, который возвращает список всех книг
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("find-book")  //get метод возвращает 1 книгу по ее id, переданному в query param
    public Book getBookById(Integer id) {
        return bookService.findById(id);
    }

    //post метод, который принимаем на тело book
    public Book createBook(Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/{id}") //delete метод удаляет 1 книгу по ее id, переданному в url
    public void deleteBook(Integer id) {
        bookService.deleteById(id);
    }
}
