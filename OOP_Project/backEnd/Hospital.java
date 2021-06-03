package OOP_Project.backEnd;

import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Hospital {
    Scanner scanner = new Scanner(System.in);
    String hospitalName;
    String hospitalLicenceNo;
    Image hospitalImage;
    String hospitalLocation;
    int totalCabinNumber;
    boolean [] cabinBooked = new boolean[totalCabinNumber];
    int todayAvailableDoctor;

//    File doctorList, patientList, nurseList, cleanerList, securityGuardList, managementWorkerList;
    File patientList = new File("patientList.txt");
    File doctorList = new File("doctorList.txt");
    File nurseList = new File("nurseList.txt");
    File cleanerList = new File("cleanerList.txt");
    File securityGuardList = new File("securityGuardList.txt");
    File managementWorkerList = new File("managementWorkerList.txt");


    String getHospitalName() {
        patientList.delete();
        return hospitalName;
    }
    String getHospitalLicenceNo() {
        return hospitalLicenceNo;
    }
    void records(){}

}
