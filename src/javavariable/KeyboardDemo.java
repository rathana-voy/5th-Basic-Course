package javavariable;

public class KeyboardDemo {

	public static void main(String[] args) {
		System.out.print("Enter your name : ");
		System.out.println("Name :" +KeyboardReader.readString());
		System.out.println("Age :" +KeyboardReader.readInt("Enter your Age : "));
	}
}
