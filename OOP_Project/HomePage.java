package OOP_Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomePage implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void patientAdmission(ActionEvent event){
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/admission/Admission.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage patientAdmission");
            System.out.println(e);
        }


    }

    @FXML
    void patientDischarge(ActionEvent event){
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/discharge/Discharge.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage patientDischarge");
            System.out.println(e);
        }

    }

    @FXML
    void patientRecords(ActionEvent event){
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/records/Records.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage patientRecords");
            System.out.println(e);
        }
    }

    @FXML
    void patientSearch(ActionEvent event){
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("patient/search/SearchPatient.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
//            stage.setMaximized(true);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage patientSearch");
            System.out.println(e);
        }
    }


    @FXML
    void searchDoctor(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("doctor/searchDoctor/SearchDoctor.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage searchDoctor");
            System.out.println(e);
        }
    }

    @FXML
    void addNewDoctor(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("doctor/addNewDoctor/AddNewDoctor.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage addNewDoctor");
            System.out.println(e);
        }
    }

    @FXML
    void listOfDoctor(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("doctor/listOfDoctor/ListOfDoctor.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage listOfDoctor");
            System.out.println(e);
        }
    }

    @FXML
    void addNewCleaner(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/addEmployee/AddNewCleaners.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Add New Cleaner");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage addNewCleaner");
            System.out.println(e);
        }
    }

    @FXML
    void addNewManagementWorker(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/addEmployee/AddNewManagementWorker.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Add New Management Worker");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage addNewManagementWorker");
            System.out.println(e);
        }
    }

    @FXML
    void addNewNurse(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/addEmployee/AddNewNurse.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Add New Nurse");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage addNewNurse");
            System.out.println(e);
        }
    }

    @FXML
    void addNewSecurityGuards(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/addEmployee/AddNewSecurityGuards.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Add New Security Guard");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage addNewSecurityGuards");
            System.out.println(e);
        }
    }

    @FXML
    void searchCleaner(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/searchEmployee/SearchCleaner.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage searchCleaner");
            System.out.println(e);
        }
    }

    @FXML
    void searchManagementWorker(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/searchEmployee/SearchManagementWorker.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage searchManagementWorker");
            System.out.println(e);
        }
    }

    @FXML
    void searchNurse(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/searchEmployee/SearchNurse.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage searchNurse");
            System.out.println(e);
        }
    }

    @FXML
    void serachSecurityGuards(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/searchEmployee/SearchSecurityGuard.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage serachSecurityGuards");
            System.out.println(e);
        }
    }

    @FXML
    void listOfCleaner(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/listOfEmployee/ListOfCleaners.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage listOfCleaner");
            System.out.println(e);
        }
    }

    @FXML
    void listOfManagementWorker(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/listOfEmployee/ListOfManagementWorkers.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage listOfManagementWorker");
            System.out.println(e);
        }
    }

    @FXML
    void listOfNurse(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/listOfEmployee/ListOfNurses.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage listOfNurse");
            System.out.println(e);
        }
    }

    @FXML
    void listOfSecurityGuards(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("employee/listOfEmployee/ListOfSecurityGuards.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("OOP Project Test 1");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println("Exception occur Homepage listOfSecurityGuards");
            System.out.println(e);
        }
    }

    @FXML
    void aboutHospital(ActionEvent event) {

    }

    @FXML
    void setting(ActionEvent event) {

    }


}
