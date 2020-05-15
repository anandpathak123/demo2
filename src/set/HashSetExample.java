package set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import entity.Student;

public class HashSetExample {
	public static void main(String[] args) {
		
		 Set<Student> set  = new HashSet<Student>();

    set.add(new Student(1,"anand")); 
    set.add(new Student(1,"anand")); 
    set.add(new Student(2,"anish")); 
    set.add(new Student(4,"ravi")); 
    set.add(new Student(5,"rupali")); 
    set.add(new Student(6,"mahesh")); 
    set.add(new Student(9,"ramu")); 
    set.add(new Student(10,"himesh")); 
    System.out.println(set.size());
    
  Set<String> stringSet=new HashSet<String>();
    stringSet.add("anish");
    stringSet.add("anish");
    stringSet.add("rupali");
    stringSet.add("jatin");
    stringSet.add("ayush");
    stringSet.add("shridhar");
    System.out.println(stringSet.size());
    
    Set<Integer> set2=new HashSet<Integer>();
               set2.add(2);
               set2.add(1);
               set2.add(7);
    // Displaying the set 
    System.out.println("The set is: \n"
                       + set); 

    // Create an iterator for the set 
    // using iterator() method 
    Iterator<Student> iter  = set.iterator(); 

    // Displaying the values after iterating 
    // through the set 
    System.out.println("\nThe iterator values"
                       + " of set are: "); 
    while (iter.hasNext()) { 
        System.out.println(iter.next() + " "); 
    } 
} 
	
}
