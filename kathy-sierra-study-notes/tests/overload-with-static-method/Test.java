/*
 * Test if it's possible to overload a method when the only difference is
 * that the other method is static.
 *
 * Result: compilation error.
 */
class Test {
    public void method() {
        
    }
    public static void method() {
        
    }
}
