package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faltas")
public class Falta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFalta;
    private String motivoFalta;
    @ManyToOne // Muitas faltas para 1 aluno
    @JoinColumn(name="idAluno", nullable = false)
    private long aluno;
    @ManyToOne
    @JoinColumn(name="idAula", nullable = false)
    private long aula;
}
