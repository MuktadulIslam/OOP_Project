package OOP_Project.doctor.deleteDoctor;

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

public class DeleteDoctor implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField doctorName;

    @FXML
    private TextField doctorContractNumber;

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void delete(ActionEvent event) {
        String name = doctorName.getText();
        String contractNumber = doctorContractNumber.getText();
        Doctor doctor = new Doctor();
        boolean doctorFound = doctor.delete("", name, contractNumber);

        PopUpBox popUpBox = new PopUpBox();

        if(doctorFound){
            String confirmation = popUpBox.confirmation("Confirmation","Do you want to delete this (" +  name + ") doctor??");
            if(confirmation.compareTo("yes") == 0) {
                popUpBox.information("Information","This (" +  name + ") doctor is deleted successfully");

                Stage stage = (Stage) pane.getScene().getWindow();
                stage.close();
            }
        }
        else {
            popUpBox.waring("Waring","There is no doctor in this (" + name + ") name!!");
        }
    }

}
