package oop.impl;

import oop.repo.B;

public class C extends D implements B {

	public void message(){
		System.out.println("message() : method execute");
	}

	@Override
	public void print() {
		System.out.println("print() : method execute");
		
	}

	@Override
	public void show() {
		System.out.println("show() : method execute");
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemClick() {
		// TODO Auto-generated method stub
		
	}
	
	public void d(String s){
		System.out.println("d() in C execute: "+s);
	}
	
	
	
	
}
