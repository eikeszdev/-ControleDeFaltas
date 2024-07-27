package com.example.ControleDeFaltas.model;

import jakarta.persistence.*;

@Table(name="Turmas")
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTurma;

    private String nomeTurma;
    private String professor; // todo O professor pode vir a ser uma entidade do banco, um aluno de outro tipo ou person
    private String disciplina; // Pode ser um int pra ocupar menos espaço no banco, ou as disciplinas terem uma tabela com Id e nome
    private String horarioAula; // todo Normalmente o horário das aulas são pre-definidos, então seria interessante uma entidade representando os horarios disponiveis.

}
