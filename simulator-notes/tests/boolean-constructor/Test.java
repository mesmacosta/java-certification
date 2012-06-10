/*
 * How does `Boolean` behave about `String`s being passed on the
 * constructor?
 *
 * Result: anything except "true" is considered false. It's case-insensitive
 * about it.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Boolean("fuffles"));
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean("    true    "));
        System.out.println(new Boolean("TrUe"));
        System.out.println(new Boolean(" laskdjf lk  true"));
    }
}
