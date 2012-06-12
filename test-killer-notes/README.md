Test Killer Noter
=================

I know it's like cheating. But I've really studied and learned a lot these days studying for SCJP exam. I don't believe someone could only read Test Killer and succeed on the exam, you got to study for real.

That said, seeing Test Killer questions is more like another simulator. With the level of difficulty of real exam questions, which also nice, because simulators tend to be harder, in purpose.

Notes
-----

* `method(String...a)` with no spaces, is valid. `method(String[]... a)` is also valid, it's an array of arrays of `String`s.
* Check the visibility of the class before checking the visibility of the member!! You stupid! :P
* Writing a line separator to an open stream is something that only `FileWriter` does.
* `catch(Exception ex) { ; }` is valid syntax.
* `mkdir()` doesn't throw `IOException`.
* In `printf()` the flag `%d` if for integers, of course. Passing an float would cause an exception. So far, nothing new, but the good part is that the length modifier of an float - for which the flag is `%f` - will pad with spaces the number.
* Of course, an overridden `finalize()` won't call it's parents! That only happens for constructors ;)
* In garbage collection questions, attention to objects inside other objects!!!

Result
------

50 of 62.

Many questions I considered wrong because I looked the answer by accident. The real exam questions really are easier \o/
