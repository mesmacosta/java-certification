/*
 * Test if enums values can be accessed directly and printed.
 *
 * Result: yes, they can.
 */
enum Animals { DOG, CAT, FISH };

class Test {
  public static void main(String[] args){
    System.out.println(Animals.DOG);
  }
}
