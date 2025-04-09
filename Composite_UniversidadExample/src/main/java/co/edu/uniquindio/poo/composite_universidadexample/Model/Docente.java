package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.List;
import java.util.ArrayList;

public class Docente extends Persona implements MiembroUniversitario {

    private double sueldo;
    private String especialidad;
    private List<String> materiasAsignadas;

    public Docente(String nombre, String apellido, String id, int edad, Enum cargo, String correo,
                   double sueldo, String especialidad, List<String> materiasAsignadas) {
        super(nombre, apellido, id, edad, cargo, correo);
        this.sueldo = sueldo;
        this.especialidad = especialidad;
        this.materiasAsignadas = materiasAsignadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<String> getMateriasAsignadas() {
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(List<String> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }

    public void agregarMateria(String materia) {
        materiasAsignadas.add(materia);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + getNombre() + " " + getApellido());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Materias asignadas: ");
        for (String materia : materiasAsignadas) {
            System.out.println("- " + materia);
        }
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", sueldo=" + sueldo +
                ", materiasAsignadas=" + materiasAsignadas +
                '}';
    }

    @Override
    public Docente clone() {
        Docente clon = (Docente) super.clone();
        clon.materiasAsignadas = new ArrayList<>(this.materiasAsignadas);
        return clon;
    }



}
