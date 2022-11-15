
package test_after_backup;

//Fractional Knapsack

import java.util.Arrays;
import java.util.Comparator;


public class BackPackAlgor {
    public static void main (String args []){
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3 , 18);
        final Item item3 = new Item(2, 14);
        
        final Item [] items = {item1 , item2 , item3};
         // O(n*log(n))
        Arrays.sort(items , Comparator.comparingDouble(Item :: valuePerUnipOfWeight).reversed());
        
        System.out.println(Arrays.toString(items));
        
        final int W = 7;
        
        int weightSoFar = 0;
        int valueSoFar = 0;
        int currentItem = 0;
        
        while(currentItem < items.length && weightSoFar != W){
            if(weightSoFar + items[currentItem].getWeight() < W){
                // berem object all
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                // part of object
                
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight())*items[currentItem].getValue();
                
                weightSoFar = W; //fULL 
            }
            
            currentItem++;
            
        }
        
         System.out.println("Value of the best collections: " + valueSoFar );
         System.out.println("Weight: "+ weightSoFar);
        
    }
}
class Item{
   private int weight;
   private int value;
   public Item (int weight , int value ){
       this.weight = weight;
       this.value = value;
   }
   public double valuePerUnipOfWeight(){
       return value /(double) weight;
   }
   public int getWeight(){
     return weight;
   }
   public int getValue(){
     return value;
   }
   
   public String toString(){
       return "{Weight:"+ weight + ", Value:"+ value +"}";
   }
}