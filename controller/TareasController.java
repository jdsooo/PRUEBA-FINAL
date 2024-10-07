package controller;

import model.Tarea;
import services.DataTareas;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareasController {
    private DataTareas dataTareas;

    public TareasController(DataTareas dataTareas) {
        this.dataTareas = dataTareas;
    }

    public void agregarTarea(String titulo, String descripcion, LocalDate fechaLimite) {
        Tarea nuevaTarea = new Tarea(titulo, descripcion, fechaLimite, "pendiente");
        dataTareas.agregarTarea(nuevaTarea);
    }

    public void eliminarTarea(String titulo) {
        dataTareas.eliminarTarea(titulo);
    }

    public ArrayList<Tarea> getTareas() {
        return dataTareas.getTareas();
    }
}
