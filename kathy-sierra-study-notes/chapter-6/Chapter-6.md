Chapter 6
=========

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

Exercises
---------

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
