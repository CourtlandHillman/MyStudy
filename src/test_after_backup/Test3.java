
package test_after_backup;


public class Test3 {
    public static void main (String [] args){
        Animal animal = new Tiger();
        System.out.println(animal.a);
        System.out.println(animal.b);
        animal.abc();
        animal.def();
        
        
    }
}
class Animal{
    int a = 6;
    static int b = 10;
    void abc(){System.out.println("non-ststic method from class Animal");}
    static void def(){System.out.println("static method from class Animal");}
}
class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc (){System.out.println("non-static method from class Tiger");}
    static void def(){System.out.println("static method from class Tiger");}
} 