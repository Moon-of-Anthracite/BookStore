package com.BookStore.service;

import com.BookStore.entity.Books;
import com.BookStore.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    public Books getBookById(int id) {
        return booksRepository.findById(id).get();
    }

    public List<Books> getFavouriteBooks() {
        return booksRepository.getFavouriteBooks(true);
    }

    public void addBook(Books book) {
        booksRepository.save(book);
    }

    public void deleteBook(int id) {
        booksRepository.deleteById(id);
    }
}
