package OOP_Project.backEnd;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Patient extends Hospital implements Data, Serializable{

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
    String patientLastVisit;

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
        return patientLastVisit;
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
                "\n patinetLastVisit= " + patientLastVisit +
                "\n}";
    }


    public void add(String name, int age, String gender, String disease, String appointedDoctor,String address,
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
        patient.patientLastVisit = patient.patientAdmissionDate;

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

        } catch (IOException | ClassNotFoundException i) {
            System.out.println(i);
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
    public ArrayList records() {

        if(patientList.length() == 0){
            System.out.println("Sorry! there is no patient records");
            return null;
        }

        Patient patient = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientList));
            ArrayList<Patient> arrayList = new ArrayList<>();
            arrayList = (ArrayList<Patient>) in.readObject();

            in.close();
            return arrayList;

        } catch (IOException i) {
            System.out.println(i);
        } catch (ClassNotFoundException c) {
            System.out.println("Patient class not found");
            System.out.println(c);
        }
        return null;
    }

}
