/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystudentdesign;

import java.util.Scanner;
import java.util.List;
import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author Simar
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private int phonenumber;
    private int postcode;
    private ExtracurricularActivities activities;
    private final String FILENAME = "studentinfo.txt";

    public Student(int age, int id, String firstname, String lastname, int phonenumber, int postcode) {
        super(age, id, firstname, lastname);
        this.phonenumber = phonenumber;
        this.postcode = postcode;
        this.activities = new ExtracurricularActivities();
    }

    

    private void updateAge(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new age: ");
        int newAge = Integer.parseInt(scanner.nextLine());

        // Update age
        parts[0] = String.valueOf(newAge);
        updateStudentInfo(parts);
        System.out.println("Age updated.");
    }

    private void updateFirstname(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new first name: ");
        String newFirstname = scanner.nextLine();

        // Update firstname
        parts[2] = newFirstname;
        updateStudentInfo(parts);
        System.out.println("First name updated.");
    }

    private void updateLastname(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new last name: ");
        String newLastname = scanner.nextLine();

        // Update lastname
        parts[3] = newLastname;
        updateStudentInfo(parts);
        System.out.println("Last name updated.");
    }

    private void updatePhoneNumber(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new phone number: ");
        int newPhoneNumber = Integer.parseInt(scanner.nextLine());

        // Update phone number
        parts[4] = String.valueOf(newPhoneNumber);
        updateStudentInfo(parts);
        System.out.println("Phone number updated.");
    }

    private void updatePostcode(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new postcode: ");
        int newPostcode = Integer.parseInt(scanner.nextLine());

        // Update postcode
        parts[5] = String.valueOf(newPostcode);
        updateStudentInfo(parts);
        System.out.println("Postcode updated.");
    }

     public List<String> readStudentInfoFromFile() throws IOException {
        return FileIO.readLines(FILENAME);
    }

    private void updateStudentInfo(String[] parts) {
        List<String> studentInfo = new ArrayList<>();
        studentInfo.add(parts[0] + "," + parts[1] + "," + parts[2] + "," + parts[3] + "," + parts[4] + "," + parts[5]);
        try {
            FileIO.writeLines(FILENAME, studentInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void studentDetailsUpdate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("A: Update Details");
            System.out.println("B: Display All Student Information");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("x")) {
                break;
            }

            if (choice.equals("a")) {
                System.out.println("Options:");
                System.out.println("1: Update Age");
                System.out.println("2: Update Firstname");
                System.out.println("3: Update Lastname");
                System.out.println("4: Update Phone number");
                System.out.println("5: Update Post code");
                System.out.print("Enter your choice: ");
                String updateChoice = scanner.nextLine();

                try {
                    List<String> studentInfo = readStudentInfoFromFile();
                    String[] parts = null;
                    boolean studentFound = false;

                    System.out.print("Enter student ID: ");
                    int studentId = Integer.parseInt(scanner.nextLine());

                    for (String info : studentInfo) {
                        parts = info.split(",");
                        if (parts.length == 6 && Integer.parseInt(parts[1]) == studentId) {
                            studentFound = true;
                            break;
                        }
                    }

                    if (!studentFound) {
                        System.out.println("Invalid student ID.");
                        continue;
                    }

                    switch (updateChoice) {
                        case "1":
                            updateAge(parts);
                            break;
                        case "2":
                            updateFirstname(parts);
                            break;
                        case "3":
                            updateLastname(parts);
                            break;
                        case "4":
                            updatePhoneNumber(parts);
                            break;
                        case "5":
                            updatePostcode(parts);
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (choice.equals("b")) {
            try {
                List<String> studentInfo = readStudentInfoFromFile();
                System.out.print("Enter student ID: ");
                int studentId = Integer.parseInt(scanner.nextLine());

                boolean studentFound = false;
                for (String info : studentInfo) {
                    String[] parts = info.split(",");
                    if (parts.length == 6 && Integer.parseInt(parts[1]) == studentId) {
                        studentFound = true;
                        displayStudentInfo(parts);
                        break;
                    }
                }

                if (!studentFound) {
                    System.out.println("Student with ID " + studentId + " not found.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}

private void displayStudentInfo(String[] parts) {
    System.out.println("Student Information:");
    System.out.println("Age: " + parts[0]);
    System.out.println("Student ID: " + parts[1]);
    System.out.println("First Name: " + parts[2]);
    System.out.println("Last Name: " + parts[3]);
    System.out.println("Phone Number: " + parts[4]);
    System.out.println("Postcode: " + parts[5]);
}
public void populateStudentFile() {
    String studentInfo = age + "," + id + "," + firstname + "," + lastname + "," + phonenumber + "," + postcode;
    try {
        List<String> existingInfo = readStudentInfoFromFile();
        existingInfo.add(studentInfo);

        PrintWriter writer = new PrintWriter(new FileWriter(FILENAME));
        for (String line : existingInfo) {
            writer.println(line);
        }
        writer.close();

        System.out.println("Student information populated to " + FILENAME);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

       // students.add(new Student(18, 123456, "John", "Doe", 123456789, 12345));
        students.add(new Student(20, 654321, "Jane", "Smith", 98765432, 54321));

        for (Student student : students) {
            student.populateStudentFile(); 
//            student.populateStudentFile();
            student.studentDetailsUpdate();
        }
    }
}

