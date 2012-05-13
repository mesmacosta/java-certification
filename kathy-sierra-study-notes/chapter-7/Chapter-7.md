Chapter 7
=========

* `equals()` takes and Object as parameter.
* `equals()`, `hashCode()` and `toString()` are public. Default access would break, in overriding.
* If one overrides `equals()`, must override `hashCode()` as well. They are used in Hashes.
* Don't use transient instance variables in part of the logic for `equals()` or `hashCode()` as the same object would fail the test after being serialized and deserialized.

Exercises
---------
✔✗

Result:
