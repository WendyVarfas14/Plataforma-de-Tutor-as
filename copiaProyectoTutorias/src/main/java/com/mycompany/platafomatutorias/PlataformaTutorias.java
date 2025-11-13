/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */

import java.util.ArrayList;

public class PlataformaTutorias {
    private final ArrayList<Tutoria> tutorias;

    public PlataformaTutorias() {
        tutorias = new ArrayList<>();
    }

    public void registrarTutoria(Tutoria tutoria) {
        tutorias.add(tutoria);
        System.out.println("\n✅ Tutoría registrada exitosamente.");
    }

    public void listarTutorias() {
        if (tutorias.isEmpty()) {
            System.out.println("📭 No hay tutorías registradas.");
        } else {
            for (int i = 0; i < tutorias.size(); i++) {
                System.out.println("\nTutoría #" + (i + 1));
                System.out.println("----------------------");
                tutorias.get(i).mostrarTutoria();
            }
        }
    }

    ArrayList<Tutoria> getTutorias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



