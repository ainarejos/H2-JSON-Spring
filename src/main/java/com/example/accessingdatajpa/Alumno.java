package com.example.accessingdatajpa;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

// Clase asignatura
@Entity
class Asignatura{
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private int nota;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }




}

// Clase alumno
@Entity
public class Alumno {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;
    private String nombre;
    private int edad;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Asignatura> asignaturas;


    // Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

}


