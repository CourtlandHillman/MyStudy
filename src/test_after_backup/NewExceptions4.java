
package test_after_backup;


import java.io.IOException;
import java.text.ParseException;



public class NewExceptions4 {
    public static void main ( String args []){
        try {
            run();
        } catch (Exception ex){ //Exceptions 

//catch (IOException  | ParseException  | IllegalArgumentException ex ) {   //Multi Catch  from JAVA 7
            ex.printStackTrace();
        }
        
    }
    public static void run() throws IOException , ParseException , IllegalArgumentException{
        
    }
            
}
