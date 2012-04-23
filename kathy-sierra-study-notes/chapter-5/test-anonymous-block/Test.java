/*
 * Is it legal to have an anonymous block in the code, like it would be in C?
 *
 * Result: yes, it is.
 */
class Test {
    public static void main(String[] args) {
        System.out.println("before");
        {
            System.out.println("inside");
        }
        System.out.println("after");
    }
}
