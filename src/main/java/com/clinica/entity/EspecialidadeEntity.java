package com.clinica.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
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

}
