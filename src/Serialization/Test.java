package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person person = new Person("Mortada", 22, "hhhhhh");

		String file= "C:\\Users\\vip\\eclipse-workspace\\Learn_JAVA_Advanced\\src\\Serialization\\Doc_object_serialized.txt";
		
		/// 1  Serialization 
		
		FileOutputStream OutF = new FileOutputStream(file);
		ObjectOutputStream outObj =new ObjectOutputStream(OutF);
        // Serialization
        try {
        	outObj.writeObject(person);
        	outObj.close();
        	OutF.close();
        	System.out.println("Serialization successful");
        	System.out.println(" var value before serlialization " +person.getVar());
            
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    
        
      /// 2  Deserialization
        FileInputStream InF = new FileInputStream(file);
		ObjectInputStream InObj =new ObjectInputStream(InF);
		 try {
			
			  Person person2= (Person) InObj.readObject();
			  System.out.println(" var value after deserialization " +person2.getVar());
	        	InObj.close();
	        	InF.close();
	            System.out.println("DeSerialization successful");
	        } 
		 catch (IOException e) {
	            e.printStackTrace();
	        }
		
	
	}
}
