package com.clinica.entity;

import jakarta.persistence.*;


@Entity(name = "PRONTUARIO")
public class ProntuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "ANAMNESE")
    @Lob
    String anamnese;

    @Column(name = "EVOLUCAO")
    @Lob
    String evolucao;

    @Column(name = "SOLICITA_EXAME")
    String solicitaExame;

    @Column(name = "RECEITUARIO")
    @Lob
    String receituario;

    @Column(name = "CID")
    String cid;

    @OneToOne
    @JoinColumn(name = "PACIENTE_ID", referencedColumnName = "ID")
    private PacienteEntity paciente;
}
