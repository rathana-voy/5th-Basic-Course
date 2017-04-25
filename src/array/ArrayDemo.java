package array;

import java.awt.AWTException;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayDemo {
	
	public static void main(String[] args){
		
		/*int[] myArray=new int[10];
		int myArray2[]=new int[10];
		int[] myArray3=new int[]{1,4,5,7,8,6,9,5,5,4,1,2,7,88,5,42,66963,557,985,24};
		
		for(int i=0; i<10;i++){
			myArray[i]= i;
		}
	
		System.out.println("==========array 1==========");
		for(int i=0; i<myArray.length;i++){
			System.out.println("myArray["+i+"]="+myArray[i]);
		}
		System.out.println("==========array 2==========");
		for(int j =0; j<myArray2.length;j++){
			System.out.println("myArray2["+j+"]="+myArray2[j]);
		}
		System.out.println("==========array 3==========");
		
		for(int k=0 ; k< myArray3.length ;k++){
			System.out.println("myArray3["+k+"]="+myArray3[k]);
		}*/
		
		
		String url="http://news.sabay.com.kh/sdfs/-ksdfl";
		String[] surl=null;
		//surl=url.split(".*[/]");
		/*String sub=url.substring(0,url.length()-1);
		System.out.println(sub);*/
		/*for(String s:surl){
			System.out.println(s);
		}*/
		
		/*if(url.matches(".*[/]")){
			System.out.println("match");
		}*/
		if(url.matches(".*[/]")){
			while(url.matches(".*[/]")){
				url =  url.substring( 0,url.lastIndexOf("/") );
				System.out.println(url);
			}
		}
		/*for(String s:arr){
			System.out.println(s);
		}*/
		
	
		/*try{
			
		}catch(Format e){
			
		}*/
		
		double [] d=new double[] {9.0,9.0};
	}
}


class CheckedException extends Exception{
	CheckedException(){
		System.err.println("have an error occour");
	}
}

class UncheckedException extends RuntimeException{
	UncheckedException(){
		System.err.println("have an error occour");
	}
}

