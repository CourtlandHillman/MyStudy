
package test_after_backup;


public class Test7 {
   
    
    void abc(){
        int [] array1 = {1 ,2 , 3};
        System.out.println(array1[4]);}
    void def(){
        try{ abc(); 
          
          System.out.println("Welcome");
      }catch(ArrayIndexOutOfBoundsException ex){
          System.out.println("Catch Exception :OutOfBoundsException!");
          ex.printStackTrace();
          System.out.println(ex.getMessage());
      }}
    
   public static void main(String args []){
       Test7 t7 = new Test7();
       t7.def();
      
   } 
}
