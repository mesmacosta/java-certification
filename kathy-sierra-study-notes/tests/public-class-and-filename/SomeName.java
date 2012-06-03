/*
 * Test how naming the file and class relates.
 *
 * Restuls:
 * - There can only be one public class per file.
 * - The name of that class must match the file.
 * - If the file has one default access class, it can have any name.
 * - If that's the case but the class contains a `main` method, it will
 *   not be found and the program won't run.
 */
public class TestPrivateAccess {
  private int value;

  public static void main(String[] args) {
    TestPrivateAccess t = new TestPrivateAccess();
    t.value = 3;

    System.out.println(t.value);
  }
}
