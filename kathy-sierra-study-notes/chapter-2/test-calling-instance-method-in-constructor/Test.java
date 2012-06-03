/*
 * Test calling instance method inside constructor.
 * This is test is dumb, but I made a note that said it couldn't be done,
 * so I was wrong. I don't know why I made that note! :P
 *
 * Result: it works.
 */
public class Test {
    public Test() {
        System.out.println("constructor");
        method();
    }
    public void method() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        new Test();
    }
}
