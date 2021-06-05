package OOP_Project.backEnd;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Hospital {
    String hospitalName;
    String hospitalLicenceNo;

    File patientList = new File("patientList.txt");
    File doctorList = new File("doctorList.txt");
    File nurseList = new File("nurseList.txt");
    File cleanerList = new File("cleanerList.txt");
    File securityGuardList = new File("securityGuardList.txt");
    File managementWorkerList = new File("managementWorkerList.txt");


    String getHospitalName() {
        return hospitalName;
    }
    String getHospitalLicenceNo() {
        return hospitalLicenceNo;
    }
}
