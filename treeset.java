package collections;


//Java program to Illustrate Working of  TreeSet 

import java.util.*;

//Main class
public class treeset {

 public static void  main(String[] args)
 {
     // Creating a Set interface with reference to
     // TreeSet
     Set<String> ts1 = new TreeSet<>();

     // Elements are added using add() method
     ts1.add("A");
     ts1.add("B");
     ts1.add("C");

     // Duplicates will not get insert
     ts1.add("C");

     // Elements get stored in default natural
     // Sorting Order(Ascending)
     System.out.println(ts1);
 }
}
