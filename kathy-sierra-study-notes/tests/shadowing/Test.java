/* Does the compiler complain about misleading
 * shadowing?
 *
 * Result: no, compiles ok.
 */
public class Test {
  private int i;

  public void method(String i) {
    i = i;
  }
}
