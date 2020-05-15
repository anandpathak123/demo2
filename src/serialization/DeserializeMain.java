package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import entity.Student;

public class DeserializeMain {

	
	 public static void main(String[] args) {
	
	 Student student = null;
     try
     {
        FileInputStream fileIn =new FileInputStream("student.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        student = (Student) in.readObject();
        in.close();
        fileIn.close();
     }catch(IOException i)
     {
        i.printStackTrace();
        return;
     }catch(ClassNotFoundException c)
     {
        System.out.println("Student class not found");
        c.printStackTrace();
        return;
     }
     System.out.println("Deserialized Student...'");
     System.out.println(student);
}
}