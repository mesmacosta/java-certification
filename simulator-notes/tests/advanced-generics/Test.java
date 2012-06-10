/*
 * Generics is a hard topic. This program is made to clear some doubts about
 * it.
 *
 * Results:
 * List<? super Integer> list = new ArrayList<Integer>();
 * list.add(new Integer(5));
 * List<? extends Integer> list2 = new ArrayList<Integer>();
 * the above is valid. But you can't add anything to list2.
 *
 * `Number` is an abstract class.
 */
import java.util.*;

class Test {
    public static void main(String[] args) {
        List<? extends Integer> list = new ArrayList<Integer>();
        list.add(new Integer(5));
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
