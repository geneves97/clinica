package com.clinica.controller;

import com.clinica.entity.ConsultaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaController {

    @Autowired
    private ConsultaBusiness consultaBusiness;

    @PostMapping
    public ConsultaEntity criarConsulta(@RequestBody ConsultaEntity consultaEntity) throws Exception {
    return consultaBusiness.save(consultaEntity);
    }

}
