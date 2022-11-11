
package test_after_backup;

import java.io.IOException;
import java.util.Scanner;



public class NewExceptions2 {
    public static void main(String ardg[]) throws ScannerException {
       Scanner scanner=new Scanner(System.in);
        while (true) {            
          int x =  Integer.parseInt(scanner.nextLine());
            if (x != 0) {

                  throw new ScannerException("Incorrect LogIn");
               
              }
            }
                    
        }
    }

