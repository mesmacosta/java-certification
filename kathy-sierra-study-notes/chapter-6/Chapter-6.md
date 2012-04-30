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

Exercises
---------
✔✗

Result: 
