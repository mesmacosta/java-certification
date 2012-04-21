/*
 * Modified example from page 111.
 *
 * Test if one int and one double passed on method invocation would cause
 * the parsing of the int or would result in error.
 *
 * Result: it's properly persed and no error are raised.
 */
class Adder {
    public int addThem(int x, int y) {
        return x + y;
    }
    // Overload the addThem method to add doubles instead of ints
    public double addThem(double x, double y) {
        return x + y;
    }
}
// From another class, invoke the addThem() method
public class Test {
    public static void main (String [] args) {
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b,c); // Which addThem is invoked?
        double doubleResult = a.addThem(22.5,9.3); // Which addThem?
        double edgeCase = a.addThem(b,9.3); // Which addThem?
    }
}

