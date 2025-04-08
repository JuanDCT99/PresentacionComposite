package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.LinkedList;

public class Estudiante extends Persona implements MiembroUniversitario{

    private String carrera;
    private LinkedList<NotasEstudiantes> notas;
    private String materias;

    public Estudiante(String nombre, String id, int edad, Enum cargo, String correo, String carrera ,LinkedList notas, String materias) {
        super(nombre, id, edad, cargo, correo);
        this.notas = notas;
        this.carrera = carrera;
        this.materias = materias;
    }

    public LinkedList<NotasEstudiantes> getNotas() {
        return notas;
    }

    public void setNotas(LinkedList<NotasEstudiantes> notas) {
        this.notas = notas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;

    }


    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }


    @Override
    public void mostrarInfo() {

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", notas=" + notas +
                ", materias='" + materias + '\'' +
                '}';
    }
}
