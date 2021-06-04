package OOP_Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
        String pass = password.getText();
        if(pass.compareTo("iit123") == 0){
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setScene(scene);
            stage.show();

            Stage stage1 = (Stage) pane.getScene().getWindow();
            stage1.close();


        }
        else {
            PopUpBox popUpBox = new PopUpBox();
            popUpBox.error("Error!!!!","Wrong password! Try again.....");
        }
    }
}
