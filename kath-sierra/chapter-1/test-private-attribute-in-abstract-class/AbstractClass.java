public abstract class AbstractClass {
  private int value;

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  protected abstract void someMethod();
}
