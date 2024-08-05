import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator\n");
        System.out.print("Please enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " + result);
        /*
         * The Bitwise NOTAlso called the bitwise complement, the unary NOT operator, ~,
         * inverts all of the bits of its operand. For example, the number 42, which has
         * the following bit pattern:
         * 00101010 -> becomes -> 11010101 after the NOT operator is applied.
         */
    }
}
