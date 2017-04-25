package ipai;

public class Car extends Vehicle{

	int wheel;
	
	public void setWheel(int wheel){
		this.gear=34;
		this.wheel=wheel;
	}
	
	@Override
	public void ride() {
		System.out.println("ride method in subclass");
		
	}
}
