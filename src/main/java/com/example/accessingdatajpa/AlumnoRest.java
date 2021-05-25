package com.example.accessingdatajpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoRest {

    @Autowired
    private AlumnoRepository repository;

    @GetMapping(value = "/id",produces = "application/json")
    public String getAlumno(@RequestParam(name = "id",required = true,defaultValue = "0") int id) throws JsonProcessingException, JsonProcessingException {
        Alumno alumno = repository.findById(id);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(alumno);
    }
}
