import java.util.Scanner;

public class Iteration_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an Integer: ");
        // String userInput = sc.next();

        // for (char digit : userInput.toCharArray()) {
        // System.out.println(digit);
        // }

        System.out.print("Enter the Height of pyramid :) ");
        int heightOfPyramid = sc.nextInt();

        // i + j == n - 1
        // i + j = (n - 1) / 2
        // i == j
        // i + j == (n - 1) / 2
        // i - j == (n - 1) / 2
        // i + j = (n - 1) + (n - 1) / 2

        for (int i = 1; i < heightOfPyramid + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = heightOfPyramid - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print matrix

        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7 },
                { 8, 9, 10 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
