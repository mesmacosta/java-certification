/*
 * Test if the compile is smart about division by zero when using literals.
 *
 * Result: it isn't. The error is raised on runtime.
 */
class Test {
    public static void main(String[] args) {
        int a = 4 / 0;
    }
}
