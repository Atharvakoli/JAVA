package patterns;

import java.util.Scanner;
// ctrl + k + s  for shortcut key to see

public class Patterns {
    public static void pattern_one(int num) {

        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_two(int num) {
        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < num - i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num; i >= 0; --i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_three(int num) {
        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= num - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 0; --i) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_four(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 2 * (num - i) - 2; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_five(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_six(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = num; i >= 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_seven(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_Eight(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_nine(int num) {
        for (int i = 1; i <= num; i++) {
            // num Loop
            for (int j = i; j < num; j++) {
                // Blank Space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                // Cols Loop
                System.out.print("* "); // Prints *
            }
            System.out.println("");
        }

        for (int i = num; i >= 1; i--) {
            // num Loop
            for (int j = i; j <= num; j++) {
                // Prints blank spaces
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                // Col Loop
                System.out.print("* ");
                // Prints *
            }
            System.out.println(""); // New Line1
        }

        // Next approach
        int x, j, blank = 1;

        blank = num - 1; // logic for black spaces
        // Upper star Pyramid
        for (j = 1; j <= num; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" "); // print blank space
            }
            blank--;
            for (x = 1; x <= 2 * j - 1; x++) {
                System.out.print("*"); // Print Star
            }
            System.out.println("");
        }

        // Lower star Pyramid
        blank = 1;

        for (j = 1; j <= num - 1; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" "); // Print Spaces
            }
            blank++;
            for (x = 1; x <= 2 * (num - j) - 1; x++) {
                System.out.print("*"); // Print Star
            }
            System.out.println(""); // Print new line
        }
    }

    public static void pattern_ten(int num) {
        // Upper Inverted Pyramid
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i - 1; k <= num - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // For lower Pyramid
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i - 1; k <= num - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_eleven(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" "); // Print blank space
            }
            System.out.println("*"); // Print Star and newline
        }
    }

    public static void pattern_twelve(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");// Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))// Logic for printing star
                    System.out.print("*");
                else {
                    System.out.print(" ");// if logic fails print space
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to print pattern ");
        int num = sc.nextInt();
        System.out.println("You entered number is " + num);
        // Patterns.pattern_one(num);
        // Patterns.pattern_two(num);
        // Patterns.pattern_three(num);
        // Patterns.pattern_four(num);
        // Patterns.pattern_five(num);
        // Patterns.pattern_six(num);
        // Patterns.pattern_seven(num);
        // Patterns.pattern_Eight(num);
        // Patterns.pattern_nine(num);
        // Patterns.pattern_ten(num);
        // Patterns.pattern_eleven(num);
        Patterns.pattern_twelve(num);

    }
}
