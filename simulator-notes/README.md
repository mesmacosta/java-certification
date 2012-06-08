Simulator Results
=================

Whizlabs SCJP 6.0 Preparation Kit
---------------------------------

### Date

6/2/12

### Impressions

It was weird. It was the first simulator I tried after finishing studying. When I completed the test, it said I got 4 of 72 right. I thought "alright, I'm failing this shit"! :P
But, somehow, the score was wrong, manually looking the right answers, I had a different score :D

### Notes

* To be serializable, besides implementing `Serializable`, a class can implement `Externalizable`.
* `Locale` isn't `abstract`. You can instantiate it.
* `BufferedReader` takes an `FileReader` as an argument, not a `File`.
* `hashCode()` returns `int` and should be calculated using information of the object that isn't final!
* `java.util.LinkedHashMap` is a `Map` that maintains information about access order - LRU.
* `Collection.toArray()` returns an array of the type specified by the first parameter. Example: `String[] s = list.toArray(new String[0])`.
* The `equals()` method of `List`s is overridden, it takes in account the size and the equality of elements in the `List`s. The actual object that represents the lists are ignore, which would be default `equals()` behavior as implemented by `Object`.
* `Integer` wrapper class doesn't work fine with `==`. Compare the values, instead, using `intValue()`.
* To iterate through entries of a `Map`, use `for(Map.Entry par : map.entrySet())`.
* Remember that a non-static inner class can only be instantiated if tied to an object of the enclosing class. Thus, use `new OuterClass().new InnerClass()`.
* The only two ways of accessing an constant inside an interface is by implementing or static importing it.
* Var-args methods can take an empty list of parameters on invocation.
* In assertions, `Expression 1` - comes before the colon - should be `boolean` and `Expression 2` - comes after the colon - should be anything except a call to method that returns `void`.
* `Number` is `abstract`. But `Integer` is a subclass, so autoboxing can take care of instantiating an `Number`.
* Use `assert` to test preconditions, post-conditions and invariants. Except for preconditions on `public` methods. This is considered bad practice because assertions could be disabled and because the preconditions of a method call should throw checked exceptions.
* `NavigableSet` has the methods `descendingIterator()` and `descendingSet()`. In the last one you can call `iterator()` which would result in an iterator equal to the one in the first method call.
* `String[] a = new String[2]; String[] b = new String[3]; a = b;` works fine because the object reference is changed. The operation doesn't try to clone the array value by value, which would cause the sizes to don't fit.
* Using `==` to compare `String` an `int` isn't allowed. Only `+` converts `int`s to `String`s.
* `null` fails `instanceof` tests. Regardless of the object type being tested.
* The case where two overloaded methods receive `Person, Employee` and `Employee, Person` fails to compile. The ambiguous method signatures could be resolved implementing another overloaded method that receives `Employee, Employee`.
* If a class depends on other unrelated objects, it's tightly coupled. If it has unrelated primitives, it's a low cohesion problem.
* An `static` method can't be overridden to be non-static and vise-versa.

### Score

47 of 72. 65.27%

I would pass, but on the edge! :P 65.27%

Exam Lab Preparation 1
----------------------

### Date

6/4/12

### Impressions

Very high standard! The questions are very hard! And the explanations are great!

I liked it better than Whizlabs and it's free. It even gave me the correct score as I finished the test. It printed it in a fake "certification", which was nice :)

### Notes

* `java.util.List` has the method `toArray()`. `java.util.Arrays` doesn't.
* Warnings from the compiler about generics:
    - `List<String> l = new ArrayList();` because of the missing generic on the instantiation.
    - `List l = null; l.add("hi");` because it's accessing a method of a non-generic collection.
* When a class implements `Runnable`, it doesn't get `sleep()` for free. It's a `Thread` static method!
* A compiler error is thrown if the `try` block doesn't execute something that may throw the exception in `catch` block.
* `Thread` has a constant called `MIN_PRIORITY`.
* `Boolean` can recieve a `String` and is case-insensitive to it.
* An array can be passed to a var-arg method.
* `LinkedList` implements `Queue`.
* It's allowed to _"override"_ an attribute. As a way to initialize the variable differently.
* `NumberFormatException` is unchecked, `ClassNotFoundException` is checked.
* `Enum.KEY` and `Enum.valueOf("KEY")` are equivalent.
* When sorting strings, numbers come before letters.
* `String` literals are created on `String` pool. But you can create another object for the same string with `new String("literal")`.
* `concat()` exists in `String` only. Not in `StringBuffer` nor `StringBuilder`.

### Score
