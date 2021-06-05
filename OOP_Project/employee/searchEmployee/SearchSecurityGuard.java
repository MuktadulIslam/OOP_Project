package OOP_Project.employee.searchEmployee;

import OOP_Project.PopUpBox;
import OOP_Project.backEnd.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchSecurityGuard implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField securityGuardName;

    @FXML
    private TextField name;

    @FXML
    private TextField age;

    @FXML
    private TextField qualification;

    @FXML
    private TextField gender;

    @FXML
    private TextField address;

    @FXML
    private TextField contractNumber;

    @FXML
    private TextField email;

    @FXML
    private TextField joiningDate;

    @FXML
    private TextField salary;

    @FXML
    private TextField shift;

    @FXML
    void search(ActionEvent event) {
        try {
            Employee employee = new Employee();
            employee = (Employee) employee.search("Security Guard", securityGuardName.getText());
            if(employee != null){
                name.setText(employee.getEmployeeName());
                age.setText(Integer.toString(employee.getEmployeeAge()));
                gender.setText(employee.getEmployeeGender());
                contractNumber.setText(employee.getEmployeeContactNumber());
                address.setText(employee.getEmployeeAddress());
                email.setText(employee.getEmployeeEmail());
                qualification.setText(employee.getEmployeeQualification());
                joiningDate.setText(employee.getEmployeeJoiningDate());
                salary.setText(Integer.toString(employee.getEmployeeSalary()));
                shift.setText(employee.getEmployeeShift());
            }

            else {
                PopUpBox popUpBox = new PopUpBox();
                popUpBox.waring("Warning","There is no Security Guard in this (" + securityGuardName.getText() + ") name");
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
