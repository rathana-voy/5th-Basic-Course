package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//ObjectOne obj1= new ObjectOne();
		//obj1.start();
		//System.out.println(obj1.getName());
		
		/*Thread th1=new Thread(new ObjectOne());
		th1.start();
		System.out.println(th1.getName());
		
		try {
			th1.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	
		Thread th1=new Thread(new ObjectTwo("thread-1"));
		Thread th2=new Thread(new ObjectTwo("thread-2"));
		Thread th3=new Thread(new ObjectTwo("thread-3"));
		Thread th4=new Thread(new ObjectTwo("thread-4"));
		
		th1.start();
		th2.start();
		try {
			th1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th2.notify();
		
		//th1.start();
		/*try {
			th1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		/*th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th3.start();
		try {
			th3.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th4.start();
	
		try {
			th4.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		//test set priority
//		th1.setPriority(1);
//		th2.setPriority(3);
		th3.setPriority(10);
		th4.setPriority(10);
		
		//th1.start();
		//Thread.yield();
		//th2.start();
		//Thread.yield();
		//th3.start();
		//Thread.yield();
		//th4.start();
		//Thread.yield();
		
		//test wait
		
		/*Bank bank=new Bank(5000f);
		new Thread( new Runnable() {
			@Override
			public void run() {
				bank.Withdraw(6000);
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				bank.deposit(2000);
			}
		}).start();*/
	}
}
