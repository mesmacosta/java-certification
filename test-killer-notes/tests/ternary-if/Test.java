/*
 * An question was misspelled in Test Killer and I wanted to prove myself
 * right.
 *
 * Result: I'm right. In ternary if, the `?` is required. Thank god! :P
 */
public class Test {
    public static void main(String[] args) {
        String[] elements = { "for", "tea", "too" };
        String first = (elements.length > 0) ? elements[0] : null;
    }
}
