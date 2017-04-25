package thread;

public class JoinDemo {

	public static void main(String[] args) {
		Display2 d=new Display2("thread-1");
		
		d.start();
		/*try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for(int i=0;i<10;i++){
			System.out.println("main Thread");
		}
	}
}

class Display2 extends Thread{
	String name;
	Display2(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(this.name+" "+ i);
		}
	}
}
