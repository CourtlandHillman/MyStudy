
package test_after_backup.AbstractTest;


public class Cat  extends Animal implements  ableToMakeSound{
    public void eat(){
        System.out.println("Cat eating petfood ...");
    }
    public void makeSound1(){
        System.out.println("Cat's usually make meon 3-9 times !!!");
    }
    @Override
    public void makeSound(){
        System.out.println("Cat make sound like meon ....");
    }
}
