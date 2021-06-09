package OOP_Project.patient.admission;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Patient;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Admission implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField patientAge;

    @FXML
    private TextField patientGender;

    @FXML
    private TextField patientDisease;

    @FXML
    private TextField patientAddress;

    @FXML
    private TextField patientContactNumber;

    @FXML
    private TextField patientCabinNeeded;

    @FXML
    private TextField patientEmergencyContractName;

    @FXML
    private TextField patientAppointedDoctor;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientEmergencyContractNumber;

    @FXML
    private ChoiceBox choiceBox;


    @FXML
    void addPatient(ActionEvent event) {
        String name = patientName.getText();
        int age;
        try {
            age = Integer.parseInt(patientAge.getText());
        } catch (Exception e){
            age = -1;
        }
        String gender = choiceBox.getValue().toString();
        String disease = patientDisease.getText();
        String appointedDoctor = patientAppointedDoctor.getText();
        String address = patientAddress.getText();
        String contractNumber = patientContactNumber.getText();
        int cabinNo;
        try {
            cabinNo = Integer.parseInt(patientCabinNeeded.getText());
        } catch (Exception e){
            cabinNo = -1;
        }
        String emergencyContractName = patientEmergencyContractName.getText();
        String emergencyContractNumber = patientEmergencyContractNumber.getText();

        PopUpBox popUpBox = new PopUpBox();
        String confirmation = null;
        if(age == -1) { popUpBox.error("Format Error!!!","Please Enter integer value in \"Patient's Age:\" section "); }
        else { confirmation = popUpBox.confirmation("Confirmation","Do you want to Admit this (" + name + ") patient???"); }


        if(confirmation.compareTo("yes") == 0){
            Patient patient = new Patient();
            patient.add(name, age, gender, disease, appointedDoctor, address,contractNumber, cabinNo, emergencyContractName, emergencyContractNumber);
            popUpBox.information("Information","This (" + patientName.getText() + ") patient is successfully Admitted");

            Stage stage = (Stage) pane.getScene().getWindow();
            stage.close();
        }

    }

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void choice(ActionEvent event) {
        String str = choiceBox.getSelectionModel().getSelectedItem().toString();
        patientGender.setText(str);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("Male","Female","Others");
        choiceBox.setItems(list);
    }
}
