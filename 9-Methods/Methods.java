import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int sum = sum(1, 3);
        printToConsole(sum);
        printToConsole(sum(2.1, 3.5));
        printToConsole("Some text");

        // passing by Value
        // That the value of the method parameter is copied into another locatipn of
        // your memory, and when accessing or modifying the variable within your
        // function, only the copy is accessed or modified and the original value is
        // left untouched
        // passing by reference -> that the memory address of the variable, or it is
        // better to say a pointer to the memory location is passed to method. Incase we
        // pass by reference - we pass address where this cup is located

        // In Java primitive and reference types of data are passed by value

        int i = 10;

        changeIntValue(i);
        System.out.println("i after changeIntValue():\t" + i);

        i = changeInt(i);
        System.out.println("i after changeInt():\t\t" + i);

        int[] array = { 1, 2, 3 };

        System.out.println("array before changeArray():\t" + Arrays.toString(array));
        changeArray(array);
        System.out.println("array after changeArray():\t" + Arrays.toString(array));

        // Recursive methods
        // drawbacks -> lot of method invocations or stop condition will be written
        // incorrectly - you program will be stopped because of 'StackOverflowError'
        // callTheSameMethod();
        System.out.println("3] = " + calculateFactorial(3));
        System.out.println("3] = " + calculateFactorial(4));

        System.out.println("IterativeFactorial(4): " + iterativeFactorial(4));

        // Variable length arguments
        System.out.println(sums(1, 2, 3, 4, 5));
        System.out.println(sums(2));

    }

    private static int sums(int i1, int i2) {
        return i1 + i2;
    }

    private static int sums(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    private static int sums(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    // private static void demoVarargsIncorrect(int... i, String s) {

    // }
    private static void demoVarargs(String s, int... i) {

    }

    private static void callTheSameMethod() {
        callTheSameMethod();
    }

    private static int calculateFactorial(int i) {
        if (i != 0) {
            return i * calculateFactorial(i - 1);
        } else {
            return 1;
        }
    }

    private static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static void changeIntValue(int i) {
        i += 100;
    }

    private static int changeInt(int i) {
        i += 100;
        return i;
    }

    private static void changeArray(int[] array) {
        array[1] = 200;
    }

    private static void clearArray(int[] array) {
        array = null;
    }

    private static int sum(int i1, int i2) {
        int result = i1 + i2;
        return result;
    }

    private static double sum(double d1, double d2) {
        return d1 + d2;
    }

    private static void printToConsole(String text) {
        System.out.println(text);
    }

    private static void printToConsole(int i) {
        System.out.println(i);
    }

    private static void printToConsole(double d) {
        System.out.println(d);
    }
}
