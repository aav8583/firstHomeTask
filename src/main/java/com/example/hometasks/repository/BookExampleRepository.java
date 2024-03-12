package com.example.hometasks.repository;

import com.example.hometasks.model.Book;

import java.util.List;

//условный репозиторий, что бы вы не подключали БД и не настраивали соединение
//это репозиторий, который должен возвращать данные из БД
//тут тоже потребуется аннотация
//если хотите, можете убрать комменты в build.gradle у стартера jpa, поднять БД и сделать реальные вызовы
public class BookExampleRepository {

    List<Book> DB;

    public BookExampleRepository(List<Book> DB) {
        this.DB = DB;
        Book book1 = new Book(1, "Война и мир", " Лев Толстой");
        Book book2 = new Book(2, "Моби дик", "Герман Мелвилл");
        Book book3 = new Book(3, "Хлеб с ветчиной", "Чарльз Буковски");
        DB.add(book1);
        DB.add(book2);
        DB.add(book3);
    }

    public List<Book> findAll() {
        return DB;
    }

    public Book findById(Integer id) {
        id--;
        return DB.get(id);
    }

    public Book save(Book book) {
        DB.add(book);
        return book;
    }

    public void deleteById(Integer id) {
        int idForDelete = id;
        DB.remove(idForDelete);
    }

}
