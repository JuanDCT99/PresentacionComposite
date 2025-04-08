package co.edu.uniquindio.poo.composite_universidadexample.Model;

public class Persona {

    private String nombre;
    private String id;
    private int edad;
    private Enum Cargo;
    private  String correo;

    public Persona(String nombre, String id, int edad,Enum cargo ,String correo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.Cargo = cargo;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Enum getCargo(Enum cargo) {
        return Cargo;
    }

    public void setCargo(Enum cargo) {
        this.Cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}
