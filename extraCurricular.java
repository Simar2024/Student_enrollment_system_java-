package softwareconAssignment;

public class extraCurricular {

	private String activity;
	private String StartDate;
	private String finishDate;
	private Student member;
	
	public extraCurricular(String activity, String startDate, String finishDate, Student member) {
		this.activity = activity;
		this.StartDate = startDate;
		this.finishDate = finishDate;
		this.member = member;
	}

	public extraCurricular() {
		this.activity = "";
		this.StartDate = "";
        this.finishDate = "";
        this.member = null;
    }
	
}
