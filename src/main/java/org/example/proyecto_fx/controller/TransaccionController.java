package org.example.proyecto_fx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.proyecto_fx.model.Transaccion;

public class TransaccionController {

    @FXML
    private TextField tfMonto;

    @FXML
    private Button btnGenerarRecibo;

    @FXML
    void generarRecibo() {
        double monto = Double.parseDouble(tfMonto.getText());
        // Ejemplo de crear una transacción (esto debería ser más elaborado con clientes, vehículos, etc.)
        Transaccion transaccion = new Transaccion(1, "2024-11-18", null, null, null, monto) {
            @Override
            public void generarRecibo() {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Recibo Generado");
                alert.setHeaderText(null);
                alert.setContentText("Recibo generado con monto: $" + monto);
                alert.showAndWait();
            }
        };
        transaccion.generarRecibo();
    }
}
