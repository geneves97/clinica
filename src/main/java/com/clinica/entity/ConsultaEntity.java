package com.clinica.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity(name = "CONSULTA")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @SequenceGenerator(name="id")
    @Column(name = "ID")
    Integer id;

    @DateTimeFormat
    @Column(name = "DATA")
    private LocalDate data;

    @OneToOne
    @JoinColumn(name = "MEDICO_ID", referencedColumnName = "ID")
    private PacienteEntity medico;

    @OneToOne
    @JoinColumn(name = "PACIENTE_ID", referencedColumnName = "ID")
    private PacienteEntity paciente;

    @OneToOne
    @JoinColumn(name = "ESPECIALIDADE_ID", referencedColumnName = "ID")
    private EspecialidadeEntity especialidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public PacienteEntity getMedico() {
        return medico;
    }

    public void setMedico(PacienteEntity medico) {
        this.medico = medico;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public EspecialidadeEntity getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeEntity especialidade) {
        this.especialidade = especialidade;
    }
}
