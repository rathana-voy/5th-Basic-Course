package method;

public class Person {

	String name;
	int age;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){return this.name;}
	
	
	public void print(){
		this.input(this);
		
	}
	
	public Person(){
		this("Test",18);
		System.out.println("default constructor ");
	}
	
	public Person(String name,int age){
		System.out.println("default constructor with two param");
		this.name=name;
		this.age=age;
	}
	public Person(String name){
		this.name=name;
		System.out.println("default constructor with one param");
	}
	
	public void print(char ...sms){
		
		for(char s : sms){
			System.out.print(s + " ");
		}
	}
	
	public void input(Person p){
		p.name="Test";
		p.age=15;
	}
	
	
	
}
