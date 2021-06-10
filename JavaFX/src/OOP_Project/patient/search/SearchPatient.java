package OOP_Project.patient.search;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchPatient implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField name;

    @FXML
    private TextField contactNumber;

    // for show in search
    @FXML
    private TextField patientName;

    @FXML
    private TextField patientGender;

    @FXML
    private TextField patientContactNumber;

    @FXML
    private TextField patientAdderss;

    @FXML
    private TextField patientDisease;

    @FXML
    private TextField patientAppointedDoctor;

    @FXML
    private TextField patientCabinNumber;

    @FXML
    private TextField emergencyContractName;

    @FXML
    private TextField emergencyContractNumber;

    @FXML
    private TextField patientAge;

    @FXML
    private TextField admissionDate;

    @FXML
    private TextField lastVisit;

    @FXML
    private TextField discharge;


    @FXML
    void search(ActionEvent event){
        try {
            Patient patient = new Patient();
            patient = (Patient) patient.search(name.getText(),contactNumber.getText());
            if(patient != null){
                patientName.setText(patient.getPatientName());
                patientGender.setText(patient.getPatientGender());
                patientContactNumber.setText(patient.getPatientContactNumber());
                patientAdderss.setText(patient.getPatientAddress());
                patientDisease.setText(patient.getPatientDisease());
                patientAppointedDoctor.setText(patient.getPatientAppointedDoctor());

                int i = patient.getPatientCabinNumber();
                String str = Integer.toString(i);
                if(i == -1){
                    str = "Don't needed";
                }
                patientCabinNumber.setText(str);

                emergencyContractName.setText(patient.getPatientEmergencyContractName());
                emergencyContractNumber.setText(patient.getPatientEmergencyContractNumber());
                patientAge.setText(Integer.toString(patient.getPatientAge()));
                admissionDate.setText(patient.getPatientAdmissionDate());
                lastVisit.setText(patient.getPatinetLastVisit());

                if(patient.isDischarge()){
                    discharge.setText("Yes");
                }
                else {
                    discharge.setText("No");
                }
            }

            else {
                PopUpBox popUpBox = new PopUpBox();
                popUpBox.waring("Warning","There is no patient in this (" + name.getText() + ") name");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
}
