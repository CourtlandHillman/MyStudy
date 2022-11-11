
package NestedClass;


public class Test1 {
    public static void main(String args []){
   Electrocar electrocar = new Electrocar(1);
   electrocar.start();
   Electrocar.Battery battery = new Electrocar.Battery();
   battery.charge();
    }
}
