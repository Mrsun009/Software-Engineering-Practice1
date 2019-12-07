package Array;

public class Array {
	public String Activity;
	public String StudentID;
	public String Name;
	public String Gender;
	public String Accept;
	
	public Array(String Activity, String StudentID, String Name, String Gender, String Accept) {
		this.setActivity(Activity);
		this.setStudentID(StudentID);
		this.setName(Name);
		this.setGender(Gender);
		this.setAccept(Accept);
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getActivity() {
		return Activity;
	}
	public void setActivity(String activity) {
		Activity = activity;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAccept() {
		return Accept;
	}
	public void setAccept(String accept) {
		Accept = accept;
	}
	public void setActivity(Object updatedActivity) {
		// TODO Auto-generated method stub
		
	}
	public void setName(Object updatedName) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(Object updatedGender) {
		// TODO Auto-generated method stub
		
	
	}

}
