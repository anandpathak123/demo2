package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import entity.Student;

public class TreeSetExample {

	public static void main(String[] args) {
		
    Set<Student> list  = new TreeSet<Student>();

   list.add(new Student(1,"anand")); 
   list.add(new Student(1,"bikram")); 
   list.add(new Student(1,"chandu")); 
   list.add(new Student(1,"duggu")); 
   list.add(new Student(1,"hina")); 
   list.add(new Student(1,"jitu")); 
   list.add(new Student(1,"kabir")); 
   list.add(new Student(1,"amit")); 

   // Displaying the list 
   System.out.println("The list is: \n"
                      + list); 

   // Create an iterator for the list 
   // using iterator() method 
   Iterator<Student> iter  = list.iterator(); 

   // Displaying the values after iterating 
   // through the list 
   System.out.println("\nThe iterator values"
                      + " of treeset are: "); 
   while (iter.hasNext()) { 
       System.out.println(iter.next() + " "); 
   } 
   
   System.out.println();
// Displaying the values using java8
   list.forEach(i->System.out.println(i));
} 
	
}
