package classmethod;

public class Demo {

	public static void main(String[] args) {
		
		Student[] student= new Student[3];
		student[0]=new Student();
		student[1]=new Student();
		student[2]=new Student();
		
		student[0].setId(9678);
		student[0].setName("Rathana");
		student[0].setGender("Male");
		student[0].setSchoolName("Korea Software HRD Center");
		student[0].setGrade("Advance Course");
		//student[0].StudentInfo();
		
		/*
		 * test this and this()
		 */
		//Employee emp=new Employee("Yes, I am.","Where do you work place?");
		//emp.run();
		
		new Machine();
	}
}

