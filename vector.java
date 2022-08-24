package collections;

//working of Vector
import java.util.*;

public class vector{
   public static void main(String[] args)
 {

     // Declaring the Vector
     Vector<Integer> v = new Vector<Integer>();
         v.add(1);
         v.add(2);
         v.add(3);
         v.add(4);

 
     System.out.println(v);

     // Remove element at index 3
     v.remove(3);
     System.out.println(v);

     // Printing elements one by one
     for (int i = 0; i < v.size(); i++)
         System.out.print(v.get(i) + " ");
 }
}