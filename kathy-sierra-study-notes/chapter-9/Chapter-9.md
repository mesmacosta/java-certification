Chapter 9
=========

* The `run()` method in Threads can be overloaded, but the one that gets called is the no-args version.
* If a class implements `Runnable` the way to make the thread run is `new Thread(new RunnableImpl())`.
* The same job - `Runnable` implementer - can be passed to multiple Threads.
* `sleep()` and `yield()` are static methods, which mean when we call `t.sleep()` and t is another thread, we cause the current thread to sleep!

Exercises
---------
✔✗

Result: 
