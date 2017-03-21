package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import oop.impl.C;
import oop.impl.D;
import oop.impl.E;
import oop.repo.A;
import oop.repo.B;

public class Demo {
	
	A a;
	String s;
	public static void main(String[] args) {
		
		/*C c=new C();
		c.message();
		c.d();
		c.d("your name");*/
		
		/*B b=new C();
		b.show();
		b.print();*/
		
		/*A a=new C();
		a.show();
		
		new D().d();*/
		
		/*C cc= (C) new C();
		D dd=(D) cc; //upcasting
		dd.d();*/
		
		/*System.out.println(new Demo().a);
		
		Pserson person=new Pserson();
		person.setAge(18);*/
		
		
		E ee = new E();
		ee.message();

		Scanner sc = new Scanner(System.in);
		System.out.println("Age");
		int age = sc.nextInt();
		 System.out.println(age);
		 sc.nextLine();
		 System.out.println("Name");
		 String name = sc.nextLine();
		 System.out.println(name);
		 System.out.println(sc.nextLine());
		
//		BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			System.out.print("Name : ");
//			String name = buff.readLine();
//			System.out.println(name);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		 
		
		
	}

}
