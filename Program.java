package softwareconAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	private int ProgramID;
	private String programLeader;
	private String ProgramName;
	private ArrayList<Course> coursesOffered;
	
	public Program() {
        this.ProgramID = 0;
        this.ProgramName = "";
        this.coursesOffered = new ArrayList<>();
        this.programLeader = "";
    }
	
	public Program(int programID, String programName) {
        this.ProgramID = programID;
        this.ProgramName = programName;
        this.coursesOffered = new ArrayList<>();    
    }
	
	 public void addCourse(Course course) {
	        coursesOffered.add(course);
	    }

	 public void removeCourse(Course course) {
	        coursesOffered.remove(course);
	    }

	public int getProgramID() {
		return ProgramID;
	}

	public String getProgramLeader() {
		return programLeader;
	}

	public String getProgramName() {
		return ProgramName;
	}

	public ArrayList<String> getCoursesOffered() {
	    ArrayList<String> courseNames = new ArrayList<>();
	    for (Course course : coursesOffered) {
	        courseNames.add(course.getCourseName());
	    }
	    return courseNames;
	}


	public void programDetails()
	{
		Scanner keyboard = new Scanner(System.in);
		boolean running = true;
		while(running == true)
		{
			System.out.println("-----Program Details-----");
			System.out.println("-------------------------");
			System.out.println("Courses Menu - type an option then press Enter");
			System.out.println("A. View Program "); // need to add grades.
			System.out.println("B. To go back");
			String inputChoice = keyboard.next();
			switch(inputChoice.toLowerCase()) {
			case "a":
				System.out.println("Courses in the Program");
	            FileIO.readFromFile(inputChoice);//the name of the student or id
				
	            System.out.println("Press anykey then enter to see options again or X to exit");
	            String back = keyboard.next();
	            if(back == "x" || back =="X")
	            {
	            	running = false;
	            }
				break;
				
			case "b":
				System.out.println("Returning to menu");
				return;
			default:
				System.out.println("Invalid input please try again");
				break;
				
		}	
			
		}
	}
	    
	 
}
