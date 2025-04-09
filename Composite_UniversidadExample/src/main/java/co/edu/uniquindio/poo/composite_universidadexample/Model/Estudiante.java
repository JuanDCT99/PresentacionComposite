package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements MiembroUniversitario, Cloneable {

    private String carrera;
    private List<MateriaEstudiante> materias;

    public Estudiante(String nombre, String apellido, String id, int edad, Enum cargo, String correo,
                      String carrera) {
        super(nombre, apellido, id, edad, cargo, correo);
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<MateriaEstudiante> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaEstudiante> materias) {
        this.materias = materias;
    }

    public void agregarMateria(MateriaEstudiante materia) {
        materias.add(materia);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + getNombre() + " " + getApellido());
        System.out.println("Carrera: " + carrera);
        System.out.println("Materias:");
        for (MateriaEstudiante materia : materias) {
            System.out.println(" - " + materia.getNombre() + ": " + materia.getNotas());
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", carrera='" + carrera + '\'' +
                ", materias=" + materias +
                '}';
    }

    @Override
    public Estudiante clone() {
        Estudiante clon = (Estudiante) super.clone();
        List<MateriaEstudiante> materiasClonadas = new ArrayList<>();
        for (MateriaEstudiante materia : this.materias) {
            materiasClonadas.add(materia.clone());
        }
        clon.materias = materiasClonadas;
        return clon;
    }


}
