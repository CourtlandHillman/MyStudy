
package test_after_backup.AbstractTest;




public class Dog extends Animal implements  ableToMakeSound{
    public void eat(){
        System.out.println("Dog eating petfood ...");
    }
    public void makeSound1(){
        System.out.println("Yes , and sometimes too loud!!");
    }
    @Override
    public void makeSound(){
        System.out.println("Dog make sound like gaw gaw ....");
    }
}
