package softwareconAssignment;

import java.util.Scanner;

public class Grade {
	
	private Student student;
	private Assignments assignment;
	private String grade;
	
	public Grade()
	{
		this.student = null;
		this.grade = null;
		this.assignment = null; 
	}

	public Grade( Student student, Assignments assignment, String grade) {
		this.student = student;
		this.assignment = assignment;
		this.grade = grade;
	}
	
	
	public void UpdateAssignmentGrade(Assignments assignment)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What would you like to change the grade to?");
		System.out.println("Use A, B, C or D");
		String enteredGrade = keyboard.next();
		boolean running = true;
		while(running == true) {
			switch(enteredGrade.toUpperCase())
			{
			case "A":
				if(ValidGrades(enteredGrade))
				{
					this.grade = enteredGrade;
				}
				else {
					System.out.println("Unable to change grade");
				}	
				break;
			case "B":
				if(ValidGrades(enteredGrade))
				{
					this.grade = enteredGrade;
				}
				else {
					System.out.println("Unable to change grade");
				}	
				break;
			case "C":
				if(ValidGrades(enteredGrade))
				{
					this.grade = enteredGrade;
				}
				else {
					System.out.println("Unable to change grade");
				}	
				break;
			case "D":
				if(ValidGrades(enteredGrade))
				{
					this.grade = enteredGrade;
				}
				else {
					System.out.println("Unable to change grade");
				}	
				break;
			case "F":
				if(ValidGrades(enteredGrade))
				{
					this.grade = enteredGrade;
				}
				else {
					System.out.println("Unable to change grade");
				}	
				break;
			case "X":
				System.out.println("Going back to Menu");
				return;
			default:
				System.out.println("Grade does not match any of the above");
				
			}
			
		if(ValidGrades(enteredGrade))
		{
			this.grade = enteredGrade;
		}
		else {
			System.out.println("Unable to change grade");
		}	
	}
	}
	
	
	private boolean ValidGrades(String grade)
	{
		String[] allowedGrades = {"A","B", "C", "D","F"};
		for(int i=0; i<allowedGrades.length; i++) 
		{
			if(allowedGrades[i].equals(grade))
			{
				return true;
			}
		}
		return false;
	}

	public Student getStudent() {
		return student;
	}

	public Assignments getassignment() {
		return assignment;
	}

	public String getGrade() {
		return grade;
	}
	
	

}
