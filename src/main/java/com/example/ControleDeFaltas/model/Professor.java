package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

import java.util.Date;

@Table(name="professores")
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProfessor;
    private String nome;
    private Date endereco;
    private String contato;
}
