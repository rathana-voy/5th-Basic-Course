package thread;

public class ObjectOne extends Thread{

	private Thread th1;
	@Override
	public void run() {
		System.out.println("thread one running ...");
	}
	
	public void start(){
		if (th1==null) this.th1=new Thread(this,"Object one of thread one");
		this.th1.start();
		
	}

}
