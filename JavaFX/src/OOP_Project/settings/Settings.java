package OOP_Project.settings;

import OOP_Project.PopUpBox;
import OOP_Project.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Settings implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField oldPassword;

    @FXML
    private TextField newPassWord;

    @FXML
    private TextField conformNewPassword;

    @FXML
    void change(ActionEvent event) throws IOException {
        String oldPass = oldPassword.getText();
        String newPass = newPassWord.getText();
        String conformNewPass = conformNewPassword.getText();
        File file = new File("password.txt");
        Scanner scanner = new Scanner(file);
        String pass  = scanner.nextLine();

        PopUpBox popUpBox = new PopUpBox();

        if(oldPass.compareTo(pass) == 0){
            if(newPass.compareTo(conformNewPass) == 0){
                if(newPass.length() < 5){
                    popUpBox.waring("Warning","Password Must be at least 5 character");
                }
                else {
                    String confirmation = popUpBox.confirmation("Confirmation","Do you want to Change Password???");

                    if (confirmation.compareTo("yes") == 0){
                        popUpBox.information("","Your Password is changed Successfully!!!");

                        Writer fileWriter = new FileWriter("password.txt");
                        fileWriter.write(newPass);
                        fileWriter.close();

                        Stage stage = (Stage) pane.getScene().getWindow();
                        stage.close();

                    }
                }
            }
            else {
                popUpBox.waring("Warning","New Password didn't match");
            }
        }

        else {
            popUpBox.error("Error","Old Password didn't match");
        }
    }

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
}
