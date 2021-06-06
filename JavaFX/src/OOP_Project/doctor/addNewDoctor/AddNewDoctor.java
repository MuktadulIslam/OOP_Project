package OOP_Project.doctor.addNewDoctor;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Doctor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddNewDoctor implements Initializable{
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField DoctorName;

    @FXML
    private TextField doctorAge;

    @FXML
    private TextField doctorGender;

    @FXML
    private TextField doctorContractNumber;

    @FXML
    private TextField dortorEmail;

    @FXML
    private TextField doctorAddress;

    @FXML
    private TextField doctorSpecializedField;

    @FXML
    private TextField doctorQualification;

    @FXML
    private TextField doctorJoiningDate;

    @FXML
    private TextField doctorSalary;


    @FXML
    void add(ActionEvent event) {
        String name = DoctorName.getText();
        int age;
        try {
            age = Integer.parseInt(doctorAge.getText());
        } catch (Exception e){
            age = -1;
        }
        String gender = doctorGender.getText();
        String contractNumber = doctorContractNumber.getText();
        String email = dortorEmail.getText();
        String address = doctorAddress.getText();
        String specializedField = doctorSpecializedField.getText();
        String qualification = doctorQualification.getText();
        String joiningDate = doctorJoiningDate.getText();
        int salary;
        try {
            salary = Integer.parseInt(doctorSalary.getText());
        } catch (Exception e){
            salary = -1;
        }

        PopUpBox popUpBox = new PopUpBox();
        String confirmation = null;
        if(age == -1 || salary == -1) { popUpBox.error("Format Error!!!","Please Enter integer value in \"Doctor's Age:\" and \"Salary:\" section "); }
        else { confirmation = popUpBox.confirmation("Confirmation","Do you want to ADD this (" + name + ") doctor???"); }


        if(confirmation.compareTo("yes") == 0){
            Doctor doctor = new Doctor();
            doctor.add(name,age,gender,qualification,specializedField,contractNumber,address,email,joiningDate,salary);
            popUpBox.information("Information","This (" + name + ") doctor is successfully added");

            Stage stage = (Stage) pane.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
}
