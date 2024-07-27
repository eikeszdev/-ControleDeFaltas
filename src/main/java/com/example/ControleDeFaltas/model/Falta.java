package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faltas")
public class Falta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFalta;
    // infos sobre o aluno
    // infos sobre a aula
    // justificativa falta - 2 campos, sim e nao, se sim, com descricao
}
