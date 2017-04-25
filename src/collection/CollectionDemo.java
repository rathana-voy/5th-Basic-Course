package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		
		CollectionDemo collection=new CollectionDemo();
		List<String> v=new Vector<String>();
		/*v.add("book");
		v.add("pen");
		v.add("bag");
		v.add("ruler");
		v.add("pencail");*/
		
		v.add("ភ្នំពេញ");
		v.add("បាត់ដំបង");
		v.add("សៀមរាប");
		/*
		System.out.println("------original------");
		v.forEach( a->  System.out.println(a));
		Collections.sort(v);
		System.out.println("------sort vector asc-------");
		v.forEach(System.out::println);
		
		Comparator<String> comparator = Comparator.reverseOrder();
		Collections.sort(v,comparator);
		System.out.println("------sort vector desc-------");
		v.forEach(System.out::println);*/
		
		/*ArrayList<String> arrLists=new ArrayList<String>();
		arrLists.add("Phnom Penh");
		arrLists.add("Battambang");
		arrLists.add("Siem Reap");
		arrLists.add("Kompong Som");
		arrLists.add("Kos Kong");
		arrLists.add("Phai Len");
		arrLists.add("Kompong Cham");
		
		arrLists.add("ភ្នំពេញ");
		arrLists.add("បាត់ដំបង");
		arrLists.add("សៀមរាប");
		arrLists.add("ប៉ៃលិន");
		arrLists.add("កោះកុង");
		arrLists.add("កំពងសោម");
		arrLists.add("កំពងឆ្នាំង"); 
		Iterator iterator= arrLists.iterator();
		System.out.println("-----original-----");
		while(iterator.hasNext()) System.out.println(iterator.next());
		System.out.println("-----shorted -----");
		Collections.sort(arrLists);
		arrLists.forEach(System.out::println);
		
		System.out.println("-----maniputate data------");
		arrLists.set(2, "បានលុង");
		collection.output(arrLists);
		System.out.println("-----retain data------");
		//arrLists.retainAll(v);
		collection.output(arrLists);
		System.out.println("-----contain data------");
		System.out.println(arrLists.containsAll(v));
		*/
		
		
		 /*LinkedList<String> linkedList=new LinkedList<String>();
		 linkedList.add("banan");
		 linkedList.add("apple");
		 linkedList.add("greap");
		 linkedList.add("watermelon");
		 linkedList.add("Durain");
		 linkedList.add("Mango");
		 Iterator iterator= linkedList.iterator();
		 while(iterator.hasNext()) System.out.println(iterator.next());
		
		 double startTime = System.currentTimeMillis();
		 for(int i=0 ; i<100;i++){
			 linkedList.add("Mango "+i); 
		 }
		// ... do something ...
		double estimatedTime = System.currentTimeMillis() - startTime;
		 System.out.println("start add : "+startTime);
		 System.out.println("output estimated Time : "+ estimatedTime +"mn");
		 
		 collection.output(linkedList);*/
		 /*
		 System.out.println("-------original----");
		 collection.output(linkedList);
		 System.out.println(linkedList.size());
		 linkedList.stream();
		 System.out.println(linkedList.size());*/
		
		/*Set<Object> hashSet=new HashSet<>();
		hashSet.add("Java");
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("Javascript");
		hashSet.add("css");
		hashSet.add("spring");
		hashSet.add("angular2");
		hashSet.add("android");
		hashSet.forEach(System.out::println);*/
		
		/*Set<String> treeSet=new TreeSet<>();
		treeSet.add("Map book pro 2016");
		treeSet.add("Dell");
		treeSet.add("Alineware");
		treeSet.add("MSI");
		treeSet.add("Map book pro 2016");
		treeSet.forEach(System.out::println);*/
		
		/*Map<String,Object> map=new HashMap<>();
		map.put("Name", "chantha");
		map.put("Age", 19);
		map.put("Dob", "13-05-1995");
		map.put("Phone", "099 88 15 14");
		map.put("Id", "001524");
		map.put("Id", "0012");
		
		for(Map.Entry<String,Object> entry : map.entrySet()){
			System.out.println("\""+entry.getKey()+"\":\""+ entry.getValue()+"\"" );
		}*/
		
		/*Map<String ,Object> map=new TreeMap<>();
		map.put("Name", "chantha");
		map.put("Age", 19);
		map.put("Dob", "13-05-1995");
		map.put("Phone", "099 88 15 14");
		map.put("Id", "001524");
		map.put("Id", "0012");
		map.put("Email", null);
		map.put("Password", null);
		for(Map.Entry<String,Object> entry : map.entrySet()){
			System.out.println("\""+entry.getKey()+"\":\""+ entry.getValue()+"\"" );
		}*/
		
		
	}
	
	
}
