Chapter 9
=========

* The `run()` method in Threads can be overloaded, but the one that gets called is the no-args version.
* If a class implements `Runnable` the way to make the thread run is `new Thread(new RunnableImpl())`.
* The same job - `Runnable` implementer - can be passed to multiple Threads.
* `sleep()` and `yield()` are static methods, which mean when we call `t.sleep()` and t is another thread, we cause the current thread to sleep!
* When a thread is made by implementing runnable, it won't inherit methods like `getName()`, therefore, they should be called using `Thread.currentThread().getName()`.
* `Thread` has the `setPriority()` method to define de thread priority. The default is the same priority as the father thread (usually 5).
* To call `wait()`, `notify()` and `notifyAll()` one must have the object's lock.
* `notify()` throws only runtime Exception, but `wait()` can throw InterruptedException, which is checked. That means, always `try/catch` calls to `wait()`.

Exercises
---------
✔✗

Result: 
