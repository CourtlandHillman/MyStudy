
package test_after_backup;

import java.util.Arrays;


public class Fibonacci {
//    public static void main(String args []){
//      System.out.println(fibEffective(15));
//    }
//    
//    private static long fibEffective(int n){
//        int [] arr=new int[n+1];
//        arr[0]=0;
//        arr[1]=1;
//        
//        for(int i = 2; i<=n ; i++)
//            arr[i] = arr[i - 1]+arr[i - 2];
//            return arr[n];
//    }
    
    
    public static void main(String[] args) {
        int n=100;
        long [] mem = new long[n +1];
        Arrays.fill(mem , -1);
        System.out.println(fibNaiv(n , mem));
    }
//   o(n)
//    private static long fibEf(int n){
//    o(n)
//        long [] array =new  long[n +1]; =>o(n)
//        array[0]=0;
//        array[1]=1;
//        for(int i = 2; i<=n; i++)  =>o(n)
//            array[i]=array[i-1]+array[i-2];
//        return array[n];
//    }
    // 0(n+n)=>o(2n)=>o(n)
    
    
    private static long fibNaiv(int n , long [] mem){
        if(mem[n] != -1)
            return mem[n];
        if(n<=1)
           return n;
        long result =fibNaiv(n-1 , mem)+fibNaiv(n-2 , mem);
        mem[n]=result;
        return result;
    }
    
    
    
}
    


        
    

