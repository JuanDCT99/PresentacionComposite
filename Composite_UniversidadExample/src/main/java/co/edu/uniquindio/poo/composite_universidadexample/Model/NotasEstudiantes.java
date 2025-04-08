package co.edu.uniquindio.poo.composite_universidadexample.Model;

public class NotasEstudiantes {

    private double notas;

    public NotasEstudiantes(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "NotasEstudiantes{" +
                "notas=" + notas +
                '}';
    }
}
