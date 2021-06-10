package OOP_Project.patient.records;

import OOP_Project.backEnd.Patient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;

public class Records implements Initializable {

    @FXML
    private TableView<Patient> table;

    @FXML
    private TableColumn<Patient, String> name;

    @FXML
    private TableColumn<Patient, Integer> age;

    @FXML
    private TableColumn<Patient, String> gender;

    @FXML
    private TableColumn<Patient, String> contractNumber;

    @FXML
    private TableColumn<Patient, String> address;

    @FXML
    private TableColumn<Patient, String> disease;

    @FXML
    private TableColumn<Patient, String> admissionDate;

    @FXML
    private TableColumn<Patient, String> appointedDoctor;

    @FXML
    private TableColumn<Patient, Integer> cabinNo;

    @FXML
    private TableColumn<Patient, String> emergencyContractName;

    @FXML
    private TableColumn<Patient, String> emergencyContractNumber;

    @FXML
    private TableColumn<Patient, String> lastVisit;

    @FXML
    private TableColumn<?, ?> discharge;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
