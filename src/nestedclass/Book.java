package nestedclass;

public class Book {

	public void OnReadLine(Readable read){
	
		System.out.println(read.read()+" success");
	}
	
	public static void main(String[] args) {
		Book book=new Book();
		book.OnReadLine(new Readable() {
			//int a;
			@Override
			public String read() {
				int a = 0;
				// TODO Auto-generated method stub
				return a + " Hello KPS";
			}
		});
		
		Unreadable unRead=new Unreadable() {
			private String name;
			private int age;
			
			@Override
			public String unRead() {
				// TODO Auto-generated method stub
				return "the method cannot read" + getName()+ " " +getAge();
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		};
		
		System.out.println(unRead.unRead()+ unRead.NOT_READ);
	}
	
}
