package ipai;

public class Employee {
	
	public Employee(){
		System.out.println("parent class contructor");
	}
	int id;
	String name;
	Address address;
}

class Address extends Employee{
	public Address(String city){}
	
	
	String city;
	String province;
	String district;
}