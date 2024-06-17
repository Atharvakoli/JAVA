import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {

        // Add Integers
        // System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        // calculating Triangle

        Scanner sc = new Scanner(System.in);

        System.out.println("This program will calculate area of triangle.");
        System.out.println("Enter A's value: ");
        double a = sc.nextDouble();

        System.out.println("Enter B's value: ");
        double b = sc.nextDouble();

        System.out.println("Enter C's value: ");
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;

        double areaOfTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(areaOfTriangle);

        // calculate circle circumference
        System.out.println("This program will calculate circle circumference.");

        double circleRadius = sc.nextDouble();

        double circleCircumference = 2 * Math.PI * circleRadius;

        System.out.println("Circle circumference is: " + circleCircumference);

        sc.close();
    }
}
