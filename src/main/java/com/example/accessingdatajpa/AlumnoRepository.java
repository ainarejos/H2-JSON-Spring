package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    Alumno findByNombre(String nombre);
    Alumno findById(int id);
}
