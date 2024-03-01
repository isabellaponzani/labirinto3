module com.labirinto3.labirinto3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.labirinto3.labirinto3 to javafx.fxml;
    exports com.labirinto3.labirinto3;
}