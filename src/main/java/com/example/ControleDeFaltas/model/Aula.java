package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "Aulas")
@Entity
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAula;
    private Date dataAula;
    private Date horaAula;
    private String conteudo;
    @ManyToOne
    @JoinColumn(name="idTurma", nullable = false)
    private long turma;
}
