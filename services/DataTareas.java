package services;

import model.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataTareas {
    private ArrayList<Tarea> tareas;

    public DataTareas() {
        tareas = new ArrayList<>();
        tareas.add(new Tarea("Tarea 1", "Descripción 1", LocalDate.now().plusDays(1), "pendiente"));
        tareas.add(new Tarea("Tarea 2", "Descripción 2", LocalDate.now().plusDays(2), "en progreso"));
        tareas.add(new Tarea("Tarea 3", "Descripción 3", LocalDate.now().plusDays(3), "completada"));
        tareas.add(new Tarea("Tarea 4", "Descripción 4", LocalDate.now().plusDays(4), "pendiente"));
        tareas.add(new Tarea("Tarea 5", "Descripción 5", LocalDate.now().plusDays(5), "en progreso"));
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(String titulo) {
        tareas.removeIf(tarea -> tarea.getTitulo().equalsIgnoreCase(titulo));
    }
}
