package OOP_Project.employee.addEmployee;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddNewNurse implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField employeeName;

    @FXML
    private TextField employeeAge;

    @FXML
    private TextField employeeGender;

    @FXML
    private TextField employeeContractNumber;

    @FXML
    private TextField employeeEmail;

    @FXML
    private TextField employeeAddress;

    @FXML
    private TextField employeeQualification;

    @FXML
    private TextField employeeJoiningDate;

    @FXML
    private TextField employeeSalary;

    @FXML
    private TextField employeeShift;

    @FXML
    private ChoiceBox choiceBox1;

    @FXML
    private ChoiceBox choiceBox2;

    @FXML
    void add(ActionEvent event) {
        String name = employeeName.getText();
        int age;
        try {
            age = Integer.parseInt(employeeAge.getText());
        } catch (Exception e){
            age = -1;
        }

        String contractNumber = employeeContractNumber.getText();
        String email = employeeEmail.getText();
        String address = employeeAddress.getText();
        String qualification = employeeQualification.getText();
        String joiningDate = employeeJoiningDate.getText();
        int salary;
        try {
            salary = Integer.parseInt(employeeSalary.getText());
        } catch (Exception e){
            salary = -1;
        }
        String gender = choiceBox1.getValue().toString();
        String shift = choiceBox2.getValue().toString();

        PopUpBox popUpBox = new PopUpBox();
        String confirmation = null;
        if(age == -1 || salary == -1) { popUpBox.error("Format Error!!!","Please Enter integer value in \"Age:\" and \"Salary:\" section "); }
        else { confirmation = popUpBox.confirmation("Confirmation","Do you want to ADD this (" + name + ") Nurse???"); }


        if(confirmation.compareTo("yes") == 0) {
            Employee employee = new Employee();
            employee.add("Nurse",name,age,gender,contractNumber,email,address,qualification,joiningDate,salary,shift);
            popUpBox.information("Information","This (" + name + ") Nurse is successfully added");
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
    void choice1(ActionEvent event) {
        String str = choiceBox1.getSelectionModel().getSelectedItem().toString();
        employeeGender.setText(str);
    }

    @FXML
    void choice2(ActionEvent event) {
        String str = choiceBox2.getSelectionModel().getSelectedItem().toString();
        employeeShift.setText(str);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list1 = FXCollections.observableArrayList("Male","Female","Others");
        choiceBox1.setItems(list1);

        ObservableList<String> list2 = FXCollections.observableArrayList("Day","Night");
        choiceBox2.setItems(list2);
    }
}
