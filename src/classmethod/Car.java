package classmethod;

public class Car {

	Machine machine;
	
	public Car(Machine m){
		this.machine=m;
		this.machine.setFource(5.6f);
	}
	
	public void Display(){
		System.out.println(this.machine.getFource());
	}
}
