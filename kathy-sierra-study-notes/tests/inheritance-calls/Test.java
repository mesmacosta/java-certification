/*
 * Test a variable of parent class type recieving a child
 * class object. When a method is called, which of the two implementations
 * is called?
 *
 * Result: the child one. Apparently, the type is important for the interface,
 * the implementation is dependent on the runtime class.
 */

class Parent {
  public void doStuff() {
    System.out.println("Parent");
  }
}

public class Test extends Parent {
  public void doStuff() {
    System.out.println("Child");
  }
  
  public static void main(String[] args) {
    Parent p = new Test();
    p.doStuff();
  }
}
