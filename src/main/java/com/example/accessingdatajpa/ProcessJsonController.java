package com.example.accessingdatajpa;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class ProcessJsonController {


    @Autowired
    private AlumnoRepository repository;

    @GetMapping("/json")
    public String getjson(String name, String edad) {
        return "form";
    }

    @PostMapping("/json")
    public String processjson(String myJsonString, Model model) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Alumno alumno = om.readValue((myJsonString), Alumno.class);
        repository.save(alumno);
        model.addAttribute("id", alumno.getId());
        model.addAttribute("nombre", alumno.getNombre());
        model.addAttribute("edad", alumno.getEdad());
        return "sout";
    }




}