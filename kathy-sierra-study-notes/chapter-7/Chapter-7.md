Chapter 7
=========

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

Exercises
---------

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
