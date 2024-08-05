
public class Arrays {
    public static void main(String[] args) {
        /*
         * Array - is an object which contains elements of similar data types and
         * suppport access to them by index
         * Index of the element in array is 0
         * No dynamic size
         * 40 55 63 17 22 68 89 97 89
         * 0 1 2 3 4 5 6 7 8
         * Array Length = 9
         * First Index = 0
         * last Index = 8
         * 
         */

        int[] arr;
        int arr2[];

        arr = new int[10];
        // System.out.println(arr[0]);

        double[] arr3 = new double[10];
        // System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        // System.out.println(arr4[0]);

        // System.out.println(arr4[10]);

        int[] arr5 = { 3, 2, 1 };

        int[][] matrix = {
                { 3, 2, 1 },
                { 6, 5, 4 },
                { 9, 8, 7 }
        };

        System.out.println(matrix[0][2]);

        int[][] matrix2 = new int[10][];
        System.out.println(matrix2[0]);

        // Array are reference type not the primitive type

        // System.out.println(Arrays.toString(arr5));
        // Arrays.sort(arr5);
        // System.out.println(Arrays.toString(arr5));

        // Investigate source code of java.util.Arrays class. Learn what methods does it
        // have and read java documentation.
        // [OPTIONAL] Read the chapter #3 of Java: The Complete Reference - Herbert
        // Schildt
        // Read about arrays

        // double nums[] = {10.1, 11.2, 12.3, 13.4,14.5,15.6};

        // double result = 0;

        // int i;

        // for(i = 0;i < nums.length;i++) {
        // result += nums[i];
        // }
        // System.out.println("Result " + result + "Average " + result / 6);

        // int twoD[][] = new int[4][5];

        // int i, j, k=0;

        // for (i = 0; i < 4; i++) {
        // for(j = 0;j < 5;j++) {
        // twoD[i][j] = k;
        // k++;
        // }
        // }
        // System.out.println(k);

        // for(i = 0;i < 4;i++) {
        // for(j = 0;j < 5;j++) {
        // System.out.print(twoD[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int twoD[][] = new int[4][];

        // twoD[0] = new int[1];
        // twoD[1] = new int[2];
        // twoD[2] = new int[3];
        // twoD[3] = new int[4];

        // int i, j, k = 0;

        // for(i = 0; i < 4; i++) {
        // for(j = 0;j < i+1; j++) {
        // twoD[i][j] = k;
        // k++;
        // }
        // }

        // for(i = 0;i < 4;i++) {
        // for(j = 0;j < i+1;j++) {
        // System.out.print(twoD[i][j] + " ");
        // }
        // System.out.println();
        // }

        double m[][] = {
                { 0 * 0, 1 * 0, 2 * 0, 3 * 0 },
                { 0 * 0, 1 * 0, 2 * 0, 3 * 0 }
        };
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
