
package Write;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class WriteObject {
    public static void main (String args []) throws IOException{
        Person person1=new Person(1 ,"Bob");
        Person person2=new Person(2 ,"Mike");
        
        try {
            FileOutputStream fos= new FileOutputStream("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\people.bin");
            ObjectOutputStream oop = new ObjectOutputStream(fos); 
            
            oop.writeObject(person1);
            oop.writeObject(person2);
            
            oop.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
