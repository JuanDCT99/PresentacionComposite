module co.edu.uniquindio.poo.composite_universidadexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.composite_universidadexample to javafx.fxml;
    exports co.edu.uniquindio.poo.composite_universidadexample;
}