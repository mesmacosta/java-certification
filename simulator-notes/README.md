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

Exam Lab Practice 1
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
* If a jar inside the current directory, you still have to put it the classpath. Therefore, you should always put the jars in the classpath. But the class being compiled is identified with the whole path - or is in the current directory - you can skip it's path from the classpath.
* `Collections.reverse(List)` returns a `void`. `ArrayList.add(Object)` and `File.delete()` return `boolean`. `FileReader.read(char[])` returns `int`.
* `Arrays.asList()` is `static`.
* `Scanner` method to find the next occurrence is `next(String toBeFound)`.
* `NavigableMap.lowerKey(Object)` may return `null` if there is no key less than the one passed as parameter.
* Casting a `null` value works.
* `>>>` is a bitwise unsigned right-shift operator. `<<<` doesn't exist.
* When calling a var-args method, one can pass either an array or several parameters, but not both.
* When `printf()` is called with a format `%b`, the value passed will be interpreted as:
    - if `null`, prints `false`
    - if `boolean` or `Boolean`, prints the respective value
    - else, prints `true`.
* If you try to call `NavigableSet.subSet()`, the first value must come before the second value in the given order of the set. What that means is, if the set is in `reverseOrder()` the fist value must be higher than the second. Otherwise, an `IllegalArgumentException` is thrown.
* Non-static inner classes cannot have `static` members. Because an non-static inner class can only exist when tied to the enclosing class instance, there would be no way to call the static method in the non-static inner class.
* `volatile` and `transient` cannot be applied to methods.
* `Comparable` is in `java.lang` and `Scanner` is in `java.util`.
* `Calendar.getTime()` returns `Date`.
* When trying to add an `Object` to an `String`, in that order, the `toString()` method of `Object` is called and the sum succeeds.
* If you pass an object to a `TreeSet` and it doesn't implement `Comparable`, nor a `Comparator` was provided, you get a _runtime_ error! A `ClassCastException` is thrown.
* `Scanner` default separator is a single space. This applies to `nextLong()` calls, for instance.
* The compiler knows about unreachable statements. Therefore `throw new Exception(); doSomething();` won't compile. The compiler knows that `doSomething();` will never happen.
* `List` has a `size()` method, not `length()`.
* `<? super A>` includes `A` itself.
* `System.out.println(someMethodThatReturnsVoid())` is a compile time error.
* When an assertion fails, it throws an `AssertionError` and the message after the `:` is evaluated. Note that `Error` isn't an `Exception`.
* When you own the lock for a `Thread` object, not necessarily you own the lock for the `Runnable` underneath.

### Score

39 of 72. 54% I wouldn't pass. But they said that when you score 60% in this exam, you score 90% in real Oracle exam. So I'm ok with the result :P

Exam Lab Final Exam
-------------------

### Date

6/9/12

### Impressions

Even harder than the Practice exam, of course. Really smart questions and I can feel the progress. Really satisfied with this tool \o/

### Notes

* `tailSet(Object)` returns `SortedSet`. `tailSet(Object, boolean)` returns `NavigableSet`, it was introduced in Java 1.6.
* `java.util.Arrays.sort(Object[])` may throw `ClassCastException` if there are, in the array being sorted, two vales that don't mutually compare, such as `String`s and `Integer`s.
* `Locale` doesn't have an no-parameter constructor.
* `java.text.DateFormat` doesn't have a `setLocale()` method. The `Locale` should be set on the object's constructor.
* `File.renameTo(File)` this method doesn't take an `String` as parameter. But a `File`, instead.
* `Thread.yield()` is an `static` method.
* `toUpperCase()` is a method of `String`. Neither `StringBuilder` or `StringBuffer` have it.
* An `static` inner class can't inherit from a non-static one.
* On a string format for `printf()` the modifier `(` will enclose negative values with parentheses.
* `private abstract` can be used in inner classes. Another inner class may extend the abstract one and implement the private method.
* The mystery about generics - harder part of this subject - is this:
    An variable declared as `List<? extends Number> l` may receive an `new ArrayList<Number>()` or an `new ArrayList<Integer>()` or an `new ArrayList<Short>`. Therefore, the compiler can't know what type of values the list can really hold!
    This way, to be safe, the compiler won't let anything to be passed to the `add()` method. It's just invalid to call it!
    If it's the other way around, the list is declared as `List<? super Number> l` the compiler knows that something like `new ArrayList<Number>` or `new ArrayList<Object>` will be atributed to the variable. At least the contract of `Number` will be respected.
    In this case, the `add()` method is valid for any value that passes the test of `instanceof Number`. In other words, any object of `Number` or it's children.
* The order of steps executed on initialization of an object is:
    - Start the constructor.
    - Call the parent's constructor.
    - Initialize all properties with their default values.
    - Execute all initialization blocks, in the order they appear.
    - Proceed with constructor.
    - By the end of this process all instance final variables should be initialized.
* Like in C++, an `enum` is a lot like a class. It can even have a `main()` method!
* `Thread.LOW_PRIORITY` and `Thread.HIGH_PRIORITY` aren't defined. The ones that are defined are `Thread.MIN_PRIORITY` and `Thread.MAX_PRIORITY`.
* `new Thread(String)` is defined.
* `goto` and `const` aren't in use but are reserved words.
* `$JAVA_HOME/jre/lib/ext` is the place to put the jars that you don't want to specify in `classpath`.
* `import java.lang.Integer.*` is valid. It's trying to import all static inner classes, then they could be used without specifying `Integer`, anymore. There are no public inner classes in `Integer`, but nevermind that :P
* `Thread.sleep(long)` doesn't accept an `int`. Be careful!!
* The `native` keyword means the implementation will be written in another language - such as platform-dependent C, for instance. Therefore, the declaration `public void native method()` is ok.
* It's not ok for an message of an assert to have collateral effects. Asserts also shouldn't verify the values being passed as parameters to an public method. Asserts are appropriate to check the parameters being passed to private methods and to check the result of any method.
* `String.replace(char, char)` and `StringBuilder.replace(int, int, String)` are equivalent.
* On object deserialization, the first class in the hierarchy that isn't `Serializable` will have it's default (no-arg) constructor called. If it doesn't have one, an `InvalidClassException` will be called.
* `Exception` and `Throwable` are both checked an unchecked at the same time. That happens because `RuntimeException` is a child of `Exception`, as well as any other checked exception. Also, `Exception` happens to be child of `Throwable`, which justifies the same behavior for it.
    Consequences of this fact are:
    - `try{} catch(Exception ex){}` is valid! Because `Exception` acts as an unchecked exception.
    - `void method() { throw new Exception(); }` won't compile because the method isn't declared to throw anything. And `Exception` acts as checked.
    Confusing!!!
* `catch(SomeClass ex)`, for this statement to be valid `SomeClass`'s object must pass the `instanceof Throwable` test.
* This is a very edge case: a final class array cannot be casted to an external interface array. dumbsayswhat???
* `synchronized(null)` is a compile time error. Because the compiler knows! It just knows!


### Score

45 of 72. 62% almost there! I'm proud! :D
