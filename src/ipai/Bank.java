package ipai;

public abstract class Bank {
	public abstract float checkBalance(String cardNumber ,String password);
}
class ABank extends Bank{

	@Override
	public float checkBalance(String cardNumber, String password) {
		return 20f;
	}
}
class BBank extends Bank{
	@Override
	public float checkBalance(String cardNumber, String password) {
		return 10f;
	}
	
}


