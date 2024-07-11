package softwareconAssignment;

import java.util.ArrayList;
import java.util.Scanner;


public class Department {
    private String departmentName;
    private String DepartmentHead;
    private ArrayList<Program> programs;
    private int departementID;

public Department(String departmentName, int departementID) {
       this.departmentName = departmentName;
       this.programs = new ArrayList<>();
       this.departementID = departementID;
       this.DepartmentHead = "";
   }

public String getDepartmentName() {
	return departmentName;
}

public String getDepartmentHead() {
	return DepartmentHead;
}

public ArrayList<Program> getPrograms() {
	return programs;
}

public int getDepartementID() {
	return departementID;
}

public void departmentDetails()
{
	Scanner keyboard = new Scanner(System.in);
	boolean running =true;
	while(running == true){
	System.out.println("-------Department Details menu-------");
	System.out.println("-------------------------------------");
	System.out.println("Department Menu - type an option then press Enter");
	System.out.println("A. View Department Details"); // need to add grades.
	System.out.println("B. View Program Details");
	System.out.println("C. To go back main menu");
	String inputChoice = keyboard.next();
	switch(inputChoice.toLowerCase())
	{
	case "a":
		System.out.println("Department details");
		FileIO.readFromDepartment(inputChoice);// the department id will be the input
		break;
	case "b":
		System.out.println("Program details");
		FileIO.readFromDepartment(inputChoice);//read the program name and the list of students in the program.
		break;
	case "c":
		running = false;
		return;
	default:
		System.out.println("Invalid input please tryb again");
		break;
	}
	}
	
	
	
}

}
