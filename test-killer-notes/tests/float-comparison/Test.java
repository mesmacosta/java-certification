/*
 * Comparing an float with an integer works?
 *
 * Result: of course it does! Unboxing and widening in action! \o/
 */
public class Test {
    public static void main(String[] args) {
        Float pi = new Float(3.14f);
        if (pi > 3) {
            System.out.println("pi is bigger than 3.");
        }
        else {
            System.out.println("pi is not bigger than 3.");
        }
    }
}
