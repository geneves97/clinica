package com.clinica.rest;

import com.clinica.entity.ConsultaEntity;
import com.clinica.repository.ConsultaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestConsulta {

    @Autowired
    ConsultaRepository consultaRepository;

    public ConsultaEntity findById(Integer id) {
        return consultaRepository.findById(id).get();
    }

    public ConsultaEntity save(ConsultaEntity consultaEntity) throws Exception{
        consultaEntity.setData(consultaEntity.getData());
        consultaEntity.setEspecialidade(consultaEntity.getEspecialidade());
        consultaEntity.setMedico(consultaEntity.getMedico());
        consultaEntity.setPaciente(consultaEntity.getPaciente());
        return consultaRepository.save(consultaEntity);
    }
}
