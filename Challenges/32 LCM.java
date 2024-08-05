import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        System.out.print("Please enter your number: ");
        int third = input.nextInt();
        System.out.print("Please enter your number: ");
        int four = input.nextInt();
        int lcm = lcm(first, second, third, four);
        System.out.println("LCM of the two numbers is: " + lcm);
    }

    public static int lcm(int first, int second, int third, int four) {
        int i = 1;
        while (true) {
            int factor = first * i;// remove factors
            if (factor % second == 0 && factor % third == 0 && factor % four == 0) {
                return factor;
            }
            i++;
        }
    }
}
