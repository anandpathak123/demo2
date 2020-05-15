package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Student;

public class ArrayListExample {

	public static void main(String[] args) {
		
		 List<Student> list  = new ArrayList<Student>();

     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 
     list.add(new Student(1,"anand")); 

     
     System.out.println(list.get(0));
     // Displaying the list 
     System.out.println("The list is: \n"
                        + list); 

     // Create an iterator for the list 
     // using iterator() method 
     Iterator<Student> iter  = list.iterator(); 

     // Displaying the values after iterating 
     // through the list 
     System.out.println("\nThe iterator values"
                        + " of list are: "); 
     while (iter.hasNext()) { 
         System.out.println(iter.next() + " "); 
     } 
     
     System.out.println();
  // Displaying the values using java8
     list.forEach(i->System.out.println(i));
 } 

	}

