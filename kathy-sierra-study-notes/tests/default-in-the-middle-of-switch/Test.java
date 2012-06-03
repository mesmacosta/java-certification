/*
 * Test if a default statement would match in a switch statement.
 *
 * Result: the more specific case is matched, even if there's a default
 * statement before. The following prints 2.
 */
class Test {
    public static void main(String[] args) {
        int a = 2;
        switch(a) {
            case 1:  System.out.println("1"); break;
            default: System.out.println("default"); break;
            case 2:  System.out.println("2"); break;
            case 3:  System.out.println("3"); break;
        }
    }
}
