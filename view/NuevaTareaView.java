package view;

import model.Tarea;
import services.DataTareas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class NuevaTareaView extends JPanel {
    private JTextField tituloField;
    private JTextField descripcionField;
    private JTextField fechaField;
    private JButton agregarButton;

    public NuevaTareaView(DataTareas dataTareas) {
        tituloField = new JTextField(10);
        descripcionField = new JTextField(10);
        fechaField = new JTextField(10);
        agregarButton = new JButton("Agregar Tarea");

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = tituloField.getText();
                String descripcion = descripcionField.getText();
                LocalDate fechaLimite = LocalDate.parse(fechaField.getText());
                Tarea nuevaTarea = new Tarea(titulo, descripcion, fechaLimite, "pendiente");
                dataTareas.agregarTarea(nuevaTarea);
            }
        });

        add(new JLabel("Título:"));
        add(tituloField);
        add(new JLabel("Descripción:"));
        add(descripcionField);
        add(new JLabel("Fecha Límite:"));
        add(fechaField);
        add(agregarButton);
    }
}
