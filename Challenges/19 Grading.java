import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator\n");
        System.out.print("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("Great, You have got A GRADE");
        } else if (percentage >= 75) {
            System.out.println("Good, You have got B GRADE");
        } else if (percentage >= 60) {
            System.out.println("You have got C GRADE, Work harder next time");
        } else if (percentage >= 30) {
            System.out.println("You have got D GRADE, You seriously need to work harder");
        } else {
            System.out.println("Sorry, You have failed the test and got a F GRADE");
        }
    }
}
