import java.util.concurrent.Callable;

public class Interview {
    // ? Part 1: Java Multithreading Interview - Questions and Answers
    // WHAT IS THE DIFFERENCE BETWEEN A PROCESS AND A THREAD?

    // A process is a unit of the operating system that is allocated memory and
    // other resources. A thread is a unit of code execution. A thread has a stack -
    // some of its memory for execution. The rest of a process's memory is shared by
    // all of its threads. Threads run on processor cores.

    // In some OS, the difference between processes and threads is minimized.

    // HOW CAN YOU CREATE A TREAD?

    // There are several ways to create and run threads:

    // With a class that implements Runnable:

    // Create an object of class Thread.

    // Create an object of a class that implements the Runnable interface.

    // Call the start() method on the created Thread object (after that, the run()
    // method on the passed object that implements Runnable will be launched).

    // With a class that extends Thread:

    // Create an object of class ClassName extends Thread.

    // Override run() in this class

    // With a class that implements java.util.concurrent.Callable:

    // Create an object of a class that implements the Callable interface.

    // Create an ExecutorService object specifying the thread pool.

    // Create a Future object. The launch occurs through the submit() method;
    // Signature: <T> Future<T> submit(Callable<T> task).

    // Don’t forget that Runnable and Callable are functional interfaces. That means
    // that you can describe instance of this type with the help of lambda
    // expression or method reference.

    // WHAT IS A MONITOR?

    // Access control to a resource object is provided by the concept of a monitor.
    // An instance monitor can have only one owner. When attempting concurrent
    // access to an object whose monitor has an owner, a thread wishing to lock the
    // resource object must wait until that object's monitor is released before
    // taking possession of it and beginning to use the resource object.

    // WHAT WAYS OF SYNCHRONIZATION IN JAVA?

    // Following are some ways to synchronize in Java:

    // System synchronization using wait/notify. A thread that is waiting for any
    // conditions to be met calls the wait method on this object, having previously
    // captured its monitor. This stops his work. Another thread can call the notify
    // method on the same object (again, having previously captured the object's
    // monitor), as a result of which the thread waiting on the object "wakes up"
    // and continues its execution.

    // System synchronization using join. The join method, called on an instance of
    // the Thread class, allows the current thread to stop before the thread
    // associated with this instance has finished running.

    // Using classes from the java.util.concurrent package, which provides a set of
    // classes for organizing inter-thread communication. Examples of such classes
    // are Lock, Semaphore, etc. The concept of this approach is to use atomic
    // operations and variables.

    // Synchronization blocks and synchronized methods

    // HOW DO THE WAIT AND NOTIFY/NOTIFYALL METHODS WORK?

    // These methods are designed for inter-thread synchronization, for the
    // interaction of threads with each other.

    // How these methods work? First, they can only be called by the thread that has
    // captured the monitor of the object for which these methods are called. That
    // is, they are called inside the synchronized block and on the object whose
    // monitor is captured by this synchronized keyword.

    // What does the wait() method do? The wait() method releases the object's
    // monitor, so that other threads can now capture it (the monitor), that is,
    // enter the synchronized block for this object. The wait() method then enters
    // the wait state until another thread calls notify() or notifyAll() on the same
    // object. After that, the thread in which wait() was called tries to capture
    // the object's monitor again, and when the monitor becomes free, that is, when
    // another thread releases it, it captures the monitor and continues execution
    // from the next statement after wait(). Moreover, the thread that called wait()
    // has no advantage over other threads waiting to capture the same monitor.

    // What do notify(), notifyAll() methods do? They "wake up" the thread waiting
    // with the wait() method (if any) and put it into the state of waiting for the
    // monitor to be released. The difference between notify() and notifyAll() is
    // that notify() wakes up only one thread waiting with the wait() method, which
    // one will be awakened cannot be determined, but notifyAll() - all such
    // threads.

    // WHAT IS THE DIFFERENCE IN THE WORK OF THE WAIT METHOD WITH A PARAMETER AND
    // WITHOUT A PARAMETER?

    // The difference between the methods is as follows:

    // final void wait() - the method is used in a multithreaded environment, can
    // only be called by the thread that owns the synchronization object. In this
    // case, the synchronization object is released, and the current thread goes
    // into the mode of waiting for a signal of the release of the synchronization
    // object by another thread by calling the notify() or notifyAll() method.

    // final void wait(long time) - similar to wait() , this method is used in a
    // multithreaded environment, the current thread goes into the mode of waiting
    // for a signal to release the synchronization object by another thread by
    // calling the notify() or notifyAll() method. In case the wait occurs for the
    // specified time, then execution continues unconditionally.

    // HOW DOES THE THREAD.YIELD() METHOD WORK? HOW DO THE THREAD.SLEEP() AND
    // THREAD.YIELD() METHODS DIFFER?

    // Main differences:

    // yield() method - attempts to tell the thread scheduler to execute another
    // thread that is waiting in the execution queue. The method does not attempt to
    // put the current thread into a blocking, sleeping, or waiting state. He just
    // tries to transfer it from the "working" state to the "workable" state.
    // However, executing a method may have no effect at all. Thread state remains
    // RUNNABLE

    // sleep() method - suspends the thread for the specified time. state changes to
    // TIMED_WAITING, after expiration - RUNNABLE

    // the wait() method - changes the state of the thread to WAITING and can only
    // be called on the object that owns the lock, otherwise an
    // IllegalMonitorStateException will be thrown. When the method fires, the lock
    // is released, allowing other threads waiting to acquire the same lock to
    // continue. in the case of wait(int) with an argument, the state will be
    // TIMED_WAITING.

    // HOW DOES THE THREAD.JOIN() METHOD WORK?

    // The join() method is called in order to attach the current thread to the end
    // of the thread on which the method is called. That is, the second thread will
    // be in blocking mode until the first thread is executed.

    // WHAT IS DEAD LOCK?

    // This is when one thread A received a lock on object A1, and thread B received
    // a lock on object B1. While thread A tries to acquire a lock on object B1, and
    // thread B on A1.

    // ON WHICH OBJECT DOES SYNCHRONIZATION OCCUR WHEN THE STATIC SYNCHRONIZED
    // METHOD IS CALLED?

    // Imagine a situation that two threads simultaneously change the state of some
    // object, this is unacceptable. To do this, you need to synchronize the
    // threads. How to do it? The synchronized keyword allows you to do this by
    // setting it in the method signature. Or, in the method, you can describe the
    // synchronized block, only as a parameter you need to pass an object that will
    // be blocked.

    // Imagine a situation where one thread is waiting for an object to be
    // unlocked... what if there are several threads waiting for it? There is no
    // guarantee that the object that has been waiting the most for the lock to be
    // released will be executed first.

    // Static synchronized methods and non-static synchronized methods will not
    // block each other, ever. Static methods are blocked on an instance of the
    // class Class while non-static methods are blocked on the current instance
    // (this). These actions do not interfere with each other.

    // wait() - releases the lock;

    // WHAT IS THE KEYWORD VOLATILE, SYNCHRONIZED, TRANSIENT, NATIVE USED FOR?

    // Brief description of the keywords:

    // volatile - indicates that the field is synchronized across multiple threads

    // synchronized - indicates that the method is synchronized, or the method can
    // contain a synchronization block.

    // transient - indicates that the variable is not to be serialized

    // native - indicates that the implementation of the method is written on a
    // different software platform

    // WHAT IS STREAM PRIORITY?

    // The thread priority is a number from 1 to 10, depending on which the thread
    // scheduler chooses which thread to run. However, you cannot rely on priorities
    // for predictable execution of a multithreaded program!

    // WHAT ARE DAEMONS THREADS IN JAVA?

    // These are threads that run in the background and are not guaranteed to
    // complete. That is, if all threads have completed, then the daemon thread
    // simply terminates along with the application closing.

    // WHAT DOES IT MEAN - TO MAKE THREAD SLEEP?

    // You can put a thread to sleep using the sleep(long ms) method.

    // ms - time in milliseconds.

    // When this method is called, the thread goes to sleep, after sleep, the thread
    // goes to the thread pool and is in the "healthy" state, i.e. it is not
    // guaranteed that after awakening it will be executed immediately. Also, a
    // thread cannot put another thread to sleep, since the sleep method is a static
    // method! You will simply put the current thread to sleep and nothing more!
    // Also, the sleep() method can throw an InterruptedException() in case Thread
    // will be interrupted while thread is in sleep state.

    // IN WHAT STATES CAN A JAVA THREAD BE IN? HOW DOES THREAD WORK?

    // We have a current thread running the main method. This thread has its own
    // stack, and this stack begins with a call to the main method.

    // Next, in the main method, we create a new thread, what happens? A new thread
    // is created and its own stack is allocated for it with the original run ()
    // method.

    // When we start multiple threads, we cannot guarantee a certain order of their
    // calls. Thread scheduling is handled by the JVM thread scheduler, choosing a
    // thread from pools of threads. We can't even guarantee that if the first
    // thread started running first, then it will finish running first, it may
    // finish running last.

    // Another nuance is that a thread that has finished its execution cannot be
    // restarted! It is in the "dead" state, and to start a new thread, the object
    // must be in the "new" state.

    // Threads have the following states:

    // new (this is when an instance of the Thread class was just created)

    // alive or running (it enters this state after starting the start() method, but
    // this does not mean that the thread is already running! Or it can enter this
    // state from the running or blocked state)

    // running (this is when the run() method started executing)

    // waiting (waiting) / Blocked (blocked) / Sleeping (sleeping). These states
    // characterize the thread as not ready for operation. I combined these states
    // because they all have one thing in common - the thread is still alive
    // (alive), but currently cannot be executed. In other words, the thread is no
    // longer running, but it can return to a running state. The thread may be
    // blocked, which means that it is waiting for the release of some resources.
    // The thread can sleep if the sleep(long s) method is encountered, or it can
    // wait if the wait() method is encountered, it will wait until the notify() or
    // notifyall() method is called.

    // dead (the state when the run() method has completed its work)

    // ? Part 2: Java Multithreading Interview - Questions and Answers
    // WHAT ARE THE TWO INTERFACES FOR THE IMPLEMENTATION OF RUNNABLE AND CALLABLE
    // TASKS?

    // Main differences:

    // The Runnable interface was introduced in Java 1.0, and the Callable interface
    // was introduced in Java 5.0 as part of the java.util.concurrent library.

    // Classes that implement the Runnable interface must implement the run() method
    // in order to execute a task. Classes that implement the Callable interface
    // must implement the call() method to complete the task.

    // The Runnable.run() method does not return any value, its type is void, and
    // the Callable.call() method can return a value of type T. The Callable
    // interface is a parameterized Callable<T> and the type of value that will be
    // returned in the call() method is given by this parameter T.

    // The run() method cannot throw a checked exception, while the call() method
    // can throw a checked exception.

    // DIFFERENCES BETWEEN CYCLICBARRIER AND COUNTDOWNLATCH?

    // Although both of these synchronizers allow threads to wait for each other,
    // the main difference between them is that you cannot reuse CountDownLatch
    // after its count reaches zero, but you can use CyclicBarrier again even after
    // the barrier is broken.

    // WHAT IS RACE CONDITION?

    // Race conditions are the cause of subtle bugs. As the name says, a race
    // condition is caused by a race condition between multiple threads, if the
    // thread that should run first loses the race and the second one runs, the
    // behavior of the code changes, causing non-deterministic bugs. These are some
    // of the hardest bugs to catch and reproduce, due to the erratic nature of
    // races between threads. An example of a race condition is erratic execution.

    // HOW TO STOP A THREAD?

    // Java provides rich APIs for everything, but, ironically, doesn't provide a
    // convenient way to stop a thread. JDK 1.0 had several control methods like
    // stop() , suspend() and resume() which were marked as deprecated in future
    // releases due to potential deadlock threats, since then the Java API
    // developers have made no attempt to introduce a persistent, thread -safe and
    // elegant way to stop threads. Programmers mostly rely on the fact that a
    // thread stops itself as soon as it finishes executing the run() or call()
    // methods. To stop manually, programmers take advantage of the interrupt()
    // method that switches the flag inside the thread and throws interrupted
    // exception when the thread is in waiting state.

    // WHAT HAPPENS WHEN AN EXCEPTION HAPPENS IN A THREAD?

    // This is one of the good trick questions. In simple words, if an exception is
    // not caught, the thread is dead, if a handler for uncaught exceptions is
    // installed, it will receive a callback.

    // Thread.UncaughtExceptionHandler is an interface defined as a nested interface
    // for handlers to be called when a thread suddenly stops due to an uncaught
    // exception. When a thread is about to stop due to an uncaught exception, the
    // JVM will check for an UncaughtExceptionHandler using
    // Thread.getUncaughtExceptionHandler() and call the uncaughtException() method
    // on the handler, passing the thread and the exception as arguments.

    // WHAT IS A THREADLOCAL VARIABLE?

    // ThreadLocal variables are a special kind of variable available to the Java
    // programmer.

    // This is a good way to achieve thread-safety for expensive-to-create objects,
    // for example you can make SimpleDateFormat thread-safe using ThreadLocal.
    // Because it is an expensive class, it is not desirable to use it in a local
    // scope that requires separate instances per call. By giving each thread its
    // own copy, you kill two birds with one stone. First, you reduce the number of
    // expensive object instances by reusing a fixed number of instances, and
    // second, you achieve thread-safety, no loss of synchronization, and no
    // immutability. Another good example of a thread-local variable is the
    // ThreadLocalRandom class, which reduces the number of instances of
    // expensive-to-create Random objects in a multi-threaded environment.

    // WHAT IS FUTURETASK?

    // FutureTask is a cancelable asynchronous computation in a parallel Java
    // application. This class provides a basic implementation of Future, with
    // methods for starting and stopping a calculation, methods for querying the
    // state of a calculation, and retrieving results. The result can only be
    // retrieved when the computation is complete, the getter will block if the
    // computation has not yet completed. FutureTask objects can be used to wrap
    // Callable and Runnable objects. Since FutureTask implements Runnable, it can
    // be passed to an Executor for execution.

    // DIFFERENCE BETWEEN INTERRUPTED AND ISINTERRUPTED?

    // The main difference between interrupted() and isInterrupted() is that the
    // first resets the interrupt status while the latter does not. The interrupt
    // mechanism in Java is implemented using an internal flag known as interrupt
    // status. Interrupting a thread by calling Thread.interrupt() sets this flag.
    // When an interrupted thread checks the interrupt status by calling the static
    // Thread.interrupted() method, the interrupt status is reset. The non-static
    // isInterrupted() method, which is used by a thread to check the interrupt
    // status of another thread, does not change the interrupt flag. By convention,
    // any method that terminates by throwing an InterruptedException will reset the
    // interrupt flag. However, there is always the possibility that the flag will
    // immediately be set again if another thread calls interrupt().

    // WHY ARE THE WAIT AND NOTIFY METHODS CALLED IN A SYNCHRONIZED BLOCK?

    // The main reason for calling wait and notify from within a synchronized block
    // or method is that the Java API absolutely requires it. If you call them from
    // a non-synchronized block, your code will throw an
    // IllegalMonitorStateException.

    // A more subtle reason is to avoid race conditions between wait and notify
    // calls.

    // WHAT IS THREADS POOL?

    // Creating a thread is expensive in terms of time and resources. If you create
    // a thread while a request is being processed, it will slow down the response
    // time, and the process can only create a limited number of threads. To avoid
    // these problems, a pool of threads is created during application startup and
    // the threads are reused to process requests. This pool of threads is called
    // the "thread pool", and the threads in it are the worker thread. Starting with
    // Java 1.5, the Java API provides an Executor framework that allows you to
    // create different thread pools, such as a single thread pool that processes
    // only one job per unit of time, a fixed thread pool, a pool with a fixed
    // number of threads, and a cached thread pool, an expandable pool, suitable for
    // applications with many short duration jobs. There are also other executor
    // services are available.

    // DIFFERENCES BETWEEN LIVELOCK AND DEADLOCK?

    // Livelock is similar to deadlock, in the fact that the productivness of the
    // program is zero. The difference is that in livelock the states of threads or
    // involved processes constantly change depending on each other. Livelock is a
    // special case of resource starvation. A real life example of a livelock is
    // when two people meet in a narrow hallway and each, trying to be polite, steps
    // aside, and so they move endlessly from side to side.

    // HOW TO CHECK IF THE THREAD HOLDS A LOCK?

    // java.lang.Thread has a holdsLock() method that returns true if and only if
    // the current thread is holding the monitor on a specific object.

    // WHICH PARAMETER DOES JVM USE TO CONTROL THREADS STACK SIZE?

    // The -Xss parameter is used to control the size of a thread's stack in Java.

    // DIFFERENCES BETWEEN SYNCHRONIZED AND REENTRANTLOCK?

    // There were times when the only way to achieve mutex was through the
    // synchronized keyword, but it has several drawbacks, like you can't extend
    // lock outside of a method or block of code, and so on. Java 5 solves this
    // problem by providing finer control through the Lock interface. ReentrantLock
    // is a common implementation of Lock that provides a Lock with the same basic
    // behavior and semantics as an implicit monitor, achieved using synchronized
    // methods, but with more features.

    // WHAT IS SEMAPHORE?

    // Semaphore is a new type of synchronizer. This is a semaphore with a counter.
    // Conceptually, a semaphore manages a set of permissions. Each acquire()
    // blocks, if necessary, before the permission is available, then acquires it.
    // Each release() adds a permission, potentially releasing the blocking
    // acquirer. However, this does not use the actual permission objects; The
    // semaphore simply keeps the number available and acts accordingly. A semaphore
    // is used to secure expensive resources that are scarcely available, such as a
    // pooled database connection.

    // DIFFERENCES BETWEEN THE SUBMIT() AND EXECUTE() METHODS OF THE THREADS POOL?

    // Both methods are ways of submitting a task to the thread pool, but there is a
    // slight difference between them. Execute(Runnable command) is defined in the
    // Executor interface and executes the given task in the future, but more
    // importantly, returns nothing. On the other hand, submit() is an overloaded
    // method, it can accept Runnable and Callable tasks, and can return a Future
    // object that can be used to cancel execution and/or wait for the result of a
    // calculation. This method is defined in the ExecutorService interface, which
    // inherits from the Executor interface, and every thread pool class, such as
    // ThreadPoolExecutor or ScheduledThreadPoolExecutor, inherits these methods.

    // WHAT IS A BLOCKING METHOD?

    // A blocking method is a method that blocks until the task is completed, for
    // example the accept() method on a ServerSocket blocks while waiting for a
    // client to connect. Here, blocking means that control will not return to the
    // calling method until the task is completed. On the other hand, there are
    // asynchronous or non-blocking methods that complete before the task is
    // completed.

    // WHAT IS READWRITELOCK?

    // In general, ReadWriteLock is the result of a lock parsing technique to
    // improve the performance of parallel applications. This is an interface that
    // was added in Java 5. It operates on a pair of related locks, one for reads
    // and one for writes. A read lock can be held by multiple reading threads at
    // the same time, as long as there are no write threads. The writing lock is
    // exclusive. If you like, you can implement an interface with your ruleset, or
    // you can use ReentrantReadWriteLock, which supports a maximum of 65535
    // recursive write locks and 65535 recursive read locks.

    // WHAT IS DOUBLE CHECKED LOCKING SINGLETON?

    // This is an old way of creating a thread-safe singleton that tries to optimize
    // performance by only blocking when the singleton is first instantiated.

    // WHAT IS THE FORK/JOIN FRAMEWORK?

    // The Fork/Join framework, introduced in JDK 7, is a powerful utility that
    // allows a developer to take advantage of multiple processors in modern
    // servers. It is designed for work that can be recursively broken down into
    // small particles. The goal is to use all available computing power to increase
    // the performance of your application. One significant advantage of this
    // framework is that it uses a work-stealing algorithm. Worker threads that have
    // run out of jobs can "steal" jobs from other threads that are still busy.
}
