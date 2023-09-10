package com.clinica.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "MEDICO")
public class MedicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CRM")
    private Integer crm;

    @ManyToMany
    @JoinColumn(name = "ESPECIALIDADE_ID", referencedColumnName = "ID")
    private List<EspecialidadeEntity> especialidade;

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

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public List<EspecialidadeEntity> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(List<EspecialidadeEntity> especialidade) {
        this.especialidade = especialidade;
    }
}
