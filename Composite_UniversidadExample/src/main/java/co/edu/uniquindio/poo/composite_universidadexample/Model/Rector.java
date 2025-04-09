package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rector extends Persona implements MiembroUniversitario, Cloneable {

    private LocalDate periodoInicio;
    private LocalDate periodoFinal;
    private double sueldo;
    private List<MiembroUniversitario> decanos;

    public Rector(String nombre, String apellido, String id, int edad, Enum cargo, String correo,
                  LocalDate periodoInicio, LocalDate periodoFinal, double sueldo) {
        super(nombre, apellido, id, edad, cargo, correo);
        this.periodoInicio = periodoInicio;
        this.periodoFinal = periodoFinal;
        this.sueldo = sueldo;
        this.decanos = new ArrayList<>();
    }

    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(LocalDate periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public LocalDate getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(LocalDate periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<MiembroUniversitario> getDecanos() {
        return decanos;
    }

    public void setDecanos(List<MiembroUniversitario> decanos) {
        this.decanos = decanos;
    }

    public void agregarDecano(MiembroUniversitario decano) {
        decanos.add(decano);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Rector: " + getNombre() + " " + getApellido());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Periodo: " + periodoInicio + " - " + periodoFinal);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Decanos:");
        for (MiembroUniversitario decano : decanos) {
            decano.mostrarInfo(); // llamado recursivo, típico del patrón Composite
        }
    }

    @Override
    public String toString() {
        return "Rector{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", periodoInicio=" + periodoInicio +
                ", periodoFinal=" + periodoFinal +
                ", sueldo=" + sueldo +
                ", decanos=" + decanos +
                '}';
    }

    @Override
    public Rector clone() {
        Rector clon = (Rector) super.clone();

        List<MiembroUniversitario> decanosClon = new ArrayList<>();
        for (MiembroUniversitario decano : this.decanos) {
            if (decano instanceof Persona) {
                decanosClon.add(((Persona) decano).clone());
            } else {

                decanosClon.add(decano);
            }
        }

        clon.decanos = decanosClon;
        return clon;
    }

}
