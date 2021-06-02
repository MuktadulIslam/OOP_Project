package OOP_Project_Test1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Test2 implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void patientAdmission(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("admission.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("OOP Project Test 1");
//            stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void patientDischarge(ActionEvent event) {

    }

    @FXML
    void patientRecords(ActionEvent event) {

    }

    @FXML
    void patientSearch(ActionEvent event) {

    }
}
