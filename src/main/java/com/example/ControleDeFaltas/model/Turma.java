package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

@Table(name="Turmas")
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTurma;
    private String nomeTurma;
    private String disciplina; // Pode ser um int pra ocupar menos espaço no banco, ou as disciplinas terem uma tabela com Id e nome

    @ManyToOne
    @JoinColumn(name = "idProfessor", nullable = false)
    private long professor;
    @ManyToOne
    @JoinColumn(name="idAluno", nullable = false)
    private long aluno;
}
