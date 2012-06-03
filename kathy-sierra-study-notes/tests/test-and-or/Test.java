/*
 * Test precedence of short-circuit operators.
 *
 * Restult:
 * * false && false || true == true
 * * false && false | true == false
 */
class Test {
    public static void main(String[] args) {
        if (false && false || true)
            System.out.println("ola");
    }
}
