/*
 * Test return type changed on inheritance.
 *
 * Result: compiler error, the return type must be compatible.
 */
class SuperClass {
  public int someMethod() {
    return 2;
  }
}

public class Test extends SuperClass {
  public float someMethod() {
    return 3.0;
  }
}
