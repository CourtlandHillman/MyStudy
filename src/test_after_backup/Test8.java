
package test_after_backup;

import java.io.*;

public class Test8 {
    public static  void main (String args []){
        StringBuilder result = new StringBuilder("");
        try{
        File f = new File("C:\\Users\\jackj\\Documents\\NetBeansProjects\\Test_After_BackUp\\src\\test_after_backup\\Test6.java");
        System.out.println("File created!");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Stream created!");
        int counter = 0;
        while(true){
            counter++;
            result.append(fis.read());
            System.out.println("Reading Info!");
            if(counter==3){fis.close();}
        }
        
    }catch(FileNotFoundException ex){
        System.out.println("Exception 1");
    }catch(IOException ex){
        System.out.println("Exception 2");
    }finally{System.out.println("Finally");}
}
}
