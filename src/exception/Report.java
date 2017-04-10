package exception;

import java.util.List;

public class Report {

	public static void studentAnaly(List<Student> lists){
		if(lists.size()<=20){
			System.out.println("amount of students medium");
		}else{
			throw new ListTooLargeException("amount of students are too large");
		}
	}
}
