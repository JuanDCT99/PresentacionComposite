package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.LinkedList;

public class Docente extends Persona implements MiembroUniversitario{

    private double Sueldo;
    private String especialidad;
    private LinkedList<String> materiasAsignadas;

    public Docente(String nombre, String id, int edad, Enum cargo, String correo, double sueldo, String especialidad, LinkedList<String> materiasAsignadas) {
        super(nombre, id, edad, cargo, correo);
        this.Sueldo = sueldo;
        this.especialidad = especialidad;
        this.materiasAsignadas = materiasAsignadas;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LinkedList<String> getMateriasAsignadas() {
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(LinkedList<String> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "Sueldo=" + Sueldo +
                ", especialidad='" + especialidad + '\'' +
                ", materiasAsignadas=" + materiasAsignadas +
                '}';
    }

    @Override
    public void mostrarInfo() {
        
    }
}
