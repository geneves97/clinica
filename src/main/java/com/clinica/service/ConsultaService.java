package com.clinica.service;

import com.clinica.entity.ConsultaEntity;
import com.clinica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository consultaRepository;

    public ConsultaEntity saveConsulta(ConsultaEntity consultaEntity) {
        consultaEntity.setData(consultaEntity.getData());
        consultaEntity.setEspecialidade(consultaEntity.getEspecialidade());
        consultaEntity.setMedico(consultaEntity.getMedico());
        consultaEntity.setPaciente(consultaEntity.getPaciente());
        return consultaRepository.save(consultaEntity);
    }

    public List<ConsultaEntity> findAllConsultas() {
        return consultaRepository.findAll();
    }
    
    public ConsultaEntity findConsultaById(Integer id) {
        return consultaRepository.findById(id).get();
    }
}
