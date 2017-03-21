package javavariable;
public class Demo {
	
	public static void main(String[] args) {
		មនុស្ស person=new មនុស្ស();
		person.setឈ្នេាះ("រត្តនា");
		person.setភេទ("ប្រុស");
		person.setថ្ងៃខែឆ្នាំកំណើត("២៣-១២-១៩៩៣");
		System.out.println(person.toString());
		
		/*short age=18;
		long $id_ =6786865L;
		double $=2e1;
		double _ =123.4e1;
		char c ='g';
		System.out.println(age);
		System.out.println($id_);
		System.out.println($);
		System.out.println(_);
		System.out.println("I live in Teok \n Laork commune ");
		*/
		
		/*long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		int x=0b1100;*/
		//System.out.println(x);
		/*System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
		System.out.println(hexBytes);
		System.out.println(hexWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);*/
		
		/*char c=66;
		char c2= 54;
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c+1);*/
		
		/*int a =19;
		Integer i =18;
		a= i.intValue();
		System.out.println(i);
		*/
		//promotion
		
		/*double d= 9/2;
		System.out.println(d);*/
		
		
		 /*float fmin = Float.NEGATIVE_INFINITY;
	        float fmax = Float.POSITIVE_INFINITY;
	        System.out.println("long: " + (long)fmin +
	                           ".." + (long)fmax);
	        System.out.println("int: " + (int)fmin +
	                           ".." + (int)fmax);
	        System.out.println("short: " + (short)fmin +
	                           ".." + (short)fmax);
	        System.out.println("char: " + (int)(char)fmin +
	                           ".." + (int)(char)fmax);
	        System.out.println("byte: " + (byte)fmin +
	                           ".." + (byte)fmax);
	        
	        
	        double dd =4.5;
	        System.out.println(dd);
	        System.out.println((float)dd);
	        System.out.println((long)dd);
	        System.out.println((int)dd);
	        System.out.println((short)87890987);
	        System.out.println((byte)dd);
	        System.out.println((char)dd);
	        
	        Object b= new មនុស្ស();
	        	មនុស្ស  p = (មនុស្ស) b;
	        	p.setឈ្នេាះ("boy");
	        	System.out.println(p.getឈ្នេាះ());
	        	short s =12;
	        	float f= s;
	        	System.out.println(f);
	        	*/
		
				/*int x =5;
				int y = x++;
				int z =x++;
				System.out.println(y);
				System.out.println(z);*/
		
		//bitwise operator
		
		int x=3;
		int y =2;
		System.out.println( x | y); 
		/*
		 * 11 
		 * 10 
		 * ------
		 * 11
		 */
		System.out.println( x & y);
		/*
		 * 11 
		 * 10 
		 * ------
		 * 10
		 */
		System.out.println(~12);
		/*
		 * 10 
		 * ------
		 *  01
		 */
		int xx =20;
		int yy=2* xx++;
		int z =2* ++xx;
		
		/*System.out.println(yy);
		System.out.println(xx);
		System.out.println(z);*/
		
		short bb=60;
		/*
		 * 0011 1100
		 * 1111 0000 (left shift)
		 * 
		 * 0000 1111 
		 */
		System.out.println(Integer.toBinaryString(bb));
		System.out.println(Integer.toBinaryString(bb >>2) +"D : "+ (bb>>2));
		System.out.println(Integer.toBinaryString(bb >>>2)+"D : "+ (bb>>>2));
		
		System.out.println(Integer.toBinaryString(bb <<2)+"D : "+ (bb<<2));
		/*
		 * 01111000
		 * 
		 */
		/*
		 * 11
		 * 10 
		 * ------
		 * 01
		 */
		
	        	/*boolean bb =true;
	        	int i=2;
	        	if(bb ^i==1){
	        		bb=false;
	        		System.out.println(bb);
	        	}else{
	        		System.out.println(bb);
	        	}*/
	        	
	        	
	        
	}

}
