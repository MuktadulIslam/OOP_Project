package OOP_Project_Test1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main6 extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
//            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
