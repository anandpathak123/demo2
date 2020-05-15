package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.Student;

public class SerializeMain {

	 public static void main(String[] args) {
		 
		  Student stu = new Student(1,"anand");
	
		  
		  try
		  {
		   FileOutputStream fileOut = new FileOutputStream("student.ser");
		   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		   outStream.writeObject(stu);
		   outStream.close();
		   fileOut.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		  }
		 }

	 
	
   
}


