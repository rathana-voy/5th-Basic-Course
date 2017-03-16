package oop.impl;

public class Overloading {
	
	int sum(int x, int y){
		return x+y;
	}
	
	int sum(double x,double y){
		int rs= (int)x + (int)y;
		return rs;
	}

	public static void main(String[] args) {
		Overloading o=new Overloading();
		System.out.println(o.sum(9,7));
	}
}
