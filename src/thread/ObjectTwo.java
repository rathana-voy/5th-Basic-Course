package thread;

public class ObjectTwo implements Runnable{
	private String threadName;
	public ObjectTwo(String name) {
		this.threadName=name;
	}
	@Override
	public void run() {
			//Thread.sleep(4000);
			System.out.println("Thread : "+this.threadName+" is running ...");	
	}

}
