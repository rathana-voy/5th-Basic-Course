package nestedclass;

public class Student extends Person {

	private static String schoolName;
	private int grade;

	static {
		schoolName = "KSHRD";
	}

	public Student() {
	}

	public Student(String name, String gender, int age, int grade) {
		super(name, gender, age);
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		String address= super.toString();
		return "Student : "+ this.getName()+"\t\ngrade  : " +this.getGender()+ "\t\nAge : " +this.getAge()+
				"\t\nSchool : "+this.getSchoolName()+ "\t\nGrade : " +this.getGrade() +
				"Address : " +address;
	}
    
}
