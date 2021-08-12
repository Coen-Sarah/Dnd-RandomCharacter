module com.example.dndrandomcharacter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dndrandomcharacter to javafx.fxml;
    exports com.example.dndrandomcharacter;
    exports com.example.dndrandomcharacter.Classes;
    opens com.example.dndrandomcharacter.Classes to javafx.fxml;
    exports com.example.dndrandomcharacter.Races;
    opens com.example.dndrandomcharacter.Races to javafx.fxml;
    exports com.example.dndrandomcharacter.Stat;
    opens com.example.dndrandomcharacter.Stat to javafx.fxml;
}