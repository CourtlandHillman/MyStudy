
package test_after_backup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;






public class NewExceptions {
   public static void main (String args []) {
       try {
           readFile();
       } catch (FileNotFoundException ex) {
           System.out.println("Exception caught at main method!Unvalid file name!");
       }
   } 
   public static void readFile() throws FileNotFoundException{
       File file = new File("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\test_after_backup\\Test10.java");
       Scanner scanner =new Scanner(file);
   }
}
