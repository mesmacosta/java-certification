Chapter 7
=========

* `equals()` takes and Object as parameter.
* `equals()`, `hashCode()` and `toString()` are public. Default access would break, in overriding.
* If one overrides `equals()`, must override `hashCode()` as well. They are used in Hashes.
* Don't use transient instance variables in part of the logic for `equals()` or `hashCode()` as the same object would fail the test after being serialized and deserialized.
* When using hashes, override the `hashCode()` method of the objects being inserted. This guarantees that meaningfully equal objects aren't present in the hash.
* `Arrays.binarySearch()` must receive the argument already ordered. The same sorting criteria must be used in both steps.
* `Arrays.asList()` creates a fixed-size List in which alterations are reflected in original array.
* `List.toArray()` may return an `Object[]` or receive a parameter that is an array for it to populate.

Exercises
---------
✔✗

Result:
