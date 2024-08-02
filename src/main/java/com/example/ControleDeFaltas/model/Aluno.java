package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

import java.util.Date;

// todo adicionar validacao como a NotBlank nos campos obrigatorios

@Table(name="Alunos")
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;
    private String name;
    private String endereco;
    private Date dtNascimento;
    private String contactNumber;
}
