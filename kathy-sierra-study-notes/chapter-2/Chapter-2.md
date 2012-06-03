Chapter 2
=========

* Only methods are dinamically selected on the actual object. Not static methods, nor variables. This is because `static` methods belongs to the class, so the declared class will be referenced. You shouldn't be calling static methods on objects, anyway, it doesn't make sense. Variables aren't overridden, so this part should be obvious.
* Child class overridden methods accessors cannot be more restrictive! This would break the contract the parent class which should be guaranteed.
* Only instance methods can be overridden.
* Be really careful about overloaded X overridden methods!
* The decision of which overloaded method to call is performed at compile time! Not dinamically at runtime!
* Downcasting in the same inheritance tree compiles (but may lead to runtime errors). Downcasting on different inheritance trees will not compile.
* In UML: hard line represents inheritance, dashed line represents interface implementation.
* An array is an object.

Exercises
---------

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
