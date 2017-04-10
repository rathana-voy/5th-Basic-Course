package exception;

public class ListTooLargeException extends RuntimeException{

	public ListTooLargeException(String sms){
		super(sms);
	}
	
}
