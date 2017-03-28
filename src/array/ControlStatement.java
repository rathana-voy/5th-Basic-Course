package array;

public class ControlStatement {

	
	public static void main(String[] args) {
		A:
			for(int i=0;i<5;i++){
				
				B:
				for(int j=0 ;j<5;j++){
					
					if(j==1){ break A;}
					System.out.print(j);
				}
				
				System.out.println("\t");
			}
	}
}
