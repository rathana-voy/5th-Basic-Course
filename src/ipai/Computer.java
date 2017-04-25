
package ipai;
interface Printable{
	void printBlackWhite();
	void mixColor();
}
interface Displayable{
	void displayNVIDIA();
	void displayItelFamily();
}
public class Computer implements Printable , Displayable{
	@Override
	public void displayNVIDIA() {
		System.out.println("NIVDIA display");
	}
	@Override
	public void displayItelFamily() {
		System.out.println("INTEL FAMILY display");
	}
	@Override
	public void printBlackWhite() {
		System.out.println("black & white print");
	}
	@Override
	public void mixColor() {
		System.out.println("mix color here");
	}

}


