package nestedclass;

import java.awt.Image;

import oop.impl.E;

public class Employee {

	private String name;
	private String gender;
	private int age;
	
	Employee(){
	
	}
	public void display(){
		System.out.println( age +gender );
	}

	class InnerEmployee{
		
		public InnerEmployee() {}
		public InnerEmployee(String name,String gender){
			this.setName(name);
			this.setGender(gender);
		}
		
		public String getGender() {
			return Employee.this.gender;
		}
		public void setGender(String gender) {
			Employee.this.gender = gender;
		}
		public String getName() {
			return Employee.this.name;
		}
		public void setName(String name) {
			Employee.this.name = name;
		}
		public int getAge() {
			return Employee.this.age;
		}
		public void setAge(int age) {
			Employee.this.age = age;
		}
		
		public void display(){
			System.out.println(this.getName() +"\n "
					+ this.getGender() +"\n"+
					this.getAge());
		}
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		Employee.InnerEmployee inEmp=emp.new InnerEmployee();
		inEmp.setName("Reathan");
		inEmp.setGender("male");
		inEmp.setAge(16);
		inEmp.display();
				
	}
}
