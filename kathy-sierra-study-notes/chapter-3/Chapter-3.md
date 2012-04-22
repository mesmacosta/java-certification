Chapter 3
=========

* Instance variables and objects belong on the head. Variables and method calls are on the stack.
* When expressing literals, double is the default. For a float, a F must be appended.
* The result of a operation with two values smaller than ints is an int.
* Array values are always initialized to the type's default value.
* For primitive types, putting a compatible element in array element is ok. But trying to assign an array of char in an variable that is an array of int is invalid!
* For reference types (objects) it's allowed to assign an array of child type. For example: `Car[] car = new Honda[2]`.
* `int[][] a = new int[2][]` is right. `int[][] a = new int[2][3]` is wrong.
* There are static and instance initialization blocks. They run right after the parent's class contructor.
* An wrapper object for Character can't be created from a String. All other wrapper classes accept Strings.
* Wrapper classes usually have `valueOf()` (returns wrapper), `parseXxx()` (returns primitive) and `xxxValue()` (returns primitive) methods.
* Wrapper boxing objects are the same to save memory when they are boolean, shorts (-128 to 127), byte...
* Widening a varible is prefferred over boxing on method invocation because it is an older feature (backwards compatibility sucks! :P).
* Widening beats boxing which beats var-args.
* Wrapper classes aren't child of each order.
* If, for a method invocation, an argument must be:
    - widen then boxed: compilation error!
    - boxed then widen: just fine!
* Garbage collection questions do not apply to Strings.
* The `finalize()` method can save the object from being elegible for garbage collection. However, it ever is elegible again, the garbage collector won't bother running `finalize()` again.
* Defining an array as {1,2,} is allowed.
* Pay attention to objects inside other objects on GC questions!
* Remember the need to downcast an literal int to an short!
* Instance init blocks run right after the call to `super()` in a constructor.
* Private instance variables of an enum are accessible by the class they are declared into.
* It's not valid to shadow a method variable with a block variable.

Exercises
---------

1.  B   ✗
2.  B   ✗
3.  G   ✗
4.  F   ✔
5.  A   ✔
6.  D   ✔
7.  C   ✗
8.  C   ✗
9.  A   ✔
10. C,G ✗
11. B   ✔
12. A   ✔
13. E   ✔
