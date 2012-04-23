/*
 * This test is to verify the behavior of a default access exception being thrown to another package.
 *
 * Result: the direct reference to the exception class is missed, but other than that, nobody complais.
 */
import exception.*;

public class Main {
    public static void main(String[] args) {
        try {
            Source.method();
        }
        catch (Exception ex) {}
    }
}
