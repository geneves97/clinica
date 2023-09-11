package com.clinica.controller;

import com.clinica.entity.ConsultaEntity;
import com.clinica.rest.RestConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsultaController {

    @Autowired
    private RestConsulta restConsulta;

    @GetMapping("consulta/{id}")
    public ConsultaEntity get(@PathVariable (value = "id") Integer id){
        return restConsulta.findById(id);
    }
    @PostMapping
    public ConsultaEntity criarConsulta(@RequestBody ConsultaEntity consultaEntity) throws Exception {
    return restConsulta.save(consultaEntity);
    }

}
