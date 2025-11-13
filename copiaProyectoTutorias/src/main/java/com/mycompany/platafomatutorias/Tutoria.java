/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */



public class Tutoria {
    private Tutor tutor;
    private Estudiante estudiante;
    private Materia materia;
    private Horario horario;

    public Tutoria(Tutor tutor, Estudiante estudiante, Materia materia, Horario horario) {
        this.tutor = tutor;
        this.estudiante = estudiante;
        this.materia = materia;
        this.horario = horario;
    }

    public void mostrarTutoria() {
        System.out.println("Tutoría de " + materia.getNombre());
        System.out.println("Tutor: " + tutor.getNombre());
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Horario: " + horario.toString());
    }
}
