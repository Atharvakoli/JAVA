import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase RightShift Operator\n");
        System.out.print("Please enter your number ");
        int num = input.nextInt();
        // The right shift operator, >>, shifts all of the bits in a value to the right
        // a specified number of times.
        int result = num >> 1;
        System.out.println("Your result is: " + result);

        // As you have just seen, the >> operator automatically fills the high-order bit
        // with its previous contents each time a shift occurs. This preserves the sign
        // of the value. However, sometimes this is undesirable. For example, if you are
        // shifting something that does not represent a numeric value, you may not want
        // sign extension to take place. This situation is common when you are working
        // with pixel-based values and graphics. In these cases, you will generally want
        // to shift a zero into the high-order bit no matter what its initial value was.
        // This is known as an unsigned shift.
    }
}
