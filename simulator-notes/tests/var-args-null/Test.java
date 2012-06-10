/*
 * Test what happens when you try to pass a null value to a var-args call.
 *
 * Result: you get a compiler warning. But it calls the method anyway.
 */
class Test {
    public static void varArgs(String... args) {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        System.out.println("no values");      varArgs();
        System.out.println("array");          varArgs(new String[] {"foo", "bar"});
        System.out.println("several values"); varArgs("foo", "bar");
        System.out.println("null");           varArgs(null);
    }
}
