module semihburhan.seleniumintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens semihburhan.seleniumintro to javafx.fxml;
    exports semihburhan.seleniumintro;
}