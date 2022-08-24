package collections;

import java.util.*;
public class iterator1 {

	public static void main(String[] args) {
		
		//creating linkedlist
		System.out.println("LinkedList:");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Jay");
		names.add("Mendu");
		names.add("John");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator(); //getting itreator
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
	}

}
