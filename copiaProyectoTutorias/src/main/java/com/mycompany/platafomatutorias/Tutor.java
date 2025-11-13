/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */


public class Tutor extends Docente {
    private String areaApoyo;

    public Tutor(String nombre, String apellido, String identificacion, String correo, String especialidad, String areaApoyo) {
        super(nombre, apellido, identificacion, correo, especialidad);
        this.areaApoyo = areaApoyo;
    }

    public String getAreaApoyo() {
        return areaApoyo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Área de apoyo: " + areaApoyo);
    }
}
