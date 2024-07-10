module com.kensoftph.javafxlinechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.javafxlinechart to javafx.fxml;
    exports com.kensoftph.javafxlinechart;
}