/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */


public class Curso {
    private Materia materia;
    private Docente docente;

    public Curso(Materia materia, Docente docente) {
        this.materia = materia;
        this.docente = docente;
    }

    public Materia getMateria() {
        return materia;
    }

    public Docente getDocente() {
        return docente;
    }

    @Override
    public String toString() {
        return "Curso: " + materia + " - Docente: " + docente.getNombre();
    }
}
