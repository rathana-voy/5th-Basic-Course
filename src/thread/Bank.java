package thread;

public class Bank {

	private float balance;
	
	public Bank(float b){
		this.balance=b;
	}
	
	public synchronized void  Withdraw(float amount){
		System.out.println("going withdraw");
		System.out.println("your balance : "+this.balance);
		System.out.println("Amount : "+amount);
		if(this.balance<amount){
			System.out.println("your balance is not enough to withdraw. please wait for diposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.balance-=amount;
			System.out.println("your current balance :" +this.balance);
			System.out.println("withdraw completed");
			
		}
	}
	
	public synchronized void deposit(float amount){
		System.out.println("going deposit");
		this.balance +=amount;
		System.out.println("your new balance :: "+this.balance);
		System.out.println("deposit is complete");
		notify();
	}
}
