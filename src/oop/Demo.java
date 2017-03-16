package oop;

import oop.impl.C;
import oop.impl.D;
import oop.repo.A;
import oop.repo.B;

public class Demo {
	
	A a;
	public static void main(String[] args) {
		
		C c=new C();
		c.message();
		c.d();
		c.d("your name");
		
		B b=new C();
		b.show();
		b.print();
		
		A a=new C();
		a.show();
		
		new D().d();
		
		C cc= (C) new C();
		D dd=(D) cc; //upcasting
		dd.d();
		
		System.out.println(new Demo().a);
		
		Pserson person=new Pserson();
		person.setAge(18);

	}

}
