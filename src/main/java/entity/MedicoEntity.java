package entity;

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
}
