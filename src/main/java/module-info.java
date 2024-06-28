module com.relevator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.relevator to javafx.fxml;
    exports com.relevator;
    exports com.relevator.elevator.controller;
    opens com.relevator.elevator.controller to javafx.fxml;
    exports com.relevator.elevator;
    opens com.relevator.elevator to javafx.fxml;
}
