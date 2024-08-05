import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase LeftShift Operator\n");
        System.out.print("Please enter your number ");
        int num = input.nextInt();

        // The left shift operator, <<, shifts all of the bits in a value to the left a
        // specified number of times.
        int result = num << 4;
        System.out.println("Your result is: " + result);
    }
}
