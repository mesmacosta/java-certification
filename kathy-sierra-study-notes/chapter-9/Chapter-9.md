Chapter 9
=========

* The `run()` method in Threads can be overloaded, but the one that gets called is the no-args version.
* If a class implements `Runnable` the way to make the thread run is `new Thread(new RunnableImpl())`.
* The same job - `Runnable` implementer - can be passed to multiple `Thread`s.
* `sleep()` and `yield()` are static methods, which mean when we call `t.sleep()` and `t` is another thread, we cause the current thread to sleep!
* When a thread is made by implementing runnable, it won't inherit methods like `getName()`, therefore, they should be called using `Thread.currentThread().getName()`.
* `Thread` has the `setPriority()` method to define de thread priority. The default is the same priority as the father thread (usually 5).
* To call `wait()`, `notify()` and `notifyAll()` one must have the object's lock.
* `notify()` throws only runtime `Exception`, but `wait()` can throw `InterruptedException`, which is checked. That means, always `try/catch` calls to `wait()`.
* `sleep()`, `wait()` and `join()` throw `InterruptedException`, be careful!
* To be considered thread-safe, all writers _and_ readers of an property must be synchronized.
* You don't want to call `StringBuilder.getString()` while it's resizing it's internal array. Keep the calls to `getString()` and `append()` synchronized!

Exercises
---------

1.  C     ✔
2.  D     ✔
3.  E     ✗
4.  B,C,F ✗
5.  D     ✔
6.  A     ✔
7.  A,B,D ✗
8.  C     ✗
9.  C     ✗
10. B     ✔
11. A,F,H ✔
12. G     ✗
13. C,D   ✔
14. B,D   ✗
15. D,F   ✗
16. C,E   ✔
17. E     ✗

Result: 47.05% Bah, this is hard! Everyone was already warn me about that :P
