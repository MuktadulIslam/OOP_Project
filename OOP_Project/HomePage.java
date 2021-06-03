package OOP_Project;

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

public class HomePage implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void patientAdmission(ActionEvent event) throws IOException {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/admission/Admission.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
//            stage.setMaximized(true);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println(e);
        }


    }

    @FXML
    void patientDischarge(ActionEvent event) throws IOException {
//        Stage stage = new Stage();
//        Parent root = FXMLLoader.load(getClass().getResource("Discharge.fxml"));
//        Scene scene = new Scene(root);
//        stage.setTitle("OOP Project Test 1");
////            stage.setMaximized(true);
//        stage.setResizable(false);
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void patientRecords(ActionEvent event) throws IOException {
//        Stage stage = new Stage();
//        Parent root = FXMLLoader.load(getClass().getResource("PatientRecords.fxml"));
//        Scene scene = new Scene(root);
//        stage.setTitle("OOP Project Test 1");
////            stage.setMaximized(true);
//        stage.setResizable(false);
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void patientSearch(ActionEvent event) throws IOException {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/search/SearchPatient.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
//            stage.setMaximized(true);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
