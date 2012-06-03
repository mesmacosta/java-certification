Chapter 8
=========

* Inner classes can declare anything `static`.
* Method classes can only use `final` method variables.
* Anonymous classes only purpose is to override methods. That's because de reference variable to which the object is attributed wouldn't have a way to call any specific method.
* When declaring the type of a variable that is an inner class of another class, one must use the class name. This means `Catedral.Santrum s;` is ok, but `c.Santrum s;` (where c is an object of type Catedral) isn't.
* In the initialization block of a inner class, the parent's `this` is already available.
* Don't use `this` in a inner class to refer to a member of the enclosing class. It doesn't inherit the enclosing class, so `this` won't work!

Exercises
---------

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
