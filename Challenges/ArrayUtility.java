import java.util.Scanner;

class ArraysUtility {
    public static int[] inputArray(Scanner input) {
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray(Scanner input) {
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Please enter element row:" + (i + 1)
                        + ", column: " + (j + 1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void display2DArrays(int[][] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

public class ArrayUtility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = ArraysUtility.inputArray(input);
        int[][] twoDArr = ArraysUtility.input2DArray(input);

        ArraysUtility.displayArray(arr);
        ArraysUtility.display2DArrays(twoDArr);

    }
}