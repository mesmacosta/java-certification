/*
 * If a method declares to throw an checked Exception but doesn't have
 * a method call that could throw it?
 *
 * Result: different from try/catch - that would complain in this case -,
 * it compiles fine.
 */
import java.io.IOException;

public class Test {
    public void method() throws IOException {}
}
