package classmethod;

public class Student extends Person{

	private String schoolName;
	private String grade;
    public Student(){}
	public Student(int id,String name,String gender,String schoolName){
		super(id,name,gender);
		this.schoolName=schoolName;
	}
	
	public void StudentInfo(){
		super.showInfo();
		System.out.println("School Name :" + this.getSchoolName()+
				"\nGrade : "+this.getGrade());
	}
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print(){
		this.StudentInfo();
	}
	
}
