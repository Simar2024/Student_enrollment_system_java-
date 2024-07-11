package softwareconAssignment;


public class Assignments {
	
	private int assignID;
	private String assignName;
	private Course course;
	private Grade grade;
	
	public Assignments(int assignID, String assignName, Course course) {
        this.assignID = assignID;
        this.assignName = assignName;
        this.course = course;
        
    }
	
	public Assignments()
	{
		this.assignID = 0;
		this.assignName = null;
		this.grade = null;
	}

	public int getAssignID() {
		return assignID;
	}

	public String getAssignName() {
		return assignName;
	}

	public Course getCourse() {
		return course;
	}

	public Grade getGrade() {
		return grade;
	}

	

	
	
	
}
