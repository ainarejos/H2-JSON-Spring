package com.example.accessingdatajpa;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class ProcessJsonController {

    public ProcessJsonController(){

    }

    @GetMapping("/json")
    public String getjson(String name, String edad) {
        return "form";
    }

    @PostMapping("/json")
    public String processjson(String myJsonString, Model model) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Alumno alumno = om.readValue((myJsonString), Alumno.class);
        model.addAttribute("nombre", alumno.getNombre());
        return "sout";
    }




}