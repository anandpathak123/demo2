package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import entity.Student;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		 List<Student> list  = new LinkedList<Student>();

    list.add(new Student(1,"anand")); 
    list.add(new Student(1,"anand")); 
    list.add(new Student(1,"anand")); 
    list.add(new Student(5,"sunita")); 
    list.add(new Student(5,"Rupali")); 
    list.add(new Student(4,"anish")); 
    list.add(new Student(3,"kamlesh")); 
    list.add(new Student(2,"ravi")); 
    
    List<Integer> list2  = new LinkedList<Integer>();
      list2.add(new Integer(7));
      list2.add(8);
      list2.add(31);
      list2.add(67);
      
      System.out.println(list2.get(0));
      list2.forEach(i->System.out.println(i));
      
      Iterator< Student> itr=list.iterator();
      while(itr.hasNext())
      {
    	  Student st=itr.next();
    	  if(st.getName().equalsIgnoreCase("anish")||st.getName().equalsIgnoreCase("Rupali"))
    	  {
    		  System.out.println(st);
    	  }
      }
      
    // Displaying the list 
		/*
		 * System.out.println("The list is: \n" + list);
		 * 
		 * // Create an iterator for the list // using iterator() method
		 * Iterator<Student> iter = list.iterator();
		 * 
		 * // Displaying the values after iterating // through the list
		 * System.out.println("\nThe iterator values" + " of list are: "); while
		 * (iter.hasNext()) { System.out.println(iter.next() + " "); }
		 */
} 
}
