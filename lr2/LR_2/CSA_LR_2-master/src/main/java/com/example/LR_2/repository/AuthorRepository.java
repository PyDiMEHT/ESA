package com.example.LR_2.repository;

import com.example.LR_2.models.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {


}
