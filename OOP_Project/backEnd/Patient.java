package OOP_Project.backEnd;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Patient extends Hospital implements Data, Serializable{
//    Scanner scanner = new Scanner(System.in);

    String patientName;
    int patientAge;
    String patientGender;
    String patientContactNumber;
    String patientAddress;
    String patientDisease;
    String patientAdmissionDate;
    String patientAppointedDoctor;
    int patientCabinNumber = -1;
    boolean patientDischarge = false;
    String patientEmergencyContractName = null;
    String patientEmergencyContractNumber = null;
    String patinetLastVisit;
    double patientTotalBill = 0.0;
    double patientPay = 0.0;
    double patientDue = 0.0;

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public String getPatientContactNumber() {
        return patientContactNumber;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public String getPatientAdmissionDate() {
        return patientAdmissionDate;
    }

    public String getPatientAppointedDoctor() {
        return patientAppointedDoctor;
    }

    public int getPatientCabinNumber() {
        return patientCabinNumber;
    }

    public boolean isPatientDischarge() {
        return patientDischarge;
    }

    public String getPatientEmergencyContractName() {
        return patientEmergencyContractName;
    }

    public String getPatientEmergencyContractNumber() {
        return patientEmergencyContractNumber;
    }

    public String getPatinetLastVisit() {
        return patinetLastVisit;
    }

    @Override
    public String toString() {
        return "\t\tPatient{\n" +
                "patientName= " + patientName +
                "\n patientAge= " + patientAge +
                "\n patientGender= " + patientGender +
                "\n patientContactNumber= " + patientContactNumber +
                "\n patientAddress= " + patientAddress  +
                "\n patientdiseas= " + patientDisease  +
                "\n patientAdmissionDate= " + patientAdmissionDate  +
                "\n patientAppointedDoctor= " + patientAppointedDoctor  +
                "\n patientCabinNumber= " + patientCabinNumber +
                "\n patientDischarge= " + patientDischarge +
                "\n patientEmergencyContractName= " + patientEmergencyContractName  +
                "\n patientEmergencyContractNumber= " + patientEmergencyContractNumber  +
                "\n patinetLastVisit= " + patinetLastVisit  +
                "\n}";
    }
//    +payment(money: double): Boolean
//+bookedCabin(cabinNumber: String):  Boolean
//+leaveCabin(cabinNumber: String): boolean

//    @Override
//    public boolean add(){ return true;}


    public boolean add(String name, int age, String gender, String disease, String appointedDoctor,String address,
                       String contractNumber, int cabinNumber, String emergencyContractName, String emergencyContractNumber) {

        Patient patient = new Patient();
        patient.patientName = name;
        patient.patientAge = age;
        patient.patientGender = gender;
        patient.patientContactNumber = contractNumber;
        patient.patientAddress = address;
        patient.patientDisease = disease;
        patient.patientAdmissionDate = LocalDate.now().toString();
        patient.patientAppointedDoctor = appointedDoctor;
        patient.patientCabinNumber = cabinNumber;
        patient.patientEmergencyContractName = emergencyContractName;
        patient.patientEmergencyContractNumber = emergencyContractNumber;
        patient.patinetLastVisit = patient.patientAdmissionDate;

        try {
            ArrayList<Patient> arrayList = new ArrayList<>();

            if (patientList.length() != 0) {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientList));
                arrayList = (ArrayList<Patient>) in.readObject();
                in.close();
            }

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(patientList));
            arrayList.add(patient);
            out.writeObject(arrayList);
            out.close();
            return true;

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            return false;
        }
    }

    @Override
    public Object search(String patientName, String patientContactNumber) {
        if(patientList.length() == 0){
            System.out.println("Sorry! there is no patient records");
            return null;
        }

        Patient patient = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientList));
            ArrayList<Patient> arrayList = new ArrayList<>();
            arrayList = (ArrayList<Patient>) in.readObject();

            Iterator<Patient> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                patient = iterator.next();
                if(patient.patientName.compareTo(patientName) == 0 && patient.patientContactNumber.compareTo(patientContactNumber) == 0) {
                    return  patient;
                }
            }
            in.close();

        } catch (IOException i) {
            System.out.println(i);
        } catch (ClassNotFoundException c) {
            System.out.println("Patient class not found");
            System.out.println(c);
        }
        return null;

    }



    @Override
    void records() {

        if(patientList.length() == 0){
            System.out.println("Sorry! there is no patient records");
            return;
        }

        Patient patient = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientList));
            ArrayList<Patient> arrayList = new ArrayList<>();
            arrayList = (ArrayList<Patient>) in.readObject();

            Iterator<Patient> iterator = arrayList.iterator();
            while (iterator.hasNext()){
                patient = iterator.next();
                System.out.println("PatientName= " + patient.patientName);
                System.out.println("PatientAge= " + patient.patientAge);
                System.out.println("PatientGender= " + patient.patientGender);
                System.out.println("PatientContactNumber= " + patient.patientContactNumber);
                System.out.println("PatientAddress= " + patient.patientAddress);
                System.out.println("Patientdiseas= " + patient.patientDisease);
                System.out.println("PatientAdmissionDate= " + patient.patientAdmissionDate);
                System.out.println("PatientAppointedDoctor= " + patient.patientAppointedDoctor);
                System.out.println("PatientCabinNumber= " + patient.patientCabinNumber);
                System.out.println("PatientDischarge= " + patient.patientDischarge);
                System.out.println("PatientEmergencyContractName= " + patient.patientEmergencyContractName);
                System.out.println("PatientEmergencyContractNumber= " + patient.patientEmergencyContractNumber);
                System.out.println("PatinetLastVisit= " + patient.patinetLastVisit + '\n');

            }

            in.close();

        } catch (IOException i) {
            System.out.println(i);
        } catch (ClassNotFoundException c) {
            System.out.println("Patient class not found");
            System.out.println(c);
        }
    }

    @Override
    public void editInfo(String patientName, String patientContactNumber) {

    }

}
