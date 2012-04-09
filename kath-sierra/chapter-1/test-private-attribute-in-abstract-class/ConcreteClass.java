public class ConcreteClass extends AbstractClass {
  protected void someMethod() {
    
  }

  public static void main(String[] args) {
    ConcreteClass c = new ConcreteClass();

    c.setValue(3);
    System.out.println(c.getValue());
  }
}
