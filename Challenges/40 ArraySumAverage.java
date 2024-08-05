import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to Array sum and Average");
        // int[] numArray = ArraysUtility.inputArray(input);
        System.out.println("Welcome to Array sum and Average");
        int[][] num2DArray = ArraysUtility.input2DArray(input);
        long sum = sum(num2DArray);
        double avg = average(num2DArray);
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static long sum(int[][] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArray) {
        double sum = sum(numArray); // if arr = 1,2,3,4,5,6,7,8,9, then sum=45
        return (sum / numArray.length);// 45 / 9 = 5.0
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray); // if arr = 1,2,3,4,5,6,7,8,9, then sum=45
        return (sum / numArray.length);// 45 / 9 = 5.0
    }
}
