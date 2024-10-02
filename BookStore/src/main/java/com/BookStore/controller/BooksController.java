package com.BookStore.controller;

import com.BookStore.entity.Books;
import com.BookStore.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BooksController {
    @Autowired
    private BooksService booksService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/catalogue")
    public String catalogue(Model model) {
        model.addAttribute("list", booksService.getAllBooks());
        return "all";
    }

    @GetMapping("/favourite/{id}")
    public String favourite(@PathVariable int id, Model model) {
        Books book = booksService.getBookById(id);
        model.addAttribute("book", book);
        book.setFavourite(true);
        booksService.addBook(book);
        return "redirect:/favourites";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("book", booksService.getBookById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Books book) {
        booksService.addBook(book);
        return "redirect:/catalogue";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        booksService.deleteBook(id);
        return "redirect:/catalogue";
    }

    @GetMapping("/add_books")
    public String addBooks() {
        return "add";
    }

    @PostMapping("/save")
    public String save(Books book) {
        booksService.addBook(book);
        return "redirect:/catalogue";
    }

    @GetMapping("/favourites")
    public String favourites(Model model) {
        model.addAttribute("fav", booksService.getFavouriteBooks());
        return "favourite";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable int id, Model model) {
        Books book = booksService.getBookById(id);
        model.addAttribute("book", book);
        book.setFavourite(false);
        booksService.addBook(book);
        return "redirect:/favourites";
    }
}
