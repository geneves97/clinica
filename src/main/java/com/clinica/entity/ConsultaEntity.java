package com.clinica.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity(name = "CONSULTA")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
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

}
