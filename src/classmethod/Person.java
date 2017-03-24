package classmethod;

public class Person {
	
	int id;
	String name;
	String gender;
	
	public Person(){}
	public Person(int id,String name){
		this.id=id;this.name=name;
	}
	public Person(int id,String name,String gender){
		this.id=id;this.name=name;this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void showInfo(){
		System.out.println("ID : "+this.getId() + "\nName : "+this.getName()+
				"\nGneder : "+this.getGender());
	}
	
}
