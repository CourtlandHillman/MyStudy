
package test_after_backup;

public class Test1 {
    public static void main (String args[]){
       int n = 100;
       double [] array = new double [n];
       for(int i = 0; i<array.length; i++ ){
           array[i]=Math.random();
        }
       double max = array[0];
       double min = array[0];
       double avg = 0;
       for(int i=0 ; i < array.length; i++){
           if(max < array[i])
               max = array[i];
           if(min > array[i])
               min = array[i];
           avg +=array[i]/array.length;
           
       }
       
        System.out.println("max "+max);
        System.out.println("min "+min);
        System.out.println("avg "+avg);
        
        
         for(int i = 0 ; i < array.length ; i++){
           for(int j = 0; j < array.length  - 1; j++){
               if(array[j] > array[j + 1]){
                double temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                
               }
            }
         }
         for (int i = 0 ; i < array.length; i++){
             System.out.println(array[i]);
         }
    }
}
