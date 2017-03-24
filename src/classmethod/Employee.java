package classmethod;

public class Employee extends Person{

	public Employee(){
		super(9528,"Veyo" ,"male");
		super.showInfo();
		System.out.println("Are you empleyee?");
	}
	public Employee(String sms){
		this();
		System.out.println(sms);
	}
	
	public Employee(String sms,String q2){
		this(sms);
		System.out.println(q2);
	}
	
	public void print(){
		super.showInfo();
	}
	public void run(){
		this.print();
		System.out.println(this.youInstaceFor(this));
		
	}
	
	public boolean youInstaceFor(Employee emp){
		return emp instanceof Employee;
	}
}
