/*
 * If an interface defines an method that is already implemented?
 *
 * Result: it compiles fine, after all the class has defined the method
 * through inheritance.
 */
interface Obvious {
    String toString();
}

public class Test implements Obvious {}
