package ipai;

public class User {

	private String userId;
	private String userName;
	private String cardNumber;
	private String password;
	
	public User(){	}
	public User(String userId,String userName,String cardNumber,String password){
		this.userId=userId;this.userName=userName;this.cardNumber=cardNumber;this.password=password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
