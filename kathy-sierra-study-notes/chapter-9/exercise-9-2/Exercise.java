/*
 * The output should be 100 A's, 100 B's and a 100 C's, without
 * overlaps.
 *
 * This program is the correct answer.
 */
public class Exercise extends Thread {
    private StringBuffer stringBuffer;

    public Exercise(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public void run() {
        synchronized(stringBuffer) {
            for (int i = 0; i < 100; ++i) {
                System.out.println(stringBuffer);
            }
            stringBuffer.setCharAt(0, (char)(stringBuffer.charAt(0) + 1));
        }
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("A");
        Exercise thread1 = new Exercise(stringBuffer);
        Exercise thread2 = new Exercise(stringBuffer);
        Exercise thread3 = new Exercise(stringBuffer);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
