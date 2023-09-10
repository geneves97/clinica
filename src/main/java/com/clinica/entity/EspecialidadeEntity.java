package com.clinica.entity;

import jakarta.persistence.*;


@Entity(name = "ESPECIALIDADE")
public class EspecialidadeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @SequenceGenerator(name="id")
    @Column(name = "ID")
    Integer id;

    @Column(name = "NOME")
    String nome;

    @Column(name = "DESCRICAO")
    @Lob
    String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
