package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entity.Student;

public class HashMapExample {

	
	public static void main(String args[]) 
	   { 
	       Map< String,Student> hm = new HashMap< String,Student>(); 
	                                 
	       hm.put("a", new Student(1,"anand")); 
	       hm.put("b",new Student(1,"anand")); 
	       hm.put("c",new Student(1,"anand")); 
	       hm.put("d",new Student(1,"anand")); 
	  
	       // Returns Set view      
	       Map< String,Set<Student>> hm2 = new HashMap< String,Set<Student>>(); 
	     
	  
	      
	       hm.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
	       
	       
	       
	       Set<Entry<String, Student>> st = (Set<Entry<String, Student>>) hm.entrySet().stream().filter(i->i.getKey().equalsIgnoreCase("a")).collect(Collectors.toSet()); 
	      
	       for (Entry<String, Student> entry : st) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		   }
	       
	       
	       Iterator itr=st.iterator();
	       
	       while(itr.hasNext())
	       {
	    	   Entry<String, Student>entry=(Entry<String, Student>) itr.next();
	    	   System.out.println(entry.getKey()+"  "+entry.getValue());
	       }
		
	       
	   } 
}
