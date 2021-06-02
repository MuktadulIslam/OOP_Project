package OOP_Project_Test1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Test implements Initializable {
    @FXML
    private Pane pane;
    @FXML
    private PasswordField password;
    @FXML
    void enter(ActionEvent event) {
        String pw = password.getText();
        System.out.println(pw);
        String message;
        Label text = new Label();

        if(pw.compareTo("iit123") == 0) {
            text.setText("You entered right password");
            text.setTextFill(Color.GREEN);
        }
        else {
            text.setText("Wrong password! Try again.....");
            text.setTextFill(Color.RED);
        }

        text.setLayoutX(178.0);
        text.setLayoutY(204.0);
        text.setPrefHeight(42.0);
        text.setPrefWidth(319.0);
        text.setFont(new Font(16));
        pane.getChildren().add(text);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
