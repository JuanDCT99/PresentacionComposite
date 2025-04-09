package co.edu.uniquindio.poo.composite_universidadexample.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MostrarInformacionComponenteUniversitario {
    public static void main(String[] args) {

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Camilo", "Ruiz", "1234567", 19, Cargo.ESTUDIANTE, "CamiloR@gmail.com", "Ingeniería de Sistemas");
        estudiante1.agregarMateria(new MateriaEstudiante("Calculo Integral", List.of(3.5, 4.3, 2.9, 5.0
                )));

        estudiante1.agregarMateria(new MateriaEstudiante("Programacion II", List.of(4.3, 3.3, 2.1, 5.0)));

        Estudiante estudiante2 = new Estudiante("Erwin", "Harder", "54321", 17, Cargo.ESTUDIANTE, "ErwinH@gmail.com", "Ingeniería de Sistemas");
        estudiante2.agregarMateria(new MateriaEstudiante("Ecuaciones Diferenciales", List.of(4.0, 3.3, 4.4, 1.2)));
        estudiante2.agregarMateria(new MateriaEstudiante("Programacion II", List.of(2.0, 2.4, 3.9, 4.2)));

        // Crear docente
        Docente docente1 = new Docente("Raul", "Rivera", "188923329", 32, Cargo.DOCENTE, "RRivera@gmail.com", 5000000, "POO", new ArrayList<>());
        docente1.agregarMateria("Programacion II");

        // Crear director de programa
        DirectorPrograma director = new DirectorPrograma("Luis", "Salazar", "100999090", 40, Cargo.DIRECTORPROGRAMA, "LuisSala@gmail.com");
        director.agregarDocente(docente1);
        director.agregarEstudiante(estudiante1);
        director.agregarEstudiante(estudiante2);

        // Crear decano
        Decano decano = new Decano("Marta", "Ruiz", "DEC001", 45, Cargo.DECANO, "marta@uq.edu.co", "Facultad de Ingeniería");
        decano.agregarDirectorPrograma(director);

        // Crear rector
        Rector rector = new Rector("José", "Martínez", "REC001", 55, Cargo.RECTOR, "jose@uq.edu.co", LocalDate.of(2025, 1, 3), LocalDate.of(2030, 12, 31), 12000000);
        rector.agregarDecano(decano);

        // Mostrar información original
        System.out.println("===== UNIVERSIDAD ORIGINAL =====");
        rector.mostrarInfo();

        // Clonar rector
        Rector rectorClon = rector.clone();

        /*

        System.out.println("\n===== UNIVERSIDAD CLONADA =====");
        rectorClon.mostrarInfo();

         */
    }
}
