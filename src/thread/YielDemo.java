package thread;

public class YielDemo {

	public static void main(String[] args) {
		
		Display d=new Display();
		d.start();
		for(int i=0;i<10;i++){
			System.out.println("main Thread");
		}
	}
}

class Display extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			Thread.yield();
		}
	}
	
}
