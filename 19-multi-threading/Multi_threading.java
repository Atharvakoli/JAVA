
public class Multi_threading {
    public static void main(String[] args) {

        // Appache Maven -> https://youtu.be/hD_rEbTfi-k

        // how java stream works internally

        // What is a process -> process is an instance of a computer program
        // What is a thread of execution
        // Use cases -> 01. Updating shared resource, 02. Blocking operations, 03.
        // producer and consumer, 04. readers and writers
        // Advantages -> Effective usage of multiple cores of your processor, Higher
        // performance of your program during execution of specific operations and data
        // processing, Good to use with operations that block main thread of execution,
        // Application responsivesness.
        // disadvantages -> It is easy to use multithreading incorrectly, Incorrect and
        // unsuitable usage of multithreading may cause poor performance, Hard to debug
        // application and find a mistake, Hard to debug application and find a mistake,
        // Testing process of multithreading app is more difficult, It is difficult to
        // introduce multithreading approach to already created
        // What is concurrency
        // What is a multithreading
        // How multithreading work: High-level Overview
        // Threads synchronization: High-level overview
        // classic tasks and use cases for multithreading programming
        // Benefits of multitreading
        // drawbacks of multithreading
        // Multithreading in java (packages, tools) - do not forget to mention
        // concurrent collections

        // First Multi-threading program: Thread & Runnable
        // Thread lifecyle and possible states of a thread
        // How to start a thread - 5 ways
        // Thread class
        // Runnable interface
        // Main properties of Thread object {id, name, priority, daemon}
        // Time Unit
        // How to interrupt thread of execution
        // How to stop execution - deprecated stop(), suspend() and resume() method
        // interrupt() vs interrupted vs isInterrupted()
        // currentThread()
        // sleep()
        // join() method

        // thread lifecycle
        // NEW
        // |
        // Running -- non-running (waiting / blocked)
        // |
        // Terminated

        // Thread Scheduler, Race Condition, Daemon Threads, ThreadGroup
        // Thread scheduler
        // Race condition --> Potential impacts are memory leak, inconsistent data,
        // deadlock data, livelock, we can avoid race conditions by building proper
        // synchronization in critical sections of execution
        // priority field in Thread
        // yield() method in Thread class
        // Daemon threads
        // Thread Groups
        // Throwing exception from run() method
        // Scheduling algorithms
        // Preemptive-priority scheduling
        // First come first Serve scheduling (FCFS)
        // Time-slicing scheduling

        // Synchronization basics
        // What is critical section
        // Atomic operations - Read/write, assigning value to a variable, reading value
        // from array, assigning value to index in array, operations with types from
        // java.util.concurrent.atomic package
        // non-Atomic operation
        // Basic synchronization example
        // What is a monitor - Monitor is a mechanism to synchronize threads access
        // to critical sections
        // What is a mutex
        // monitor vs mutex
        // synchronized keyword -> Any time that you have a method, or group of methods,
        // that manipulates the internal state of an object in a multithreaded
        // situation, you should use the synchronized keyword to guard the state from
        // race conditions. Remember, once a thread enters any synchronized method on an
        // instance, no other thread can enter any other synchronized method on the same
        // instance. However, nonsynchronized methods on that instance will continue to
        // be callable
        // Synchronized blocks
        // wait()
        // notify()
        // notifyAll()

        // Memory managemenet in multithreading programs
        // Memory management in multithreading programs
        // Hardware memory architecture
        // volatile keyword example
        // java.util.concurrent.atomic
        // ThreadLocal
        // InheritableThreadLocal

        // Deadlock & Livelock
        // What is deadlock -> DEadlock is a state where two or more threads are blocked
        // forever, waiting each other
        // What is livelock -> Livelock occurs when two or more processes continually
        // repeat the same interaction in response to changes in the other processes
        // without doing any useful work
        // How to reproduce deadlock
        // How to reproduce livelock
        // How to avoid deadlock -> Do not use multiple locks inside one thread, Capture
        // multiple locks in the same oreder in different threads, Use time constraints
        // to acquire lock
        // How to avoid livelock -> when you need to investigate the conditions that
        // causes lifelong state to come up with solution accordingly

        // Executor Services, callable & Future
        // Executor service interface
        // what is a thread pool
        // How to start thread with executor service
        // What is callable
        // What is future
        // invokeAll() & invokeAny()
        // Thread interruption with executor service

        // Executor service implementations & Thread Factory
        // Overview of basic executor services
        // Fixed Thread pool executor
        // ThreadPoolExecutor
        // Thread Starvation
        // How much threads to create in pool
        // Blocking coefficient
        // ThreadFactory
        // Cached Thread Pool Executor
        // Single Thread Pool Executor
        // Scheduled Thread Pool Executor
        // Perfect number of threads in pool
        // Number of threads = Number of Available Cores * (1 + Wait time / Service
        // time)
        // Wait time / Service --> are Blocking coefficient
        // time)
        // computation-intensive tasks without waiting time
        // 4 (threads in pool) = 4 * (1 + 0)
        // Example with waiting and service time
        // 44(threads in pool) = 4 * (1 + 200 / 20)

        // Perfect Number of threads in pool with multiple executors
        // Number of threads = Number of available cores * Target CPU utilization * (1 +
        // wait time / service time)
        // 22(threads in pool) = 4 * 0.5 * (1 + 200 / 20)

        // Fork/Join Framework
        // Fork/Join Framework overview
        // disadvantages - a faulty task manager, inefficient, special purpose, slow and
        // unscalable, exceedingly complex, lacking in professionals attributes,
        // inadequate in scope
        // ForkJoinPool class
        // Work-stealing algorithm
        // RecursiveAction
        // RecursiveTask
        // newWorkStealingPool
        // Fork/Join critique

        // CompletableFuture
        // How to execute tasks with completable future
        // runAsync(), supplyAsync()
        // complete()
        // What is a callback
        // thenApply(), thenApplyAsync()
        // thenAccept(), thenAcceptAsync()
        // thenRun(), thenRunAsync()
        // Combining Futures
        // thenCompose(), thenComposeAsync()
        // thenCombine(), thenCombineAsync()
        // thenAcceptBoth(), thenAcceptBothAsync()
        // allOf(), anyOf()
        // exception handling with CompletableFuture

        // LockApi
        // What is lock Api
        // Advantages -> Lock may be obtained and released in different places, Time
        // Limit to acquire lock to avoid deadlocks, Work with conditions, Fairness for
        // threads that are waiting for lock longer than other threads
        // Advantages of Lock Api, Lock API allows us to interrupt thread when its
        // waiting for the lock
        // Synchronized blocks vs locks
        // Lock interface overview
        // ReentrantLock
        // Lock fairness
        // conditions
        // Lock interface
        // readWriteLock interface
        // ReentrantReadWriteLock class
        // StampedLock

        // Synchronizers tools
        // CyclicBarrier
        // CountDownLatch
        // CyclicBarrier Vs CountDownLatch
        // Differences -> CyclicBarrier works with thread CountDownLatch works with
        // tasks, In CyclicBarrier we can execute action after tripping the barrier, we
        // can reuse CyclicBarrier - count resets CountDownLatch, BrokeBarrierException
        // in CyclicBarrier. InterruptedException in CountDownLatch without impacting of
        // other threads
        // Semaphore
        // Exchanger
        // Phaser
        // Phaser VS CyclicBarrier
        // Differences -> Phaser supports multiple phases. Each Phase has a number, The
        // number of threads that are participating in phaser is not limited and is not
        // fixed. Thread may take part and after that cancel own participation, Thread
        // shoudln't necessarily wait for other threads reach the synchronization point.
        // To continue its work it is just enough to notify about arrival and proceed
        // execution. This is comething what is available in phaser but is not available
        // in cyclic barrier, In comparison to cyclic barrier, there is no action
        // attached that potentially might be executed after all threads reach specific
        // point

        // An example of deadlock.
        new Deadlock();

        // The key to utilizing Java’s multithreading features effectively is to think
        // concurrently rather than serially. For example, when you have two subsystems
        // within a program that can execute concurrently, make them individual threads.
        // With the careful use of multithreading, you can create very efficient
        // programs. A word of caution is in order, however: If you create too many
        // threads, you can actually degrade the performance of your program rather than
        // enhance it. Remember, some overhead is associated with context switching. If
        // you create too many threads, more CPU time will be spent changing contexts
        // than executing your program! One last point: To create compute-intensive
        // applications that can automatically scale to make use of the available
        // processors in a multi-core system, consider using the new Fork/Join
        // Framework,
    }
}

// An example of deadlock.
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A Interrupted");

            System.out.println(name + " trying to call B.last()");
            b.last();
        }
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B Interrupted");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }
}