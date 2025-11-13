/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platafomatutorias;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ventanaSistema extends JFrame {

    private JTextField txtNombreE, txtApellidoE, txtCarrera, txtSemestre;
    private JTextField txtNombreT, txtApellidoT, txtEspecialidad, txtAreaApoyo;
    private JTextField txtMateria, txtCodigoM, txtDia, txtInicio, txtFin;
    private JTextArea txtResultado;
    private JButton btnRegistrar, btnVer, btnSalir;

    private PlataformaTutorias plataforma;

    public ventanaSistema() {
        plataforma = new PlataformaTutorias();

        setTitle("Sistema de Tutorías");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de formulario
        JPanel panelForm = new JPanel(new GridLayout(11, 2, 5, 5));
        panelForm.setBorder(BorderFactory.createTitledBorder("Registro de Tutoría"));

        // Campos del estudiante
        panelForm.add(new JLabel("Nombre del estudiante:"));
        txtNombreE = new JTextField(); panelForm.add(txtNombreE);

        panelForm.add(new JLabel("Apellido del estudiante:"));
        txtApellidoE = new JTextField(); panelForm.add(txtApellidoE);

        panelForm.add(new JLabel("Carrera:"));
        txtCarrera = new JTextField(); panelForm.add(txtCarrera);

        panelForm.add(new JLabel("Semestre:"));
        txtSemestre = new JTextField(); panelForm.add(txtSemestre);

        // Campos del tutor
        panelForm.add(new JLabel("Nombre del tutor:"));
        txtNombreT = new JTextField(); panelForm.add(txtNombreT);

        panelForm.add(new JLabel("Apellido del tutor:"));
        txtApellidoT = new JTextField(); panelForm.add(txtApellidoT);

        panelForm.add(new JLabel("Especialidad:"));
        txtEspecialidad = new JTextField(); panelForm.add(txtEspecialidad);

        panelForm.add(new JLabel("Área de apoyo:"));
        txtAreaApoyo = new JTextField(); panelForm.add(txtAreaApoyo);

        // Materia y horario
        panelForm.add(new JLabel("Materia:"));
        txtMateria = new JTextField(); panelForm.add(txtMateria);

        panelForm.add(new JLabel("Código de materia:"));
        txtCodigoM = new JTextField(); panelForm.add(txtCodigoM);

        panelForm.add(new JLabel("Día de tutoría:"));
        txtDia = new JTextField(); panelForm.add(txtDia);

        panelForm.add(new JLabel("Hora inicio (ej: 8:00 AM):"));
        txtInicio = new JTextField(); panelForm.add(txtInicio);

        panelForm.add(new JLabel("Hora fin (ej: 10:00 AM):"));
        txtFin = new JTextField(); panelForm.add(txtFin);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        btnRegistrar = new JButton("Registrar");
        btnVer = new JButton("Ver Tutorías");
        btnSalir = new JButton("Salir");

        panelBotones.add(btnRegistrar);
        panelBotones.add(btnVer);
        panelBotones.add(btnSalir);

        // Área de resultados
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);

        // Añadir todo al frame
        add(panelForm, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        // --- Eventos ---
        btnRegistrar.addActionListener(e -> registrarTutoria());
        btnVer.addActionListener(e -> mostrarTutorias());
        btnSalir.addActionListener(e -> dispose());
    }

    private void registrarTutoria() {
        try {
            Estudiante est = new Estudiante(
                txtNombreE.getText(),
                txtApellidoE.getText(),
                "E-" + (int)(Math.random()*1000),
                txtNombreE.getText().toLowerCase() + "@gmail.com",
                txtCarrera.getText(),
                Integer.parseInt(txtSemestre.getText())
            );

            Tutor tutor = new Tutor(
                txtNombreT.getText(),
                txtApellidoT.getText(),
                "T-" + (int)(Math.random()*1000),
                txtNombreT.getText().toLowerCase() + "@uni.edu",
                txtEspecialidad.getText(),
                txtAreaApoyo.getText()
            );

            Materia mat = new Materia(txtMateria.getText(), txtCodigoM.getText());
            Horario horario = new Horario(txtDia.getText(), txtInicio.getText(), txtFin.getText());

            Tutoria tut = new Tutoria(tutor, est, mat, horario);
            plataforma.registrarTutoria(tut);

            JOptionPane.showMessageDialog(this, "✅ Tutoría registrada correctamente.");
            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "⚠️ Error: " + ex.getMessage());
        }
    }

    private void mostrarTutorias() {
        txtResultado.setText("");
        ArrayList<Tutoria> lista = plataforma.getTutorias();

        if (lista.isEmpty()) {
            txtResultado.setText("No hay tutorías registradas.");
        } else {
            for (Tutoria t : lista) {
                txtResultado.append(t.toString() + "\n---------------------------\n");
            }
        }
    }

    private void limpiarCampos() {
        txtNombreE.setText("");
        txtApellidoE.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
        txtNombreT.setText("");
        txtApellidoT.setText("");
        txtEspecialidad.setText("");
        txtAreaApoyo.setText("");
        txtMateria.setText("");
        txtCodigoM.setText("");
        txtDia.setText("");
        txtInicio.setText("");
        txtFin.setText("");
    }
}