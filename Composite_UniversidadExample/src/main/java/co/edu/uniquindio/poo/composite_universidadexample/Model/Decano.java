package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.LinkedList;

public class Decano extends Persona implements MiembroUniversitario {


    private String facultades;
    private LinkedList<MiembroUniversitario> DirectorPrograma;

    public Decano(String nombre, String id, int edad, Enum cargo, String correo, LinkedList<MiembroUniversitario> directorPrograma, String facultades) {
        super(nombre, id, edad, cargo, correo);
        this.DirectorPrograma = directorPrograma;
        this.facultades = facultades;
    }

    public String getFacultades() {
        return facultades;
    }

    public void setFacultades(String facultades) {
        this.facultades = facultades;
    }

    public LinkedList<MiembroUniversitario> getDirectorPrograma() {
        return DirectorPrograma;
    }

    public void setDirectorPrograma(LinkedList<MiembroUniversitario> directorPrograma) {
        DirectorPrograma = directorPrograma;
    }

    @Override
    public void mostrarInfo() {

    }

    @Override
    public String toString() {
        return "Decano{" +
                "facultades='" + facultades + '\'' +
                ", DirectorPrograma=" + DirectorPrograma +
                '}';
    }
}
