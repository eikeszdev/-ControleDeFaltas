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

    @ManyToOne // muitas turmas, podem ter 1 mesmo professor
    @JoinColumn(name = "idProfessor", nullable = false)
    private long professor;
    @ManyToOne // Muitas turmas, pode ter 1 mesmo aluno
    @JoinColumn(name="idAluno", nullable = false)
    private long aluno;
}
