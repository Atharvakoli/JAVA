import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        long factRecursive = factRecursive(num);

        System.out.println("Factorial is: " + fact + " Fcatorial of recursive approach " + factRecursive);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static long factRecursive(int num) {
        if (num < 2) {
            return 1;
        }
        return num * factRecursive(num - 1);
    }
}
