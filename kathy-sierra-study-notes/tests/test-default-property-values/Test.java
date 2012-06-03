/*
 * What are the default values of instance variables?
 *
 * Result:
 * int = 0
 * String = null
 * float = 0.0
 * boolean = false
 */
class Test {
  private int a;
  private String b;
  private float c;
  private boolean d;

  public static void main(String[] args) {
    Test t = new Test();
    System.out.println(t.a);
    System.out.println(t.b);
    System.out.println(t.c);
    System.out.println(t.d);
  }
}
