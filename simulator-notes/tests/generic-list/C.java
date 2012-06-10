/*
 * Test what can be passed to a list using generics.
 *
 * Result: a list can't recieve parents of `B` - for instance `A` objects - if
 * it's declared as `List<? super B>` because the compiler can't know
 * for shure that the `ArraList` won't be instantiated as `new ArrayList<B>()`.
 */
import java.util.*;
class A{}
class B extends A{}
public class C extends B{
    public static void main(String args[]){
        List<? super A> ty=new ArrayList<A>();
        ty.add(new A());
        ty.add(new B());
        ty.add(new C());
    }
}

