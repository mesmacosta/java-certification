/*
 * Study to undestand the behavior of `protected`.
 *
 * Result: protected = package + kids outside the package.
 */
class SuperClass {
  protected int a = 2;
}

public class Test {
  public void method() {
    SuperClass s = new SuperClass();
    s.a = 3;
  }
}
