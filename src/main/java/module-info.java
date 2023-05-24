module com.example.contacts {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.xml;

    opens com.example.contacts to javafx.fxml;
    exports com.example.contacts;

    // Had to be added manually !!! Threw exception
    opens com.example.contacts.datamodel;
}