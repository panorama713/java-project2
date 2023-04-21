module com.example.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject2 to javafx.fxml;
    exports com.example.javaproject2;
    exports com.example.javaproject2.week1.day1_3;
    opens com.example.javaproject2.week1.day1_3 to javafx.fxml;
}