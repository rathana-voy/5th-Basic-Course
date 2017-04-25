package ipai;

public class Vehicle {

	protected float speed;
	protected int gear;
	
	public void setSpeed(float speed){
		this.speed=speed;
	}
	
	public void ride(){
		System.out.println("ride method in superclass");
	}
}
