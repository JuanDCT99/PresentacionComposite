package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.ArrayList;
import java.util.List;

public class MateriaEstudiante implements Cloneable {
    private String nombre;
    private List<Double> notas;

    public MateriaEstudiante(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    @Override
    public String toString() {
        return nombre + " " + notas;
    }

    @Override
    public MateriaEstudiante clone() {
        try {
            MateriaEstudiante clon = (MateriaEstudiante) super.clone();
            clon.notas = new ArrayList<>(this.notas);
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
