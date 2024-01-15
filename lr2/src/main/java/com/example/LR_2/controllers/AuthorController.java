package com.example.LR_2.controllers;

import com.example.LR_2.models.AuthorEntity;
import com.example.LR_2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AuthorController {
    private final AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String home(Model model){
        List<AuthorEntity> allAuthorEntities = authorService.findAll();
        model.addAttribute("allAuthorEntities", allAuthorEntities);
        return "teamsPage";
    }
}
