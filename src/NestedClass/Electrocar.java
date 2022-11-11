
package NestedClass;


public class Electrocar {
    private int id;
    
    
    private class Motor{     // Non static class has DOSTYP  k metodam i object of the parent class
        public void startMotor(){
            System.out.println("Motor"+id+" is starting!");
        }
    }
    
    public static class Battery{ //Static class HasNOT DOSTYP  k metodam i object of the parent class
        public void charge(){
            System.out.println("Battery is charging ...");
        }
    }
    public Electrocar(int id){
        this.id=id;
    }
    
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        class SomeClass{
        public void someClass(){
            
        }
    }
        System.out.println("Electrocar "+id+" is starting ...");
    }
    
}
