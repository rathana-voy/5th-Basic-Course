package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class ExceptionDemo {
	
	public static void main(String[] args) throws ScoreWrongFormatException {
		/*try{
		File f=new File("E:\\text.txt");
		FileReader fReader=new FileReader(f);
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		/*String[] s =new String[]{"Navee","Tey","SreyRath","Rachana",""};
		System.out.println(s[5]);*/
		
		//try with finally block
		
		/*try{
		
		}finally{
			
		}*/
		
		/*File f=null;
		FileReader fReader=null;
		FileInputStream fin=null;
		//try with catch block
		try{
			f= new File("E:\\test.txt");
			//fReader=new FileReader(f);
			fin=new FileInputStream(f);
			//byte[] b=new byte[1024];
			StringBuffer sbuff=new StringBuffer();
			int content;
			while( (content=fin.read()) !=-1){
				sbuff.append((char) content);
			}
			
			System.out.println(sbuff);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		/*int arr[]=new int[3];
		try(FileInputStream fin=new FileInputStream(new File("e:\\test.txt"))){
			int content;
			while((content=fin.read()) !=-1){
				System.out.print((char)content);
			}
			
			System.out.println(arr[3]);
		
		}catch(IOException | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.toString());
			
		}finally{
			arr[0]=100;
			System.out.println("\n"+arr[0]);
		}
		*/
		
		//try with all block 
		/*try{
			
		}catch(Exception e){
			
		}finally{
			
		}*/
		
		//own exception
		
		Student stu=new Student(100);
		/*try{
		stu.setGender("fmmale");
		System.out.println(stu.getGender());
		
		}catch(WrongFormatException we){
			we.printStackTrace();
		}*/
		
		//unchecked exception
		
		/*LinkedList<Student> list=new LinkedList<>();
		for(int i=0;i<21;i++){
			list.add(new Student(99));
		}
		Report.studentAnaly(list);*/
		
		int i =20;
		float y=i/0;
	}

}
