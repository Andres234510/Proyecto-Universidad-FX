package org.example.proyecto_fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button btnMostrarVehiculos;

    @FXML
    void mostrarVehiculos(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Aquí se mostrarían los vehículos disponibles.");
        alert.showAndWait();
    }
}

