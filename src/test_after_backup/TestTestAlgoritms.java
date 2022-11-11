
package test_after_backup;

public class TestTestAlgoritms {
     
     public static void main(String[] args) {  
        int [] array = {90 , 46, 24, 11 , 42 , 83 , 97 , 10};
       // boobleSort(array);
         bubleSort(array);
       int  n =100;
       System.out.println(fibEffective(n));
       
    }
    
   ///////////////////////////////////////////////////////////////// 
    private  static  int boobleSort(int [] array ){
        
        for(int i = array.length-1; i>=0 ; i--){
            for(int j=0; j<i ; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        System.out.println(array[i]);}
        return 0;
    
}
    ///////////////////////////////////////////////////////////////
     private static long fibEffective(int n){
        long [] arr=new long[n+1];
        arr[0]=0;
        arr[1]=1;
        
        for(int i = 2; i<=n ; i++)
            arr[i] = arr[i - 1]+arr[i - 2];
            return arr[n];
     }
     /////////////////////////////////////////////////////////////////////
     private static int bubleSort(int [] array){
         
         for(int i = array.length-1; i >= 0; i--){
             for(int j = 0; j < i ; j++){
                 if(array[j] > array[j + 1]){
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                     
             }
         }
         System.out.println(array[i]);
     }
         return 0;
     
     }
}

    
    
   

