package collections;
import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
		System.out.println("ArrayList:");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Bangalore");
		city.add("Delhi");
		city.add("Hyderabad");
		System.out.println(city);
		city.add(2,"Mumbai");
		System.out.println(city);
		for(String x:city) {
			System.out.println(x);
		}
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector:");
		Vector<Integer> vec=new Vector<Integer>();
		vec.addElement(15);
		vec.addElement(30);
		
		System.out.println(vec);
		for(int x:vec) {
			System.out.println(x);
		}
		
		//creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList:");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Jay");
		names.add("Mendu");
		names.add("John");
		System.out.println(names);
		for(String x:names) {
			System.out.println(x);
		}

}
}
