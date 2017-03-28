package javavariable;

import java.util.Scanner;

public class KeyboardReader {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static String readString(){
		return sc.nextLine();
	}
	public static int readInt(String sms){
		int num=0;
		boolean isNotNumber=false;
		
		do{
			System.out.print(sms);
			KeyboardReader.sc.hasNextLine();
			if(KeyboardReader.sc.hasNextInt()){
				num=KeyboardReader.sc.nextInt();
				isNotNumber=true;
				//break;
			}else{
				isNotNumber=false;
				//break;
			}
		}while(!isNotNumber);
		
		return num;
	}

}
