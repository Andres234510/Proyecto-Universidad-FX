package org.example.proyecto_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Asegúrate de que la ruta al archivo FXML sea correcta
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/proyecto_fx/view/main_view.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Proyecto JavaFX");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al cargar el archivo FXML");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
