package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		char[] src=new char[]{'R','A','T','H','A','N','A',' ','V','O','Y'};
		//char[] des=new char[10];
		char[] des=Arrays.copyOfRange(src, 0,7);
		
		System.out.println("----------original-----------");
		System.out.println(new String(src));
		//System.arraycopy(src, 0, des, 0, 7);
		System.out.println("----------after copy---------");
		System.out.println(new String(des));
	}
}
