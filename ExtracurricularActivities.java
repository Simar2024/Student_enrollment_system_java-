/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystudentdesign;

/**List<Student> students = new ArrayList<>();

        students.add(new Student(18, 123456, "John", "Doe", 123456789, 12345));
        students.add(new Student(20, 654321, "Jane", "Smith", 98765432, 54321));

        for (Student student : students) {
            student.populateStudentFile(); // Populate file before updating details
            student.studentDetailsUpdate();
        
 *
 * @author Simar
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class ExtracurricularActivities {
    private List<String> activities;
    private final String FILENAME = "activities.txt";

    public ExtracurricularActivities() {
        activities = new ArrayList<>();
        // Load activities from file
        try {
            activities = FileIO.readLines(FILENAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
        // Update file
        try {
            FileIO.writeLines(FILENAME, activities);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

