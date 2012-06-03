/*
 * Test protected methods in interfaces.
 *
 * Results:
 * - Protected methods in interfaces are not allowed.
 * - It's ok to explicitly declare methods as `public abstract`.
 * - An interface can hold attributs, as long as they're initialized!
 *   In fact, interfaces can only declare constants!
 */
interface SomeInterface {
  int someAttribute = 3;
  public abstract void someMethod();
  protected void someMethod();
}
