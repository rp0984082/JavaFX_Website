module org.example.javafx_website {
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;


    opens org.example.javafx_website to javafx.fxml;
    exports org.example.javafx_website;
}