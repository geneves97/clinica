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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public String getSolicitaExame() {
        return solicitaExame;
    }

    public void setSolicitaExame(String solicitaExame) {
        this.solicitaExame = solicitaExame;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }
}
