package com.example.ControleDeFaltas.repository;

import com.example.ControleDeFaltas.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
