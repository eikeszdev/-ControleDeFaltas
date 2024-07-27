package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

@Table(name = "Aulas")
@Entity
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aulaId;
    // data
    // hoario
    // conteudo
}
