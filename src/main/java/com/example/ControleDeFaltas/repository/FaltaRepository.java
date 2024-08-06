package com.example.ControleDeFaltas.repository;

import com.example.ControleDeFaltas.model.Falta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaltaRepository extends JpaRepository<Falta, Long> {
}
