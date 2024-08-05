package MainConcepts.interfaces;

import java.util.Random;

/*
If a class includes an interface but does not fully implement the methods required by that interface, then that class must be declared as
*/
abstract public class Interfaces {
    public static void main(String[] args) {
        // Callback c = new Client();
        // c.callback(7);

        // anthor class
        // Callback c1 = new Client();
        // AnotherClient ob = new AnotherClient();

        // c1.callback(7);
        // c1 = ob;// c now refers to AnotherClient object
        // c1.callback(7);

        // Nested interface
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("this won't be displayed");
        }

        // Applying interface Example
        FixedStack myStck1 = new FixedStack(4);
        FixedStack myStck2 = new FixedStack(7);

        int i = 0, j = 0;
        while (i < 4) {
            myStck1.push(i + 1);
            i++;
        }
        while (j < 8) {
            myStck2.push(j + 1);
            j++;
        }
        while (i < 4) {
            myStck1.pop();
            i++;
        }
        while (j < 8) {
            myStck2.pop();
            j++;
        }

        // The following class uses both the FixedStack and DynStack implementations
        IntStack myStack;
        DynStack ds = new DynStack(4);
        FixedStack fs = new FixedStack(8);

        myStack = fs; // load fixed stack

        while (i < 12) {
            myStack.push(i + 1);
        }

        myStack = ds;
        while (i < 8) {
            myStack.push(i + 1);
        }

        myStack = ds;
        System.out.println("Values in dynamic stack:");
        while (i < 8) {
            System.out.println(myStack.pop());
        }
        /*
         * In this program, mystack is a reference to the IntStack interface. Thus, when
         * it refers to ds, it uses the versions of push( ) and pop( ) defined by the
         * DynStack implementation. When it refers to fs, it uses the versions of push(
         * ) and pop( ) defined by FixedStack. As explained, these determinations are
         * made at run time. Accessing multiple implementations of an interface through
         * an interface reference variable is the most powerful way that Java
         * achieves run-time polymorphism.
         */

        // Variables in Interfaces
        Question q = new Question();
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());

        // Interfaces can be extends or inherited

        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();

    }
}

class Constants {
    public static final double PI = 3.14159;
}

interface Animal {
    void makeSound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("dogs plays");
    }
}

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("callback called with : " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}

class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}

// Nested interface

class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

// Applying Interface in great example

interface IntStack {
    void push(int item);

    int pop();

    // Because clear( ) has a default, it need not be
    // implemented by a preexisting class that uses IntStack.
    /*
     * the default method gives you
     * • a way to gracefully evolve interfaces over time, and
     * • a way to provide optional functionality without requiring that a class
     * provide a placeholder implementation when that functionality is not needed.
     */
    default void clear() {
        System.out.println("clear() not implemented");
    }
}

class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        // for dynamic size
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            int i = 0;
            while (i < stck.length) {
                temp[i] = stck[i];
                i++;
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;

        }
        // for fixed size
        // if (tos == stck.length - 1) {
        // System.out.println("Stack is Full ");
        // } else {
        // stck[++tos] = item;
        // }
    }

    @Override
    public int pop() {
        // for fixed size
        if (tos < 0) {
            System.out.println("Stack Overflow ");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        // for dynamic size
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            int i = 0;
            while (i < stck.length) {
                temp[i] = stck[i];
                i++;
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;

        }
    }

    @Override
    public int pop() {
        // for fixed size
        if (tos < 0) {
            System.out.println("Stack Overflow ");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

// Variables in Interfaces
interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        } else {
            return NEVER;
        }
    }
}

class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
            default:
                System.out.println("Nothing result is executed");
                break;
        }
    }
}

// Interfaces can be extends or inherited
interface C {
    void meth1();

    void meth2();
}

interface D extends C {
    void meth3();

    // default interface method
    default String getString() {
        return "Default String";
    }
}

// This class must implement all of C and D
class MyClass implements D {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }

    public void meth3() {
        System.out.println("Implement meth3().");
    }
}