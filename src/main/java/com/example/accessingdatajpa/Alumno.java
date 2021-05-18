package com.example.accessingdatajpa;

import java.util.List;

// Clase asignatura
class Asignatura{
    // Atributos
    public String nombre;
    public int nota;

    public Asignatura(){

//    public Asignatura(String nombre, int nota){
//        this.nombre=nombre;
//        this.nota=nota;
    }
}

// Clase alumno
public class Alumno {
    // Atributos
    public String nombre;
    public int edad;
    public List<Asignatura> asignaturas;

    // Constructor.
    public Alumno(){

    }
//    public Alumno(String nombre, int edad, List<Asignatura> asignaturas){
//        this.nombre=nombre;
//        this.edad=edad;
//        this.asignaturas = asignaturas;
//    }

    // Añadir asignatura.
    public void addAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getNota() {
        return edad;
    }
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}


