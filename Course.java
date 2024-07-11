package softwareconAssignment;


import java.util.ArrayList;
import java.util.Scanner;

public class Course 
{
private int courseID;
private String courseName;
private Teacher instructor;
private ArrayList<Assignments> assignments;



public Course()
{
	this.courseID = 0;
	this.courseName = "";
	this.instructor = null; 
}
public Course(String courseName, Teacher instructor, int courseID)
{
this.courseID = courseID;
this.courseName = courseName;
this.instructor = instructor;
this.assignments = new ArrayList<Assignments>();

}
public int getCourseID()
{
	return courseID;
}

public Teacher getInstructor() 
{
return instructor;
}

public String getCourseName() {
return courseName;
}

public void addAssignment(Assignments assignment) {
    assignments.add(assignment);
}

public void removeAssignment(Assignments assignment)
{
	assignments.remove(assignment);
}



public void InstructorSwap(Teacher SwappedInstructor) {//need Teacher class to make this work
	if(this.instructor.equals(SwappedInstructor))
	{
		System.out.println("This instructor is already in the role.");
	}
	else if(SwappedInstructor != null && !this.instructor.equals(SwappedInstructor))
	{
		this.instructor = SwappedInstructor;
	}
}


public void CourseDetails()
{
	Scanner keyboard = new Scanner(System.in);
	boolean running = true;
	while(running == true)
	{
		System.out.println("--Student Course details--");
		System.out.println("--------------------------");
		
		System.out.println("Courses Menu - type an option then press Enter");
		System.out.println("A. View Student Courses"); // need to add grades.
		System.out.println("B. View Course assignments");
		System.out.println("C. To go back");
		String inputChoice = keyboard.next();
		switch(inputChoice.toLowerCase()) {
		case "a":
			System.out.println("Current courses for this student:");
            FileIO.readFromFile(inputChoice);//the name of the student or id
			
            System.out.println("Press anykey then enter to see options again");
            String back = keyboard.next();
			break;
			
		case "b":
			// call file io to read from assignments grades
			FileIO.readFromGrade(inputChoice);//the  name of student or id
			System.out.println("Press anykey then enter to see options again");
            back = keyboard.next();
			break;
		case "c":
			System.out.println("Going back to main menu");
			running = false;
			return;
		default:
			System.out.println("Invalid input please try again");
			break;
			
	}	
}
}




}
