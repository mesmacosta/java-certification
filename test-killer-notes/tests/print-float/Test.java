/*
 * Test number flags in printf.
 *
 * Results: %d is for integers - if an float is passed, it throws
 * an Exception -, %f is for floats, the length specifier will be respect,
 * with spaces padding the rest of the number, if it's the case.
 */
public class Test {
    public static void main(String[] args) {
        double d = 12.345;
        System.out.printf("|%8.3f|\n", d);
    }
}
