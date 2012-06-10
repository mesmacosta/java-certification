/*
 * What happens when trying to synchronize with an null object?
 *
 * Result: `NullPointerException`.
 */
public class Test {
    public static void main(String[] args) {
        Object object = null;
        System.out.println("before synchronized");
        synchronized(object) {
            System.out.println("inside synchronized");
        }
        System.out.println("after synchronized");
    }
}
