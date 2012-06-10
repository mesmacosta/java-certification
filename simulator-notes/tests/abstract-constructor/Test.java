/*
 * Test if an abstract class can have a constructor.
 *
 * Result: yes, it can. And it will be executed, as usual, when the child class
 * is instantiated.
 */
abstract class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}

public class Test extends Parent {
    public Test() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        new Test();
    }
}
