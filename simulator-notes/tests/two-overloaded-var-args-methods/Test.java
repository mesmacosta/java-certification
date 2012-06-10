/*
 * What happens when you call an overloaded method that has two var-args
 * versions?
 *
 * Result: a compiler error on method invocation!
 */
class Test {

    public void method(Integer... values) {
        System.out.println("Integer");
    }

    public void method(Short... values) {
        System.out.println("Short");
    }

    public static void main(String[] args) {
        new Test().method();
    }
}
