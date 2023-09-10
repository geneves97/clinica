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

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "FILIACAO")
    private String filiacao;

    @Column(name = "CONVENIO")
    private String convenio;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @OneToOne
    @JoinColumn(name = "PRONTUARIO_ID", referencedColumnName = "ID")
    private ProntuarioEntity prontuario;

    public PacienteEntity() {
        // Construtor vazio
    }

    public PacienteEntity(String nome, String endereco, String telefone, String filiacao, String convenio, LocalDate dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.filiacao = filiacao;
        this.convenio = convenio;
        this.dataNascimento = dataNascimento;
    }

    // Getters e setters

    // Lógica de formatação de telefone

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteEntity that = (PacienteEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
