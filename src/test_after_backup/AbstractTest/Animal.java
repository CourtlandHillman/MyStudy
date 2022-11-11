
package test_after_backup.AbstractTest;



public abstract class Animal{
    public void eat(){
        System.out.println("Im eating ...");
    }
    public abstract void makeSound();
}
interface ableToMakeSound{
    public void makeSound1();
}