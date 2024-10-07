package view;

import services.DataTareas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EliminarTareaView extends JPanel {
    private JTextField tituloField;
    private JButton eliminarButton;

    public EliminarTareaView(DataTareas dataTareas) {
        tituloField = new JTextField(10);
        eliminarButton = new JButton("Eliminar Tarea");

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = tituloField.getText();
                dataTareas.eliminarTarea(titulo);
            }
        });

        add(new JLabel("Título de la Tarea a Eliminar:"));
        add(tituloField);
        add(eliminarButton);
    }
}
