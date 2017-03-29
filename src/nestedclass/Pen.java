package nestedclass;

public class Pen {

	public int length=3;
	private static String brance="Inc";
	class FirstLevel{
		public int lenght=2;
		public void penLength(int length){
			
			System.out.println("length = "+ length);
			System.out.println("this.length = "+ this.lenght);
			System.out.println("Pen.this.length = "+ Pen.this.length);
			System.out.println("Pen.brance = "+Pen.brance);
		}
	}
	
	public static void main(String... strings){
		Pen p=new Pen();
		Pen.FirstLevel fl=p.new FirstLevel();
		fl.penLength(1);
	}
}
