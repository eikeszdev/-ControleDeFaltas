package com.example.ControleDeFaltas.repository;

import com.example.ControleDeFaltas.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
