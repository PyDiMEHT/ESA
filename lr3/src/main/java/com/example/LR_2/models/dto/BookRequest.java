package com.example.LR_2.models.dto;

import lombok.Data;

@Data
public class BookRequest {
    private String tittle;
    private int author_id;
    private  int public_year;
}
