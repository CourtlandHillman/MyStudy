
package test_after_backup;

import java.util.Arrays;


public class BinnarySearch {
     
  public static void main (String args []) {
      int [] array = new int []{ 0 , 8 , 2 , 5 , 10 , 13 , 23 , 18 , 4 , 6 , 11};
      Arrays.sort(array);
      System.out.println(binarySearch(array, 13));
      System.err.println(Arrays.toString(array));
      
  }     
        
  public static int binarySearch(int [] a ,int key ){
      int low = 0;
      int high = a.length-1;
      
      while( low <= high){
          
          int middle = low + (high - low) / 2;
          
          if( key <  a[middle]){
              high = middle - 1 ;
          } else if ( key > a[middle]){
              low = middle + 1 ; 
          } else {
              return  middle;
          }
      }
      return -1;
  }
}
