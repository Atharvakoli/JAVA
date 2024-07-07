
public class Multi_threading {
    public static void main(String[] args) {

        // Appache Maven -> https://youtu.be/hD_rEbTfi-k

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
        // synchronized keyword
        // Synchronized blocks
        // wait()
        // notify()
        // notifuAll()

    }
}
