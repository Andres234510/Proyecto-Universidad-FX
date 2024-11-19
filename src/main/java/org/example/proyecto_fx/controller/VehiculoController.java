package org.example.proyecto_fx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.proyecto_fx.model.SedanHibrido;

public class VehiculoController {

    @FXML
    private TextField tfPlaca;

    @FXML
    private TextField tfMarca;

    @FXML
    private TextField tfModelo;

    @FXML
    private TextField tfPrecio;

    @FXML
    private Label lblCaracteristicas;

    @FXML
    void mostrarCaracteristicas() {
        SedanHibrido vehiculo = new SedanHibrido(50, 40, 600, 100, "Híbrido", 15,
                tfPlaca.getText(), tfMarca.getText(), tfModelo.getText(),
                Double.parseDouble(tfPrecio.getText()), 5, 400, 6);
        vehiculo.mostrarCaracteristicas();
        lblCaracteristicas.setText("Características cargadas!");
    }
}
