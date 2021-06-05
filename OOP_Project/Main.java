package OOP_Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login/Login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("MRF Hospital & Diagnostic Centre");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("OOP_Project/icon.png"));
        primaryStage.show();
    }

}

