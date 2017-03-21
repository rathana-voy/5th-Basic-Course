package array;

public class ArrayDemo {
	
	public static void main(String[] args){
		
		int[] myArray=new int[10];
		int myArray2[]=new int[10];
		int[] myArray3=new int[]{1,4,5,7,8,6,9,5,5,4,1,2,7,88,5,42,66963,557,985,24};
		
		
		for(int i=0; i<10;i++){
			myArray[i]= i;
		}
	
		System.out.println("==========array 1==========");
		for(int i=0; i<myArray.length;i++){
			System.out.println("myArray["+i+"]="+myArray[i]);
		}
		System.out.println("==========array 2==========");
		for(int j =0; j<myArray2.length;j++){
			System.out.println("myArray2["+j+"]="+myArray2[j]);
		}
		System.out.println("==========array 3==========");
		
		for(int k=0 ; k< myArray3.length ;k++){
			System.out.println("myArray3["+k+"]="+myArray3[k]);
		}
	}

}
