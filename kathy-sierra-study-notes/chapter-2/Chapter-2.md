Chapter 2
=========

* Only methods are dinamically selected on the actual object. Not static methods, nor variables.
    This is because static methods belongs to the class, so the declared class will be referenced. You shouldn't be calling static methods on objects, anyway, it doesn't make sense. Variables aren't overridden, so this part should be obvious.
* Child class overridden methods accessors cannot be more restrictive! This would break the contract the paren class guaranteed.
* Only instance methods can be overridden.
