package co.edu.uniquindio.poo.composite_universidadexample.Model;

public class Persona implements MiembroUniversitario, Cloneable{

    private String nombre;
    private String apellido;
    private String id;
    private int edad;
    private Enum Cargo;
    private  String correo;

    public Persona(String nombre, String apellido, String id, int edad, Enum cargo, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        Cargo = cargo;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Enum getCargo() {
        return Cargo;
    }

    public void setCargo(Enum cargo) {
        Cargo = cargo;
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
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", Cargo=" + Cargo +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {

    }

    @Override
    public Persona clone() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Esto no debería ocurrir porque implementamos Cloneable
        }
    }


}
