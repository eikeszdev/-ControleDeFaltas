package com.example.ControleDeFaltas.repository;

import com.example.ControleDeFaltas.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Professor, Long> {
}
