import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Series");
        // printFibonacci(num);
        int Fibonacci = fib(num);
        System.out.println(Fibonacci);
    }

    public static void printFibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0 ");
        if (num == 0)
            return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        System.out.println();
    }
    /*
     * Applications of Fibonacci Series
     * The Fibonacci series finds application in different fields in our day-to-day
     * lives. The different patterns found in a varied number of fields from nature,
     * to music, and to the human body follow the Fibonacci series. Some of the
     * applications of the series are given as,
     * 
     * It is used in the grouping of numbers and used to study different other
     * special mathematical sequences.
     * It finds application in Coding (computer algorithms, distributed systems,
     * etc). For example, Fibonacci series are important in the computational
     * run-time analysis of Euclid's algorithm, used for determining the GCF of two
     * integers.
     * It is applied in numerous fields of science like quantum mechanics,
     * cryptography, etc.
     * In finance market trading, Fibonacci retracement levels are widely used in
     * technical analysis.
     */

    public static int fib(int num) {
        // terminating condition
        if (num <= 1)
            return num;
        return fib(num - 1) + fib(num - 2);
    }
}
