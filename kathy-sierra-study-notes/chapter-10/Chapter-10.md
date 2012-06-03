Chapter 10
==========

* Use static imports as `import static ...`.
* In case of ambiguity, the complete reference must be written. For instance, static importing `Integer` and `Long` will clash the `MAX_VALUE` constant, use it as `Integer.MAX_VALUE`.
* An static import can't be of a class! It must of static properties of a class.
* When provided, a `-classpath` overrides the system's classpath!
* If a `-classpath` is provided, the path to find the class being executed needs to be provided as well as paths to the dependencies.
* A jar includes the main directory that it compresses.
* When the necessary resources - `.jar`s or `.classe`s - are located in the current directory, they are found. Unless some `-classpath` is declared.

Exercises
---------

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
