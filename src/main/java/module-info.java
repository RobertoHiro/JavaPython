module br.com.abctechnology.javapython {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.abctechnology.javapython to javafx.fxml;
    exports br.com.abctechnology.javapython;
}