package OOP_Project.backEnd;

import java.io.File;

public abstract class Hospital {
    File patientList = new File("patientList.txt");
    File doctorList = new File("doctorList.txt");
    File nurseList = new File("nurseList.txt");
    File cleanerList = new File("cleanerList.txt");
    File securityGuardList = new File("securityGuardList.txt");
    File managementWorkerList = new File("managementWorkerList.txt");
}
