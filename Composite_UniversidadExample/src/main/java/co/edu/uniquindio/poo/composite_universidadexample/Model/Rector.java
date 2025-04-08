package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Rector extends Persona implements MiembroUniversitario{

    private LocalDate PeriodoInicio;
    private LocalDate PeriodoFinal;
    private double sueldo;
    private LinkedList<MiembroUniversitario> Decanos;

    public Rector(String nombre, String id, int edad, Enum cargo, String correo, LocalDate periodoInicio, LocalDate periodoFinal, double sueldo, LinkedList<MiembroUniversitario> decanos) {
        super(nombre, id, edad, cargo, correo);
        this.PeriodoInicio = periodoInicio;
        this.PeriodoFinal = periodoFinal;
        this.sueldo = sueldo;
        Decanos = decanos;
    }

    public LocalDate getPeriodoInicio() {
        return PeriodoInicio;
    }

    public void setPeriodoInicio(LocalDate periodoInicio) {
        PeriodoInicio = periodoInicio;
    }

    public LocalDate getPeriodoFinal() {
        return PeriodoFinal;
    }

    public void setPeriodoFinal(LocalDate periodoFinal) {
        PeriodoFinal = periodoFinal;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LinkedList<MiembroUniversitario> getDecanos() {
        return Decanos;
    }

    public void setDecanos(LinkedList<MiembroUniversitario> decanos) {
        Decanos = decanos;
    }

    @Override
    public void mostrarInfo() {

    }

    @Override
    public String toString() {
        return "Rector{" +
                "PeriodoInicio=" + PeriodoInicio +
                ", PeriodoFinal=" + PeriodoFinal +
                ", sueldo=" + sueldo +
                ", Decanos=" + Decanos +
                '}';
    }
}
