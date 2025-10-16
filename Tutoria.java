/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */

/**
 * Clase Tutoria
 * Representa una tutoría programada entre un estudiante y un tutor
 */
public class Tutoria {
    private Estudiante estudiante;
    private Tutor tutor;
    private String materia;
    private String fecha;

    /**
     * Constructor de Tutoria
     * @param estudiante Estudiante que solicita la tutoría
     * @param tutor Tutor asignado
     * @param materia Materia de la tutoría
     * @param fecha Fecha acordada
     */
    public Tutoria(Estudiante estudiante, Tutor tutor, String materia, String fecha) {
        this.estudiante = estudiante;
        this.tutor = tutor;
        this.materia = materia;
        this.fecha = fecha;
    }

    /**
     * Muestra los detalles de la tutoría programada
     */
    public void mostrarDetalle() {
        System.out.println("Tutoría en " + materia + " el " + fecha);
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Tutor: " + tutor.nombre);
    }
}
