package OOP_Project.backEnd;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Doctor extends Hospital implements Data, Serializable {

    String doctorName;
    int doctorAge;
    String doctorGender;
    String doctorQualification;
    String specializedField;
    String doctorContractNumber;
    String doctorAddress;
    String doctorEmail;
    String doctorJoiningDate;
    int doctorSalary;

    public Doctor(String doctorName, int doctorAge, String doctorGender,String doctorQualification, String specializedField,
                  String doctorContractNumber,String doctorAddress, String doctorEmail, String doctorJoiningDate, int doctorSalary) {
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorGender = doctorGender;
        this.doctorQualification = doctorQualification;
        this.specializedField = specializedField;
        this.doctorContractNumber = doctorContractNumber;
        this.doctorAddress = doctorAddress;
        this.doctorEmail = doctorEmail;
        this.doctorJoiningDate = doctorJoiningDate;
        this.doctorSalary = doctorSalary;
    }

    public Doctor(String doctorName, int doctorAge, String doctorGender, String doctorQualification, String specializedField,
                  String doctorContractNumber, String doctorAddress, String doctorEmail, String doctorJoiningDate) {
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorGender = doctorGender;
        this.doctorQualification = doctorQualification;
        this.specializedField = specializedField;
        this.doctorContractNumber = doctorContractNumber;
        this.doctorAddress = doctorAddress;
        this.doctorEmail = doctorEmail;
        this.doctorJoiningDate = doctorJoiningDate;
    }

    public Doctor() {
    }

    public String getDoctorName() {
        return doctorName;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public String getDoctorQualification() {
        return doctorQualification;
    }

    public String getSpecializedField() {
        return specializedField;
    }

    public String getDoctorContractNumber() {
        return doctorContractNumber;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public String getDoctorJoiningDate() {
        return doctorJoiningDate;
    }

    public int getDoctorSalary() {
        return doctorSalary;
    }




    public void add(String name, int age, String gender, String qualification, String specializedField,String contractNumber,
                    String address, String email, String joiningDate, int salary) {

        Doctor doctor = new Doctor();
        doctor.doctorName = name;
        doctor.doctorAge = age;
        doctor.doctorGender = gender;
        doctor.doctorQualification = qualification;
        doctor.specializedField = specializedField;
        doctor.doctorContractNumber = contractNumber;
        doctor.doctorAddress = address;
        doctor.doctorEmail = email;
        doctor.doctorJoiningDate = joiningDate;
        doctor.doctorSalary = salary;


        try {
            ArrayList<Doctor> arrayList = new ArrayList<>();

            if (doctorList.length() != 0) {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(doctorList));
                arrayList = (ArrayList<Doctor>) in.readObject();
                in.close();
            }

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(doctorList));
            arrayList.add(doctor);
            out.writeObject(arrayList);
            out.close();

        } catch (IOException | ClassNotFoundException i) {
            System.out.println("Exception Occur in Doctor add");
            System.out.println(i);
        }
    }

    @Override
    public Object search(String doctorName,String str) {
        if(doctorList.length() == 0){
            System.out.println("Sorry! there is no Doctor records");
            return null;
        }

        Doctor doctor = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(doctorList));
            ArrayList<Doctor> arrayList = new ArrayList<>();
            arrayList = (ArrayList<Doctor>) in.readObject();

            Iterator<Doctor> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                doctor = iterator.next();
                if(doctor.doctorName.compareTo(doctorName) == 0) {
                    return  doctor;
                }
            }
            in.close();

        } catch (IOException i) {
            System.out.println(i);
        } catch (ClassNotFoundException c) {
            System.out.println("Doctor class not found");
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
