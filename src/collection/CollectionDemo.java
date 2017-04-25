package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("book");
		list.add("pen");
		list.add("ruler");
		list.add("bag");
		list.add("book");
		
		list.sort(null);
		Vector<String>v=new Vector();
		list.forEach(a->v.add(a));
		v.forEach(a->System.out.println(a));
		
		Iterator<String> i=list.iterator();
		/*for(String ii:i){
			System.out.println(ii);
		}*/
		
		//list.forEach(a->System.out.println(a));
		
	}
}
