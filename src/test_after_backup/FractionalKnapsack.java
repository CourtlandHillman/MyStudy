
package test_after_backup;

import java.util.Arrays;
import java.util.Comparator;


public class FractionalKnapsack {
    public static void main (String args []){
        final Item item1 = new Item (4 ,20);
        final Item item2 = new Item (3 ,18);
        final Item item3 = new Item (2 ,14);
        
        final Item [] items = { item1 , item2 , item3 };
        
        Arrays.sort(items , Comparator.comparingDouble(Item :: valuePerUnitWeight).reversed());
        
        System.out.println(Arrays.toString(items));
        
        final int W = 7;
        
        int weightSoFar = 0;
        double valueSoFar = 0;   
        int currentItems = 0;
        
        while( currentItems < items.length  && weightSoFar != W){
            if(weightSoFar + items[currentItems].grtWeight() < W){
                
                valueSoFar += items[currentItems].getValue();
                weightSoFar += items[currentItems].grtWeight();
            } else {
                valueSoFar +=((W - weightSoFar) / (double)items[currentItems].grtWeight())* items[currentItems].getValue();
                
                weightSoFar =   W;
                
            }
            currentItems++;
        }
        System.out.println("Value: "+valueSoFar);
    }
}

class Item {
      private int weight ;
      private int value ;
      
      public  Item (int weight , int value ){
          this.value = value;
          this.weight = weight;
          
      }
      public double valuePerUnitWeight(){
          return value / (double) weight;
      }
      
      public int getValue (){
          return  value;
          
      }
      public int grtWeight (){
          return  weight;
          
      }
      
      public String toString(){
          return "{W :" + weight + " , V:" + value + " }";
      
  }
}