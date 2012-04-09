/*
 * Test if private access enables code inside class to access
 * the property even in object instanciated inside itself
 * (instead of just the `this.property`).
 *
 * Result: this works fine.
 *  I also learned that:
 *   - if the `String[] args` are missing I
 *     get an `Exception in thread "main" java.lang.NoSuchMethodError: main`
 *     when I run the code.
 *   - the code runs whether the class that contains the `main` method is
 *     public or default access.
 */
class TestPrivateAccess {
  private int value;

  public static void main(String[] args) {
    TestPrivateAccess t = new TestPrivateAccess();
    t.value = 3;

    System.out.println(t.value);
  }
}
