package nestedclass;

public class LocalClass {

	public void speek(String text){
		
		String speeker="book";
		
		class Translate{
			String speek;
			
			public Translate (String sp){
				this.speek=sp;
			}
			
			public void restult(){
				if(this.speek.equals(speeker)){
					System.out.println("칙");
				}
				
			}
		}
		
		new Translate(text).restult();
	}
	
	public static void main(String[] args) {
		new LocalClass().speek("book");
	}
	
}
