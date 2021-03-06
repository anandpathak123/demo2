package map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	 public static void main(String a[]){
		 
	        TreeMap<String, String> hm = new TreeMap<String, String>();
	        //add key-value pair to TreeMap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        
	        System.out.println(hm);
	        
	        Set<String> keys = hm.keySet();
	        for(String key: keys){
	            System.out.println("Value of "+key+" is: "+hm.get(key));
	        }
	        
	        hm.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
	    }
	
}
