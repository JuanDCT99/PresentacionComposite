package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.LinkedList;

public class DirectorPrograma extends Persona implements MiembroUniversitario{

    private LinkedList<MiembroUniversitario> Docentes;
    private LinkedList<MiembroUniversitario> Estudiantes;

    public DirectorPrograma(String nombre, String id, int edad, Enum cargo, String correo, LinkedList<MiembroUniversitario> docentes, LinkedList<MiembroUniversitario> estudiantes) {
        super(nombre, id, edad, cargo, correo);
        this.Docentes = docentes;
        this.Estudiantes = estudiantes;
    }

    public LinkedList<MiembroUniversitario> getDocentes() {
        return Docentes;
    }

    public void setDocentes(LinkedList<MiembroUniversitario> docentes) {
        Docentes = docentes;
    }

    public LinkedList<MiembroUniversitario> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(LinkedList<MiembroUniversitario> estudiantes) {
        Estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "DirectorPrograma{" +
                "Docentes=" + Docentes +
                ", Estudiantes=" + Estudiantes +
                '}';
    }

    @Override
    public void mostrarInfo() {

    }
}
