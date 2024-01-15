package com.example.LR_2.controllers;

import com.example.LR_2.models.AuthorEntity;
import com.example.LR_2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static com.example.LR_2.controllers.Mapper2XLT.transform2XLT;

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
        return "authorsPage";
    }
}
