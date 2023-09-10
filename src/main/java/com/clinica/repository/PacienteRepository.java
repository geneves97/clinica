package com.clinica.repository;

import com.clinica.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Integer> {
}
