package thread;

public class SynchonizedDemo {
	
	public static void main(String[] args) {
		
		Greating g=new Greating();
		Greating g2=new Greating();
		MyThread t=new MyThread("rathana", g);
		MyThread t2=new MyThread("Vansa", g2);
		t.start();
		t2.start();
		
	}
}

class MyThread extends Thread{
	String name;
	Greating g;
	
	public MyThread(String name,Greating g){
		this.name=name;
		this.g=g;
	}
	@Override
	public void run() {
		g.morningGreating(this.name);
	}
}

class Greating {
	public static synchronized void morningGreating(String name){
		for(int i=0;i<10;i++){
			System.out.print("Good morining ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}


