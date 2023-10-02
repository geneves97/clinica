package com.clinica.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "PACIENTE")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private int cpf;

    // Constructor
    public PacienteEntity(Integer id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    // Lógica de formatação de telefone

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
