package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.util.LinkedList;

public class MostrarInformacionComponenteUniversitario {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan David", "1094881210", 20, Cargo.ESTUDIANTE, "JuanDa@gmail.com", "Ing.Sistemas", new LinkedList<>(), "Programacion II");
        Estudiante estudiante2 = new Estudiante("Camilo", "12345678", 19, Cargo.ESTUDIANTE, "CamiloRUIZ@gmail.com", "Ing.Sistemas", new LinkedList<>(), "Calculo Integral");
        Estudiante estudiante3 = new Estudiante("Erwin", "987654321", 17, Cargo.ESTUDIANTE, "ErwinHarder@gmail.com", "Ing.Sistemas", new LinkedList(), "Sistemas De Informacion");

        Docente docente1 = new Docente("Ruben", "12121212", 32, Cargo.DOCENTE, "RubenYulbrainer@gmail.com", 1423000, "POO", new LinkedList<>());
        Docente docente2 = new Docente("Julian", "675858", 45, Cargo.DOCENTE, "JulianP@gmail.com", 1450000, "Logica de Programacion", )
    }
    }