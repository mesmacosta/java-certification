/*
 * Test what happens when one tries to hold a lock it already
 * has.
 *
 * Result: as you already have the lock, the code just executes.
 * Nice :)
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    public synchronized static void test() {
        synchronized(Test.class) {
            System.out.println("It works!");
        }
    }
}
