package collections;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections clas

public class arraylst {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    cars.get(0);//acess an item
    cars.set(0, "Opel"); //change an item
    System.out.println(cars);
    Collections.sort(cars);  // first import collections thenSort cars 
    System.out.println(cars);
    cars.remove(0);//remove an item
    System.out.println(cars);
    cars.clear(); //remove all items
    System.out.println(cars);
    cars.size(); //size of list
    System.out.println(cars);

  }
}
