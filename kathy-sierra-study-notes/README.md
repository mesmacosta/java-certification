Kathy Sierra's SCJP book study notes
====================================

Chapter 1
---------

* Identifiers can start with `$`.
* Constants are created using `static` and `final`.
* Event listener method names must start with `add`. Methods to unregister the listener must start with `remove`.
* Classes nonaccess modifiers: `abstract`, `final` and `strictfp`.
* `String` class is `final`.
* Interfaces can only declare constants! No regular attributes allowed.
* Interfaces can't declare `static` methods.
* Interfaces define instance methods! (same as above)
* `static` methods can't be overridden.
* Overridding a method must match the return type.
* Class members = instance variables + methods.
* `protected` = package (`default`) plus kids
* If there are two classes on the same file, when compiled two `.class` are created.
* An `protected` member inherited from another package cannot be invoked in instances, only through inheritance.
* A method cannot be `abstract` and `static` at the same time!
* Local variables are always on the stack. Objects and arrays - which are also objects - are always on the heap.
* Instance variables get default values, local variables don't.
* Final variables must be initialized before the completion of the constructor.
* `enums` can't be declared inside methods.
* Semicolon is optional after declaration of an enum.

### Exercises

1. C     ✔
2. B,D   ✔
3. A,E   ✔
4. F     ✗
5. D     ✗
6. A     ✔
7. C,D,F ✔
8. B     ✔
9. A     ✗

Result: 66.66% :)

Chapter 2
---------

* Only methods are dinamically selected on the actual object. Not static methods, nor variables. This is because `static` methods belongs to the class, so the declared class will be referenced. You shouldn't be calling static methods on objects, anyway, it doesn't make sense. Variables aren't overridden, so this part should be obvious.
* Child class overridden methods accessors cannot be more restrictive! This would break the contract the parent class which should be guaranteed.
* Only instance methods can be overridden.
* Be really careful about overloaded X overridden methods!
* The decision of which overloaded method to call is performed at compile time! Not dinamically at runtime!
* Downcasting in the same inheritance tree compiles (but may lead to runtime errors). Downcasting on different inheritance trees will not compile.
* In UML: hard line represents inheritance, dashed line represents interface implementation.
* An array is an object.

### Exercises

1.  A,B,E ✗
2.  A     ✗
3.  A     ✔
4.        ✗

        class AgedP {

          public AgedP(int x) {

          }
        }
        public class Kinder extends AgedP {

          public Kinder(int x){
            super(x);
          }
        }

5.  C     ✔
6.  A,C   ✗
7.  C     ✔
8.  F     ✔
9.  A     ✔
10. B     ✔
11. C     ✔
12. C     ✔
13. A     ✔
14. A,C   ✔
15. F     ✗

Result: 66.66% :)

Chapter 3
---------

* Instance variables and objects belong on the heap. Variables and method calls are on the stack.
* When expressing literals, double is the default. For a float, a `F` must be appended.
* The result of a operation with two values smaller than ints is an int.
* Array values are always initialized to the type's default value.
* For primitive types, putting a compatible element in array element is ok. But trying to assign an array of char in an variable that is an array of int is invalid!
* For reference types (objects) it's allowed to assign an array of child type. For example: `Car[] car = new Honda[2]`.
* `int[][] a = new int[2][]` is right. `int[][] a = new int[2][3]` is wrong.
* There are static and instance initialization blocks. They run right after the parent's class constructor.
* An wrapper object for `Character` can't be created from a `String`. All other wrapper classes accept Strings.
* Wrapper classes usually have `valueOf()` (returns wrapper), `parseXxx()` (returns primitive) and `xxxValue()` (returns primitive) methods.
* Wrapper boxing objects are the same to save memory when they are `boolean`, `shorts (-128 to 127)`, `byte`...
* Widening a variable is preferred over boxing on method invocation because it is an older feature (backwards compatibility sucks! :P).
* Widening beats boxing which beats var-args.
* Wrapper classes aren't child of each other.
* If, for a method invocation, an argument must be:
    - widen then boxed: compilation error!
    - boxed then widen: just fine!
* Garbage collection questions do not apply to Strings.
* The `finalize()` method can save the object from being eligible for garbage collection. However, it ever is eligible again, the garbage collector won't bother running `finalize()` again.
* Defining an array as `{1,2,}` is allowed.
* Pay attention to objects inside other objects on GC questions!
* Remember the need to downcast an literal `int` to an `short`!
* Instance initialization blocks run right after the call to `super()` in a constructor.
* Private instance variables of an `enum` are accessible by the class they are declared into.
* It's not valid to shadow a method variable with a block variable.

### Exercises

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

Result: 53.84% :(

Chapter 4
---------

* Piece of cake :P
* Comparing two arrays of different sizes with `==` is ok, because they are both objects. But the result will be false.

### Exercises

1.  D   ✔
2.  B   ✗
3.  E   ✔
4.  G   ✔
5.      ✔

        class Incr {
            public static void main(String[] args) {
                Integer x = 7;
                int y = 2;

                x *= x;
                y *= y;
                y *= y;
                x -= y;

                System.out.println(x);
            }
        }

6.  C   ✔
7.  A   ✔
8.  C   ✔
9.  C,F ✔
10. D   ✔

Result: 90% :)

Chapter 5
---------

* The `switch` statement can handle `int`s and `enum`s.
* The constants on `case` statement must be a compile time constant!
* A `try` must be followed by _either_ a `catch` or a `finally`.
* `assert` as identifier (variable, for instance) works using 1.3, but warns. 1.4 and beyond fails, because `assert` became a keyword.
* Enhanced `for` loop _must_ declare its first operand `(int i: intArray)`.
* Static variables are initialized too.
* Wrapper classes as instance or class variables are initialized too, but to `null` not the primitive default value.
* A primitive on the second expression of an assert is valid! Including if it's an attribution.
* Read carefully the line numbers as there are questions that take in account the missing `import` statements.
* It's really ok for `main()` to throw exceptions.

### Exercises

1.  B,E   ✗
2.  B     ✔
3.  C,D   ✔
4.  C,D,E ✔
5.  A,D,F ✔
6.  E     ✔
7.  C     ✔
8.  D     ✔
9.  F,G   ✗
10. D     ✔
11. H     ✔
12. C     ✔
13. D     ✗
14. D,E   ✗
15. B,E   ✗
16. C,D   ✔

Result: 68.75% :)

Chapter 6
---------

* `StringBuffer` is thread-safe, `StringBuilder` isn't - but it's faster.
* Indexes on `String` functions that take an interval behave like a [start, finish) group. Closed on the beginning and open on the end. Or like a `start...finish` interval in Ruby.
* In the test I/O is only about chars. If the question is using Streams, probably it's about serialization.
* About I/O, think of `java.io.*`.
* I/O usually throws exceptions.
* Back to CS 101, remember to always close your files - readers or writers! Ruby has spoiled me! :P
* Passwords are stored in char arrays instead of `Strings` because this way one can really remove them from memory. Strings would still live on the pool and, therefore, someone could hack their way into the password.
* A `Console` is created with `System.console()` not `new Console()`.
* `Console`'s method for printing is `format()`.
* When creating a `writeObject(ObjectOutputStream os)` to define special operations on serialization, it's recommended that one handles the I/O exceptions that may be thrown.
* When doing the above, remember to call `defaultWriteObject()` to serialize the current object.
* And remember to write and read on the same order.
* A serializable class extending a non-serializable class will retain it's state, but the parent's constructor will run!
* Another way to say this is: on deserialization, the first class non-serializable on the hierarchy will have it's constructor run. Therefore, calling all parents constructors.
* Serialization applies only to objects, nothing `static` will be touched.
* `Calendar` is an abstract class! Instantiate it using `Calendar.getInstance()`.
* `DateFormat` is abstract as well.
* `parse()` from `DateFormat` may throw an `ParseException`.
* Months in `Calendar` API are zero-indexed.
* In regexps, `\w` also matches digits and underscore, in addition to letters.
* `Scanner` default delimiter is whitespace.
* Another way to read from terminal (besides using `Console`) is using `System.in`.
* `Formatter` classes round the number, they don't truncate it.
* `equals()` only accepts parameter of the same type of the receiver.
* `mkdir()` and `createNewFile()` are File methods.
* `DateFormat.getInstace()` doesn't take a Locale. `getDateInstace()` does.
* Transient properties are initialized with default values on deserialization process.

### Exercises

1.  E       ✔
2.  C       ✔
3.  A,B,C,D ✗
4.  A       ✔
5.          ✗

        import java.io.File;

        class Maker {
          public static void main(String[] args) {
            try {
              File dir = new File("dir3");
              dir.creteNewDir();
              File file = new File(dir, "file3");
              file.createFile();
            } catch (Exception x) {}
          }
        }

6.          ✔

        import java.util.*;
        import java.text.*;

        class DateTwo {
          public static void main(String[] args) {
            Date d = new Date(1119280000000L);

            DateFormat df = DateFormat.getDateInstance(
                            DateFormat.LONG, Locale.GERMANY);
            System.out.println(df.format(d));
          }
        }

7.  A,B     ✔
8.  E,F     ✗
9.  D,F     ✔
10. E       ✔
11. D       ✔
12. A,B     ✔
13. D,F,G   ✔
14. B       ✔
15. F       ✔

Result: 80% Yey :)

Chapter 7
---------

* `equals()` takes and `Object` as parameter.
* `equals()`, `hashCode()` and `toString()` are public. Default access would break, in overriding.
* If one overrides `equals()`, he/she must override `hashCode()` as well. They are used in hashes.
* Don't use transient instance variables in part of the logic for `equals()` or `hashCode()` as the same object would fail the test after being serialized and deserialized.
* When using hashes, override the `hashCode()` method of the objects being inserted. This guarantees that meaningfully equal objects aren't present in the hash.
* `Arrays.binarySearch()` must receive the argument already ordered. The same sorting criteria must be used in both steps.
* `Arrays.asList()` creates a fixed-size `List` in which alterations are reflected in original array.
* `List.toArray()` may return an `Object[]` or receive a parameter that is an array for it to populate.
* On natural sorting of arrays, spaces come before upper case letters that come before lower case letters. This way, smaller words come before Names that come before regular words.
* Type safe Collections, using Generics, may be mixed with unsafe code. The variable may be passed as parameter to an old method, for instance. In this case, the old method may insert anything it wants in the collection. Including a different kind of object.
* Generics information exist exclusively in compilation time. At runtime, they're ignored.
* When using Generics, the value must match exactly the type in the declared variable. Compatible types aren't allowed. For instance: `List<Object> = new ArrayList<AnyOtherClass>()` fails. It would work with arrays, though.
* `<? extends Class>` is used for read-only methods.
* `<? super   Class>` is used for read-write methods.
* `<? extends Object>` is the same as `<?>`.
* `PriorityQueue` are FIFO.
* `PriorityQueue` is sorted by natural order.
* `PriorityQueue` doesn't offer access by index.
* `add()` and `offer()` are the same.
* `ArrayList<Class> a = methodThatReturnsList()` doesn't compile. It's trying to assign a parent in a child type variable.
* For an object to be inserted in a `TreeSet` (or any other collection that sorts elements) it must implement `Comparable`. Otherwise, an exception will be thrown at runtime.

### Exercises

1.  B         ✔
2.  B,D       ✔
3.  E         ✔
4.  C,D       ✔
5.  B,E,G     ✔
6.  B         ✔
7.  D,F       ✗
8.  A,B,E,F   ✗
9.  B         ✔
10. A,B,C,D,F ✔
11. A,D       ✔
12. B,F       ✔
13. A         ✔
14. B         ✔
15. D         ✗
16. D,G       ✔

Result: 81.25% They said this chapter was a tough one! I fell happy :D

Chapter 8
---------

* Inner classes can declare anything `static`.
* Method classes can only use `final` method variables.
* Anonymous classes only purpose is to override methods. That's because de reference variable to which the object is attributed wouldn't have a way to call any specific method.
* When declaring the type of a variable that is an inner class of another class, one must use the class name. This means `Catedral.Santrum s;` is ok, but `c.Santrum s;` (where c is an object of type Catedral) isn't.
* In the initialization block of a inner class, the parent's `this` is already available.
* Don't use `this` in a inner class to refer to a member of the enclosing class. It doesn't inherit the enclosing class, so `this` won't work!

### Exercises

1.  B,D       ✔
2.  B,C       ✔
3.  B,E       ✔
4.  F         ✗
5.  E         ✔
6.  A         ✔
7.  A,B,D     ✗
8.  C         ✔
9.  B,C,D,F,G ✗
10. C         ✔
11. B         ✔
12. A         ✔

Result: 75% Nice :)

Chapter 9
---------

* The `run()` method in Threads can be overloaded, but the one that gets called is the no-args version.
* If a class implements `Runnable` the way to make the thread run is `new Thread(new RunnableImpl())`.
* The same job - `Runnable` implementer - can be passed to multiple `Thread`s.
* `sleep()` and `yield()` are static methods, which mean when we call `t.sleep()` and `t` is another thread, we cause the current thread to sleep!
* When a thread is made by implementing runnable, it won't inherit methods like `getName()`, therefore, they should be called using `Thread.currentThread().getName()`.
* `Thread` has the `setPriority()` method to define de thread priority. The default is the same priority as the father thread (usually 5).
* To call `wait()`, `notify()` and `notifyAll()` one must have the object's lock.
* `notify()` throws only runtime `Exception`, but `wait()` can throw `InterruptedException`, which is checked. That means, always `try/catch` calls to `wait()`.
* `sleep()`, `wait()` and `join()` throw `InterruptedException`, be careful!
* To be considered thread-safe, all writers _and_ readers of an property must be synchronized.
* You don't want to call `StringBuilder.getString()` while it's resizing it's internal array. Keep the calls to `getString()` and `append()` synchronized!

### Exercises

1.  C     ✔
2.  D     ✔
3.  E     ✗
4.  B,C,F ✗
5.  D     ✔
6.  A     ✔
7.  A,B,D ✗
8.  C     ✗
9.  C     ✗
10. B     ✔
11. A,F,H ✔
12. G     ✗
13. C,D   ✔
14. B,D   ✗
15. D,F   ✗
16. C,E   ✔
17. E     ✗

Result: 47.05% Bah, this is hard! Everyone was already warn me about that :P

Chapter 10
----------

* Use static imports as `import static ...`.
* In case of ambiguity, the complete reference must be written. For instance, static importing `Integer` and `Long` will clash the `MAX_VALUE` constant, use it as `Integer.MAX_VALUE`.
* An static import can't be of a class! It must of static properties of a class.
* When provided, a `-classpath` overrides the system's classpath!
* If a `-classpath` is provided, the path to find the class being executed needs to be provided as well as paths to the dependencies.
* A jar includes the main directory that it compresses.
* When the necessary resources - `.jar`s or `.classe`s - are located in the current directory, they are found. Unless some `-classpath` is declared.

### Exercises

1.  B,C,E   ✗
2.  B       ✔
3.  C,E     ✗
4.  A       ✔
5.  C       ✗
6.  C,D,E   ✔
7.  A,C     ✔
8.  E       ✔
9.  B,C,E,F ✗
10. A       ✗
11. C       ✗
12. C,F,G   ✗

Result: 41.66% I didn't get some ideas so well. Bad! :/
