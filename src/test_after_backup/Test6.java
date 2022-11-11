
package test_after_backup;

import  java.io.*;

public class Test6 {
    public static void main ( String args []){
        
        File f= new File("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\test_after_backup\\Test10.java"); 
            System.out.println("Saerching of File ...");
            
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("FILE FOUNDED!");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Founded "+e);
        }finally{
            System.out.println("Finally block code !");
        }
        System.out.println("Progres of searching finished , File Founded !");
        
//                  *********** Exsample of TRY/CATCH blolk for Exception catching !**********************      
//        int [] array = {1 , 2 , 3 };
//        System.out.println("We got Array!");
//        
//        try{ System.out.println(array[2]);
//        System.out.println("Welcome");
//                }catch(ArrayIndexOutOfBoundsException ex){
//                    System.out.println("Exception ArrayIndexOutOfBoundsException cought ! "+ex);
//                        }
        
        
    }
}
