
package Write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Test {

public static void main (String args []) throws FileNotFoundException{
File file =new File("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\testFile.java");
PrintWriter pw = new PrintWriter(file); 
    

pw.println("Hello Team it's just test message !");
pw.write("hellooooooooooo");
pw.close();
}
}