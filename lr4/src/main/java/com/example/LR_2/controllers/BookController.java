package com.example.LR_2.controllers;

import com.example.LR_2.models.BookEntity;
import com.example.LR_2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    BookService bookService;
    @Autowired
    public BookController(BookService bookService) { this.bookService = bookService; }

    @GetMapping("/books")
    public String home(Model model){
        List<BookEntity> allBookEntities = bookService.findAll();
        model.addAttribute("allBookEntities", allBookEntities);
        return "booksPage";
    }
}
