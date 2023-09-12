package com.clinica.controller;

import com.clinica.entity.ConsultaEntity;
import com.clinica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @PostMapping("/consulta")
    public ConsultaEntity criarConsulta(@RequestBody ConsultaEntity consultaEntity) throws Exception {
        return consultaService.saveConsulta(consultaEntity);
    }

    @GetMapping("/consulta/{id}")
    public ConsultaEntity get(@PathVariable (value = "id") Integer id){
        return consultaService.findConsultaById(id);
    }

    @GetMapping("/consulta")
    public List<ConsultaEntity> get() {
        return consultaService.findAllConsultas();
    }
}
