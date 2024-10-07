package view;

import controller.TareasController;
import services.DataTareas;
import model.Tarea;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TareasView extends JFrame {
    private TareasController controller;
    private JPanel panelTareas;

    public TareasView() {
        controller = new TareasController(new DataTareas());
        initUI();
        cargarTareas();
    }

    private void initUI() {
        setTitle("Examen");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelControles = new JPanel();
        panelControles.setLayout(new BoxLayout(panelControles, BoxLayout.Y_AXIS)); // Cambiado a BoxLayout vertical

        JButton agregarTareaButton = new JButton("Agregar Tarea");
        JButton eliminarTareaButton = new JButton("Eliminar Tarea");
        JButton PapeleraTareaButton = new JButton("Ppelera Tarea");

        panelControles.add(PapeleraTareaButton);
        panelControles.add(agregarTareaButton);
        panelControles.add(eliminarTareaButton);
        panelControles.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciador

        add(panelControles, BorderLayout.WEST);

        panelTareas = new JPanel();
        panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panelTareas);

        JPanel panelCentro = new JPanel(new BorderLayout());
        panelCentro.add(scrollPane, BorderLayout.CENTER);
        panelCentro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Espaciado

        add(panelCentro, BorderLayout.CENTER);

        setVisible(true);
    }

    private void cargarTareas() {
        List<Tarea> tareas = controller.getTareas();
        for (Tarea tarea : tareas) {
            TareaView tareaView = new TareaView(tarea);
            panelTareas.add(tareaView);
        }
        panelTareas.revalidate();
        panelTareas.repaint();
    }
}
