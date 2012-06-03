Chapter 1
=========

* Identifiers can start with `$`.
* Contants are created using `static` and `final`.
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

Exercises
---------

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
