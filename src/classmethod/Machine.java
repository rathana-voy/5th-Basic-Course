package classmethod;

public class Machine {

	float fource;
	
	public void setFource(float f){
		this.fource=f;
	}
	public float getFource(){
		return this.fource;
	}
	
	public Machine(){
		new Car(this).Display();
	}
}
