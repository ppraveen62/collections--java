package collections;

import java.util.*;
public class hashset {

	public static void main(String[] args) {

		//creating hashset

        System.out.println("HashSet");
    HashSet<Integer> set=new HashSet<Integer>();
    set.add(101);
    set.add(104);
	set.add(102);
	set.add(105);
	set.add(103);
	set.add(102);
    set.add(104);
	System.out.println(set);

HashSet<String> city=new HashSet<String>();
city.add("Hyderabad");
city.add("Delhi");
city.add("Bangalore");
city.add("Amritsar");
city.add("Delhi");
System.out.println(city);
		
	}

}