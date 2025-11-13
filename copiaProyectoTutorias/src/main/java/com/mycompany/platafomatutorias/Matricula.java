/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */


public class Matricula {
    private Estudiante estudiante;
    private Curso curso;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return estudiante.getNombre() + " matriculado en " + curso.getMateria().getNombre();
    }
}
