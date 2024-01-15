package com.example.LR_2.service;

import com.example.LR_2.models.BookEntity;
import com.example.LR_2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookEntity> finAll(){
        return bookRepository.findAll();
    }
    public BookEntity savePlayer(BookEntity newBookEntity) {
        return bookRepository.save(newBookEntity);
    }
}
