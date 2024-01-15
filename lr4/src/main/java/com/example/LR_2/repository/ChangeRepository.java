package com.example.LR_2.repository;


import com.example.LR_2.models.Change;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeRepository extends JpaRepository<Change, Long> {
}
