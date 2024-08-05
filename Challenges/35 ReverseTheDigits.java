import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is " + reverse);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10; // Checks the no. digits
            System.out.println(digit);
            newNum = newNum * 10 + digit;// It appends this digit to newNum.
            System.out.println(newNum);
            num /= 10; // It removes the last digit from num.
            System.out.println(num);
        }
        return newNum;
    }
    /*
     * Let's go through an example where num is 1234.
     * 
     * Initial values: num = 1234, newNum = 0
     * First iteration:
     * digit = 1234 % 10 = 4
     * newNum = 0 * 10 + 4 = 4
     * num = 1234 / 10 = 123
     * Second iteration:
     * digit = 123 % 10 = 3
     * newNum = 4 * 10 + 3 = 43
     * num = 123 / 10 = 12
     * Third iteration:
     * digit = 12 % 10 = 2
     * newNum = 43 * 10 + 2 = 432
     * num = 12 / 10 = 1
     * Fourth iteration:
     * digit = 1 % 10 = 1
     * newNum = 432 * 10 + 1 = 4321
     * num = 1 / 10 = 0
     * Loop terminates as num is now 0.
     * The final value of newNum is 4321, which is the reversed number.
     */
}
