Chapter 6
=========

* StringBuffer is thread-safe, StringBuilder isn't - but it's faster.
* Indexes on string functions that take and interval behave like a [start, finish) group. Closed on the beginning and open on the end. Or like a `start...finish` interval in Ruby.
* In the test I/O is only about chars. If the question is using Streams, probably it's about serialization.
* About I/O, think of `java.io.*`.
* I/O usually throws exceptions.
* Back to CS 101, remember to always close your files - readers or writers! Ruby has spoiled me! :P
* Passwords are stored in char arrays instead of Strings because this way one can really remove them from memory. Strings would still live on the pool and, therefore, someone could hack their way into the password.
* A Console is created with `System.console()` not `new Console()`.
* Console's method for printing is `format()`.
* When creating a `writeObject(ObjectOutputStream os)` to define special operations on serialization, it's recommended that one handles the I/O exceptions that may be thrown.
* When doing the above, remember to call `defaultWriteObject()` to serialize the current object.
* And remember to write and read on the same order.
* A serializable class extending a non-serializable class will retain it's state, but the parent's constructor will run!
* Another way to say this is: on deserialization, the first class non-serializable on the hierarchy will have it's constructor run. Therefore, calling all parents constructor.
* Serialization applies only to objects, nothing `static` will be touched.

Exercises
---------
✔✗

Result: 
