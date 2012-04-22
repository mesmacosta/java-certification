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

Exercises
---------
