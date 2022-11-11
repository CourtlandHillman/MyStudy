
package test_after_backup;

import java.util.Arrays;
import java.util.Collections;


public class Algoritms {
    public static void main (String args []){
        int [] digits = {1 ,3, 7, 9 ,9 ,9, 5};
        System.out.println(maxNumberFromDigits(digits));
    }
    
    public static String maxNumberFromDigits( int [] digits){
        return String.join("" ,Arrays.stream(digits).boxed().sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]::new ));
//      Arrays.sort(digits);
//      String result = "";
//      for(int i = digits.length - 1; i >= 0; i--){
//        result +=digits[i];
//        
//      }
//      return result;
    }
    
}
