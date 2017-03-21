package oop.impl;

public class E extends D{
	
	public void message(){
		System.out.println("class e mothod message() call");
		System.out.println(schoolName);
		System.out.println(E.schoolName);
		System.out.println(D.schoolName);
	}

}
