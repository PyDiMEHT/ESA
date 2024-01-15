package com.example.LR_2.service;

import com.example.LR_2.models.AuthorEntity;
import com.example.LR_2.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorEntity> findAll() {
        return authorRepository.findAll();
    }

    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    public AuthorEntity createById(AuthorEntity author) {
        return authorRepository.save(author);
    }
}
