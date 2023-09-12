package com.clinica.repository;

import com.clinica.entity.ProntuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProntuarioRepository extends JpaRepository<ProntuarioEntity, Integer> {
}
