/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String apellido, String identificacion, String correo, String carrera, int semestre) {
        super(nombre, apellido, identificacion, correo);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
