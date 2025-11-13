/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cómo deseas ejecutar el sistema?");
        System.out.println("1. Consola");
        System.out.println("2. Interfaz gráfica");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            ejecutarConsola();
        } else {
            javax.swing.SwingUtilities.invokeLater(() -> {
                ventanaSistema ventana = new ventanaSistema();
                ventana.setVisible(true);
            });
        }

        sc.close();
    }

    private static void ejecutarConsola() {
        Scanner sc = new Scanner(System.in);
        PlataformaTutorias plataforma = new PlataformaTutorias();
        int opcion;

        do {
            System.out.println("\n===============================");
            System.out.println("     SISTEMA DE TUTORÍAS");
            System.out.println("===============================");
            System.out.println("1. Registrar tutoría");
            System.out.println("2. Ver todas las tutorías");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Registro de Tutoría ---");

                    System.out.print("Nombre del estudiante: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Apellido del estudiante: ");
                    String apellidoE = sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    System.out.print("Semestre: ");
                    int semestre = sc.nextInt();
                    sc.nextLine();

                    Estudiante estudiante = new Estudiante(nombreE, apellidoE, "E-" + (int)(Math.random()*1000),
                            nombreE.toLowerCase() + "@gmail.com", carrera, semestre);

                    System.out.print("\nNombre del tutor: ");
                    String nombreT = sc.nextLine();
                    System.out.print("Apellido del tutor: ");
                    String apellidoT = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();
                    System.out.print("Área de apoyo: ");
                    String areaApoyo = sc.nextLine();

                    Tutor tutor = new Tutor(nombreT, apellidoT, "T-" + (int)(Math.random()*1000),
                            nombreT.toLowerCase() + "@uni.edu", especialidad, areaApoyo);

                    System.out.print("\nNombre de la materia: ");
                    String nombreM = sc.nextLine();
                    System.out.print("Código de la materia: ");
                    String codigoM = sc.nextLine();
                    Materia materia = new Materia(nombreM, codigoM);

                    System.out.print("\nDía de la tutoría: ");
                    String dia = sc.nextLine();
                    System.out.print("Hora inicio: ");
                    String horaInicio = sc.nextLine();
                    System.out.print("Hora fin: ");
                    String horaFin = sc.nextLine();
                    Horario horario = new Horario(dia, horaInicio, horaFin);

                    Tutoria tutoria = new Tutoria(tutor, estudiante, materia, horario);
                    plataforma.registrarTutoria(tutoria);
                    break;

                case 2:
                    System.out.println("\n--- Lista de Tutorías ---");
                    plataforma.listarTutorias();
                    break;

                case 3:
                    System.out.println("\n👋 ¡Gracias por usar el sistema de tutorías!");
                    break;

                default:
                    System.out.println("\n⚠️ Opción inválida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
