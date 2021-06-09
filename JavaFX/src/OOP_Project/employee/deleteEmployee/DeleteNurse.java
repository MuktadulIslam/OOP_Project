package OOP_Project.employee.deleteEmployee;

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

public class DeleteNurse implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField employeeName;

    @FXML
    private TextField employeeContractNumber;

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void delete(ActionEvent event) {
        String name = employeeName.getText();
        String contractNumber = employeeContractNumber.getText();

        Employee employee = new Employee();
        boolean employeeFound = employee.delete("Nurse", name, contractNumber);

        PopUpBox popUpBox = new PopUpBox();

        if(employeeFound){
            String confirmation = popUpBox.confirmation("Confirmation","Do you want to delete this (" +  name + ") Nurse??");
            if(confirmation.compareTo("yes") == 0) {
                popUpBox.information("Information","This (" +  name + ") Nurse is deleted successfully");

                Stage stage = (Stage) pane.getScene().getWindow();
                stage.close();
            }
        }
        else {
            popUpBox.waring("Waring","There is no Nurse in this (" + name + ") name!!");
        }
    }

}
