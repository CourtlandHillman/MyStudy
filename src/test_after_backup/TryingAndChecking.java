
package test_after_backup;

import java.util.Arrays;
import java.util.Comparator;


public class TryingAndChecking {
   
    public static void main (String args []){
        final Item item1 = new Item(4 ,20);
        final Item item2 = new Item(3 , 18);
        final Item item3 = new Item(2, 14);
        
        final Item [] items = {item1 , item2 , item3 };
        
        Arrays.sort(items , Comparator.comparingDouble(Item :: valueOfPerWeight).reversed());
        System.out.println(Arrays.toString(items));
        
        final int W = 7;
        
        int valueSoFar = 0;
        double weightSoFar = 0;
        int currentItem = 0;
        
        while(currentItem < items.length && weightSoFar != W){
            if(weightSoFar + items[currentItem].getWeight() < W ){
                
                weightSoFar +=items[currentItem].getWeight();
                valueSoFar +=items[currentItem].getValue();
                
                
        }else{
                valueSoFar += ((W - weightSoFar) / items[currentItem].getWeight())*items[currentItem].getValue();
                
                weightSoFar =   W;
                }
            currentItem++;
        }
        System.out.println("Value: "+valueSoFar);
    }
}

class Item {
    private int weight ;
    private int value ; 
    
    public Item (int weight , int value ){
       this.value = value;
       this.weight = weight;
    }
    
    public double valueOfPerWeight(){
          return  value / (double) weight;
    
        }
      public String toString(){
          return "W: "+ weight +" V: "+value;
      }
      public int getWeight(){
          return weight;
      }
      public int getValue (){
          return value ;
      }
      
      
      
}