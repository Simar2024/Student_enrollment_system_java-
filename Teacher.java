package softwareconAssignment;

public class Teacher extends Person 
{
private int teacherID;
private Department department;

public Teacher(int id, String name, String DOB, int teacherID, Department department) {
    super(id, name, DOB);
    this.teacherID = teacherID;
    this.department = department;
}


public String toString(){
	return null;}

public void saveToFile(){}
}

