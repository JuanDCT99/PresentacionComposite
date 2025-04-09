package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DirectorPrograma extends Persona implements MiembroUniversitario, Cloneable {

    private List<MiembroUniversitario> docentes;
    private List<MiembroUniversitario> estudiantes;

    public DirectorPrograma(String nombre, String apellido, String id, int edad, Enum cargo, String correo) {
        super(nombre, apellido, id, edad, cargo, correo);
        this.docentes = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public List<MiembroUniversitario> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<MiembroUniversitario> docentes) {
        this.docentes = docentes;
    }

    public List<MiembroUniversitario> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<MiembroUniversitario> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarDocente(MiembroUniversitario docente) {
        docentes.add(docente);
    }

    public void agregarEstudiante(MiembroUniversitario estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Director de Programa: " + getNombre() + " " + getApellido());
        System.out.println("Correo: " + getCorreo());

        System.out.println("Docentes:");
        for (MiembroUniversitario docente : docentes) {
            docente.mostrarInfo();
        }

        System.out.println("Estudiantes:");
        for (MiembroUniversitario estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }

    @Override
    public String toString() {
        return "DirectorPrograma{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", docentes=" + docentes +
                ", estudiantes=" + estudiantes +
                '}';
    }

    @Override
    public DirectorPrograma clone() {
        DirectorPrograma clon = (DirectorPrograma) super.clone();

        List<MiembroUniversitario> docentesClon = new ArrayList<>();
        for (MiembroUniversitario d : this.docentes) {
            docentesClon.add(((Persona) d).clone()); // asegúrate que todos los elementos sean Cloneables
        }

        List<MiembroUniversitario> estudiantesClon = new ArrayList<>();
        for (MiembroUniversitario e : this.estudiantes) {
            estudiantesClon.add(((Persona) e).clone());
        }

        clon.docentes = docentesClon;
        clon.estudiantes = estudiantesClon;

        return clon;
    }


}
