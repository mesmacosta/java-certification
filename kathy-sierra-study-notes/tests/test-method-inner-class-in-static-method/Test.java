/*
 * Test if a static method could hold an inner method.
 *
 * Result: yes, it can.
public class Test {
    public static void main(String[] args) {
        class Inner {}
        Inner inner = new Inner();
    }
}
