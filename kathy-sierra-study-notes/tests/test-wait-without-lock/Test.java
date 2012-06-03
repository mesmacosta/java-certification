/*
 * Try calling `wait()` on an object which lock I don't own.
 *
 * Result: java.lang.IllegalMonitorStateException is thrown.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.wait();
        } catch (InterruptedException ex) {}
        System.out.println("Got away");
    }
}
