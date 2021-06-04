package OOP_Project.backEnd;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class Employee extends Hospital implements Data, Serializable {
    String employeeName;
    int employeeAge;
    String employeeGender;
    String employeeContactNumber;
    String employeeEmail;
    String employeeAddress;
    String employeeQualification;
    String employeeJoiningDate;
    int employeeSalary;
    String employeeShift;

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public String getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeShift() {
        return employeeShift;
    }


    public void add(String employeeType, String name, int age, String gender, String contractNumber,
                       String email, String address,String qualification, String joiningDate, int salary, String shift) {

        Employee employee = new Employee();
        employee.employeeName = name;
        employee.employeeAge = age;
        employee.employeeGender = gender;
        employee.employeeContactNumber = contractNumber;
        employee.employeeEmail = email;
        employee.employeeAddress = address;
        employee.employeeQualification = qualification;
        employee.employeeJoiningDate = joiningDate;
        employee.employeeSalary = salary;
        employee.employeeShift = shift;

        try {
            ArrayList<Employee> arrayList = new ArrayList<>();

            if(employeeType.compareTo("Nurse") == 0){
                if (nurseList.length() != 0) {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(nurseList));
                    arrayList = (ArrayList<Employee>) in.readObject();
                    in.close();
                }

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nurseList));
                arrayList.add(employee);
                out.writeObject(arrayList);
                out.close();
            }
            if(employeeType.compareTo("Management Worker") == 0){
                if (managementWorkerList.length() != 0) {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(managementWorkerList));
                    arrayList = (ArrayList<Employee>) in.readObject();
                    in.close();
                }

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(managementWorkerList));
                arrayList.add(employee);
                out.writeObject(arrayList);
                out.close();
            }
            if(employeeType.compareTo("Cleaner") == 0){
                if (cleanerList.length() != 0) {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(cleanerList));
                    arrayList = (ArrayList<Employee>) in.readObject();
                    in.close();
                }

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(cleanerList));
                arrayList.add(employee);
                out.writeObject(arrayList);
                out.close();
            }
            if(employeeType.compareTo("Security Guard") == 0){
                if (securityGuardList.length() != 0) {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(securityGuardList));
                    arrayList = (ArrayList<Employee>) in.readObject();
                    in.close();
                }

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(securityGuardList));
                arrayList.add(employee);
                out.writeObject(arrayList);
                out.close();
            }

        } catch (IOException | ClassNotFoundException i) {
            System.out.println("Exception occur in backEnd Employee add");
            System.out.println(i);
        }
    }

    @Override
    public Object search(String employeeType, String patientName) {
        if(patientList.length() == 0){
            System.out.println("Sorry! there is no patient records");
            return null;
        }

        Employee employee = null;

        if(employeeType.compareTo("Nurse") == 0){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(nurseList));
                ArrayList<Employee> arrayList = new ArrayList<>();
                arrayList = (ArrayList<Employee>) in.readObject();

                Iterator<Employee> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    employee = iterator.next();
                    if(employee.employeeName.compareTo(patientName) == 0) {
                        return  employee;
                    }
                }
                in.close();

            } catch (IOException i) {
                System.out.println(i);
            } catch (ClassNotFoundException c) {
                System.out.println(employeeType + " class not found");
                System.out.println(c);
            }
        }

        else if(employeeType.compareTo("Management Worker") == 0){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(managementWorkerList));
                ArrayList<Employee> arrayList = new ArrayList<>();
                arrayList = (ArrayList<Employee>) in.readObject();

                Iterator<Employee> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    employee = iterator.next();
                    if(employee.employeeName.compareTo(patientName) == 0) {
                        return  employee;
                    }
                }
                in.close();

            } catch (IOException i) {
                System.out.println(i);
            } catch (ClassNotFoundException c) {
                System.out.println(employeeType + " class not found");
                System.out.println(c);
            }
        }

        else if(employeeType.compareTo("Cleaner") == 0){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(cleanerList));
                ArrayList<Employee> arrayList = new ArrayList<>();
                arrayList = (ArrayList<Employee>) in.readObject();

                Iterator<Employee> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    employee = iterator.next();
                    if(employee.employeeName.compareTo(patientName) == 0) {
                        return  employee;
                    }
                }
                in.close();

            } catch (IOException i) {
                System.out.println(i);
            } catch (ClassNotFoundException c) {
                System.out.println(employeeType + " class not found");
                System.out.println(c);
            }
        }

        else if(employeeType.compareTo("Security Guard") == 0){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(securityGuardList));
                ArrayList<Employee> arrayList = new ArrayList<>();
                arrayList = (ArrayList<Employee>) in.readObject();

                Iterator<Employee> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    employee = iterator.next();
                    if(employee.employeeName.compareTo(patientName) == 0) {
                        return  employee;
                    }
                }
                in.close();

            } catch (IOException i) {
                System.out.println(i);
            } catch (ClassNotFoundException c) {
                System.out.println(employeeType + " class not found");
                System.out.println(c);
            }
        }


        return null;
    }



    @Override
    public ArrayList records() {
        return null;
    }

}
