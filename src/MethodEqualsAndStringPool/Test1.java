
package MethodEqualsAndStringPool;


public class Test1 {
    public static  void main(String args []){
        
        //   animal    -->        {1}
        //   animal2   -->        {2}
      
        String string1="Hello";                      // string1 -->   {hello}
        String string2="Hello";                      // string2 -->   {hello}
       
//       Object object = new Object();
//       object.equals();

      System.out.println(string1.equals(string2));
      System.out.println(string1 == string2);
    }
}
class Animal{
    private int id;
    
    public Animal(int id){
        this.id=id;
        
    }
    
//    public boolean equals(Object obj){
//       Animal otherAnimal=(Animal)obj;
//       
//       return this.id ==otherAnimal.id;
//    }
}
