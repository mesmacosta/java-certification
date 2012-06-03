/*
 * Test the answers of exercise 4. I thought the error should be in the line
 * after the closing bracket, because that's where the next statement is.
 *
 * Result: I'm wrong, the book is right. The compiler complains about
 * the missing semicolon in the line the bracket is closed.
 */

public class TestObj {
    public static void main(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        }
        System.out.println(o.equals("Fred"));
    }
}
