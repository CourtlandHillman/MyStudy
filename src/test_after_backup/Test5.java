
package test_after_backup;

import java.io.*;

public class Test5 {
    static void abc() {
         try { 
          File f= new File("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\test_after_backup\\Test10.java");  
          FileInputStream fis = new FileInputStream(f);
          System.out.println("File Founded!");
        //fis.read();
        
      }
      catch(FileNotFoundException e){
          System.out.println("File is not founded");
      }
     }
    static void def(){
        System.out.println("Hello");
        abc();
    }
    
    
    public static void main (String args []) {
    Test4 t4= new Test4();
        def();
    
    }
}
