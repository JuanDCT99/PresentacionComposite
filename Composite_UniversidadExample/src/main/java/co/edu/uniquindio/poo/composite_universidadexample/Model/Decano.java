package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.ArrayList;
import java.util.List;

public class Decano extends Persona implements MiembroUniversitario, Cloneable {

    private String facultad;
    private List<MiembroUniversitario> directoresPrograma;

    public Decano(String nombre, String apellido, String id, int edad, Enum cargo, String correo, String facultad) {
        super(nombre, apellido, id, edad, cargo, correo);
        this.facultad = facultad;
        this.directoresPrograma = new ArrayList<>();
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public List<MiembroUniversitario> getDirectoresPrograma() {
        return directoresPrograma;
    }

    public void setDirectoresPrograma(List<MiembroUniversitario> directoresPrograma) {
        this.directoresPrograma = directoresPrograma;
    }

    public void agregarDirectorPrograma(MiembroUniversitario director) {
        directoresPrograma.add(director);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Decano: " + getNombre() + " " + getApellido());
        System.out.println("Facultad: " + facultad);
        System.out.println("Correo: " + getCorreo());
        System.out.println("Directores de programa:");
        for (MiembroUniversitario director : directoresPrograma) {
            director.mostrarInfo();
        }
    }

    @Override
    public String toString() {
        return "Decano{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", facultad='" + facultad + '\'' +
                ", directoresPrograma=" + directoresPrograma +
                '}';
    }

    @Override
    public Decano clone() {
        Decano clon = (Decano) super.clone();

        List<MiembroUniversitario> directoresClon = new ArrayList<>();
        for (MiembroUniversitario dir : this.directoresPrograma) {
            directoresClon.add(((Persona) dir).clone());
        }
        clon.directoresPrograma = directoresClon;

        return clon;
    }


}
