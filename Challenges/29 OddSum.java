import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        int sumEven = evenSum(num);

        System.out.println("OddSum till " + num + " is: " + sum);
        System.out.println("EvenSum till " + num + " is: " + sumEven);

    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    public static int evenSum(int num) {
        int sum = 0;
        int i = 0;
        while (i <= num) {
            sum += i;
            i += 2;
            i /= 10;
        }
        return sum;
    }
}
