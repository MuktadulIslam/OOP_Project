package OOP_Project.patient.discharge;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Doctor;
import OOP_Project.backEnd.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Discharge implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private Pane pane;

    @FXML
    private TextField name;

    @FXML
    private TextField contractNumber;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientGender;

    @FXML
    private TextField patientContractNumber;

    @FXML
    private TextField patientAddress;

    @FXML
    private TextField patientDisease;

    @FXML
    private TextField appointedDoctor;

    @FXML
    private TextField cabinNumber;

    @FXML
    private TextField emergencyContractName;

    @FXML
    private TextField emergencyContractNumber;

    @FXML
    private TextField patientAge;

    @FXML
    private TextField admissionDate;

    @FXML
    private TextField totalBill;

    @FXML
    private TextField pay;

    @FXML
    private TextField due;


    @FXML
    void search(ActionEvent event) {
        try {
            Patient patient = new Patient();
            patient = (Patient) patient.search(name.getText(),contractNumber.getText());
            if(patient != null && ! patient.isDischarge()){
                patientName.setText(patient.getPatientName());
                patientAge.setText(Integer.toString(patient.getPatientAge()));
                patientGender.setText(patient.getPatientGender());
                patientContractNumber.setText(patient.getPatientContactNumber());
                patientAddress.setText(patient.getPatientAddress());
                patientDisease.setText(patient.getPatientDisease());
                appointedDoctor.setText(patient.getPatientAppointedDoctor());

                int i = patient.getPatientCabinNumber();
                String str = Integer.toString(i);
                if(i == -1){
                    str = "Don't needed";
                }
                cabinNumber.setText(str);

                emergencyContractName.setText(patient.getPatientEmergencyContractName());
                emergencyContractNumber.setText(patient.getPatientEmergencyContractNumber());

                admissionDate.setText(patient.getPatientAdmissionDate());

            }

            else {
                PopUpBox popUpBox = new PopUpBox();
                popUpBox.waring("Warning","There is no patient in this (" + name.getText() + ") name");
            }
        }
        catch (Exception e){
            System.out.println("Discharge");
            System.out.println(e);
        }


    }

    @FXML
    void makePayment(ActionEvent event) {
        PopUpBox popUpBox = new PopUpBox();
        try {
            double bill = Double.parseDouble(totalBill.getText());
            double totalPay = Double.parseDouble(pay.getText());
            double totalDue = bill - totalPay;


            due.setText(Double.toString(totalDue));

            String confirmation = null;
            confirmation = popUpBox.confirmation("Confirmation","Do you want to make Payment???");
            if(confirmation.compareTo("yes") == 0){
                popUpBox.information("Information","Your Payment Successfully done!!!!!");
                Patient patient = new Patient();
                patient.delete("", name.getText(),contractNumber.getText());
            }

            Stage stage = (Stage) pane.getScene().getWindow();
            stage.close();

        } catch (Exception e){
            popUpBox.error("Format Error!!!","Pleare enter integer velue in \"Total Bill \" and \"Pay\" section");
        }
    }

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
}
