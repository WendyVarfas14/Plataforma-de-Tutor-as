/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */


public class Docente extends Persona {
    private String especialidad;

    public Docente(String nombre, String apellido, String identificacion, String correo, String especialidad) {
        super(nombre, apellido, identificacion, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
}
