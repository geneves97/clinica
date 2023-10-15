package com.clinica.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
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

}
