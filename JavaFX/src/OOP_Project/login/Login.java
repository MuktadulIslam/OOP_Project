package OOP_Project.login;

import OOP_Project.PopUpBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Login implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private Pane pane;

    @FXML
    private PasswordField password;

    @FXML
    void login(ActionEvent event) throws IOException {

        String getPassword = password.getText();

        File file = new File("password.txt");
        Scanner scanner = new Scanner(file);
        String pass  = scanner.nextLine();

        if(getPassword.compareTo(pass) == 0){
            Stage stage = (Stage) pane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../Management.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        else {
            PopUpBox popUpBox = new PopUpBox();
            popUpBox.error("Error!!!!","Wrong password! Try again.....");
        }
    }
}