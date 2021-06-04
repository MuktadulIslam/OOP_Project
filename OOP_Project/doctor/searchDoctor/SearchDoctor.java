package OOP_Project.doctor.searchDoctor;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Doctor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchDoctor implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField name;

    @FXML
    private TextField doctorName;

    @FXML
    private TextField doctorGender;

    @FXML
    private TextField doctorContractNumber;

    @FXML
    private TextField doctorAdderss;

    @FXML
    private TextField doctorEmail;

    @FXML
    private TextField doctorSpecializedField;

    @FXML
    private TextField doctorQualification;

    @FXML
    private TextField doctorJoiningDate;

    @FXML
    private TextField doctorSalary;

    @FXML
    private TextField doctorAge;

    @FXML
    void search(ActionEvent event) {
        try {
            Doctor doctor = new Doctor();
            doctor = (Doctor) doctor.search(name.getText(),"");
            if(doctor != null){
                doctorName.setText(doctor.getDoctorName());
                doctorAge.setText(Integer.toString(doctor.getDoctorAge()));
                doctorGender.setText(doctor.getDoctorGender());
                doctorContractNumber.setText(doctor.getDoctorContractNumber());
                doctorAdderss.setText(doctor.getDoctorAddress());
                doctorEmail.setText(doctor.getDoctorEmail());
                doctorSpecializedField.setText(doctor.getSpecializedField());
                doctorQualification.setText(doctor.getDoctorQualification());
                doctorJoiningDate.setText(doctor.getDoctorJoiningDate());
                doctorSalary.setText(Integer.toString(doctor.getDoctorSalary()));
            }

            else {
                PopUpBox popUpBox = new PopUpBox();
                popUpBox.waring("Warning","There is no Doctor in this (" + name.getText() + ") name");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
