package view;

import model.Tarea;

import javax.swing.*;

public class TareaView extends JPanel {
    public TareaView(Tarea tarea) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new JLabel(tarea.getTitulo()));
        add(new JLabel(tarea.getDescripcion()));
        add(new JLabel(tarea.getFechaLimite().toString()));
        add(new JLabel(tarea.getEstado()));
    }
}