package collections;

import java.util.*;
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LinkedHashSet:");
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(13);
		set.add(11);
		System.out.println(set);
	}

}