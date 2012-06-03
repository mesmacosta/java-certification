/*
 * Test how final reacts to method overload.
 *
 * Result: there are no constraints about this.
 */

public class Test {
  public final void method() {
    
  }
  public void method(String ola) {
    
  }
}
