import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ProblemsOnMethod {
    public static final int MULTIPLIER = 2;
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Finding Max element into the array.");
        // System.out.print("Enter intergers with seperated by space: ");
        // String nums = sc.nextLine();
        // 1 2 3 4 5 6
        // 123456

        // int[] array = Arrays.stream(nums.trim().split("\\s+"))
        // .mapToInt(Integer::parseInt /* s -> Integer.valueOf(s) */)
        // .toArray();
        // // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int maxValueIntoArray = findMaxIntInArray(array);
        // System.out.println(maxValueIntoArray);

        // Draw empty rectangle
        // System.out.print("Enter height of reactangle: ");
        // int height = sc.nextInt();
        // System.out.print("Enter width of reactangle: ");

        // int width = sc.nextInt();
        // // h - 3, w - 6
        // drawRectangle(height, width);

        // Caluclate Amount of words
        // System.out.print("Enter any text you want: ");
        // String userText = sc.nextLine();
        // userText = "atharva"
        // int numberOfText = amountOfText(userText);
        // System.out.println(numberOfText);

        // Filter String array
        // System.out.print("Enter any text you want: ");
        // String userText = sc.nextLine();
        // System.out.print("Enter you length to filter words based on that: ");
        // int minLength = sc.nextInt();

        // String[] words = userText.split("\\s+");
        // String[] filteredWords = filterWordsByLength(minLength, words);
        // System.out.println(Arrays.toString(filteredWords));

        // Rotate Matrix
        // System.out.println("Please, enter matrix size: ");
        // int size = sc.nextInt();

        // double[][] matrix = generateMatrix(size);

        // System.out.println("How you want to rotate matrix: " + System.lineSeparator()
        // + "\t1 - 90 "
        // + System.lineSeparator() + "\t2 - 180 " + System.lineSeparator() + "\t3 -
        // 270");
        // int mode = sc.nextInt();

        // System.out.println(System.lineSeparator() + "Base matrix:" +
        // System.lineSeparator());
        // printMatrixToConsole(matrix);
        // System.out.println();

        // if (rotateMatrix(matrix, mode)) {
        // printMatrixToConsole(matrix);
        // }

        // Extend array
        // System.out.println("Please, enter length of initial array: ");
        // int baseArrayLength = sc.nextInt();
        // int[] arr = generateRandomArray(baseArrayLength);
        // int[] extendedArray = extendArray(arr);
        // System.out.println("*** Initial array ***");
        // System.out.println(Arrays.toString(arr));
        // System.out.println("*** Extended array ***");
        // System.out.println(Arrays.toString(extendedArray));

        // GREATEST COMMON DIVISOR
        // System.out.print("Please, enter two numbers separated by space: ");
        // String userInput = sc.nextLine();

        // String[] inputArgumentsArray = userInput.split("\\s+");

        // int number1 = Integer.parseInt(inputArgumentsArray[0]);
        // int number2 = Integer.parseInt(inputArgumentsArray[1]);

        // System.out.println(gcdRecursive(number1, number2));
        // System.out.println(lcm(number1, number2));

        // Sum all digits in number
        // System.out.print("Please, enter integer: ");
        // int number = sc.nextInt();// 28

        // int sumOfDigits = sumDigitsInNumber(number);
        // System.out.println(sumOfDigits);

        // String Processor
        // System.out.println("Convert 1 demo ");
        // System.out.println(convert1(INPUT_DATA));

        // System.out.println("===== Convert 2 demo =====");
        // System.out.println(convert2(INPUT_DATA));

        // Turn each first letter in a word to capital
        // System.out.print("Please, enter any text: ");
        // String userInput = sc.nextLine();

        // System.out.println(firstCharToTitleCase(userInput));

        // int a = 10;
        // int b = ++a + a++ + --a;

        // System.out.println(b);

        // Convert decimal to Roman numbers and vice versa
        mainLoop: while (true) {
            System.out.print("Please, select mode. If you want to convert Roman "
                    + "numbers to decimal - type 'R2D' and press enter."
                    + System.lineSeparator()
                    + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

            String mode = sc.next();
            if (mode.equalsIgnoreCase("R2D")) {
                while (true) {
                    System.out.print("Please, enter Roman number you want to convert: ");
                    String romanNumber = sc.next();
                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered invalid Roman number. "
                                + "Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number "
                            + "you want to convert: ");
                    int decimalNumber = sc.nextInt();
                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter positive integer from 1 to 100.");
                        continue;
                    }

                }

            }

            System.out.println("Please, enter 'R2D' or 'D2R.");
        }

        sc.close();
    }

    public static int roman2Decimal(String romanNumber) {
        String romanNumeral = romanNumber.toUpperCase();

        int decimal = 0;
        int lastNumber = 0;

        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;

            }

        }
        return decimal;

    }

    private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public static boolean isRomanNumberValid(String romanNumber) {
        return romanNumber
                .matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
    }

    public static boolean isDecimalNumberValid(int decimalNumber) {
        return decimalNumber > 0 && decimalNumber <= 100;
    }

    public static String decimal2Roman(int number) {
        String[] a = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C" };
        int[] b = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100 };
        StringBuilder s = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i++) {
            while (number >= b[i]) {
                s.append(a[i]);
                number -= b[i];
            }
        }
        return s.toString();
    }

    public static String firstCharToTitleCase(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static String convert1(String input) {
        String result = "";
        String[] lines = input.split(System.lineSeparator());
        for (int i = 1; i < lines.length; i++) {
            String[] wordsInLine = lines[i].split(";");
            result += wordsInLine[0] + " ==> " + wordsInLine[2] + System.lineSeparator();
        }
        return result;
    }

    public static String convert2(String input) {
        String result = new String();
        String[] lines = input.split(System.lineSeparator());
        for (int i = 1; i < lines.length; i++) {
            String[] wordsInLine = lines[i].split(";");
            result += wordsInLine[1] + " (email: " + wordsInLine[2] + ")" + System.lineSeparator();
        }
        return result;
    }

    public static int sumDigitsInNumber(int number) {
        // number = 298
        int result = 0;
        while (number != 0) {
            result += number % 10;// gives the last digit of the number
            number /= 10;// removes last digit from number
        }
        // ensures that the result is non-negative. Since we're dealing with the sum of
        // digits, the result should naturally be non-negative, but this is an extra
        // precaution.
        return Math.abs(result);
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {
        // if (secondNumber == 0) {
        // If the argument is not negative, the argument is returned. If the argument is
        // negative, the negation of the argument is returned.
        // return firstNumber;
        // return Math.abs(firstNumber);
        // }
        // System.out.println(firstNumber + " " + secondNumber + " " + firstNumber %
        // secondNumber);
        // return gcdRecursive(secondNumber, firstNumber % secondNumber);

        // if (firstNumber == 0) {
        // return secondNumber;
        // } else if (secondNumber == 0) {
        // return firstNumber;
        // }
        // while (firstNumber != secondNumber) {
        // if (firstNumber > secondNumber) {
        // firstNumber = firstNumber - secondNumber;
        // } else {
        // secondNumber = secondNumber - firstNumber;
        // }
        // }
        // return firstNumber;
        int temp = 0;
        while (secondNumber != 0) {
            temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return temp;
        // Quotient * Divisor + Remaider = Dividend
        // a / b = x
        // round * upwards = y;
        // b - ((y * b) - a) = remainder
        /*
         * 1st -> 34 21 => 13
         * 2st -> 21 13 => 8
         * 3st -> 13 8 => 5
         * 
         * Calculate a mod b which, for positive numbers, is the remainder of a divided
         * by b in a division problem. The modulo operation finds the remainder, so if
         * you were dividing a by b and there was a remainder of n, you would say a mod
         * b = n.
         * 
         * How to Do a Modulo Calculation
         * The modulo operation finds the remainder of a divided by b. To do this by
         * hand just divide two numbers and note the remainder. If you needed to find 27
         * mod 6, divide 27 by 6.
         * 
         * 27 mod 6 = ?
         * 27 ÷ 6 = 4 with a remainder of 3
         * 27 mod 6 = 3
         * Example Modulo Calculation
         * You need to write a piece of software that tells a user whether a number they
         * input is a multiple of 4. You can use the modulo calculation to accomplish
         * this.
         * 
         * If a number is a multiple of 4, when you divide it by 4 the remainder will be
         * 0. So you would create the logic to take an input and use the mod 4 operation
         * on it. If the result is 0 the number is a multiple of 4 otherwise the number
         * is not a multiple of 4.
         * 
         * The logic for this part of your program would be:
         * 
         * x is the number input by the user
         * If x mod 4 = 0 then x is a multiple of 4
         * Else x is not a multiple of 4
         * 
         * If you did not use the mod operator you would have to do the math in your
         * code. For example you would have to calculate "is 496 a multiple of 4?". You
         * would divide 496 by 4, so 496 / 4 = 124 with no remainder. In terms of mod,
         * 496 mod 4 = 0, so yes, 496 is a multiple of 4.
         * 
         * Is 226 a multiple of 4? Divide 226 by 4, so 226 / 4 = 56 with a remainder of
         * 2. 226 mod 4 = 2, so no, 226 is not a multiple of 4.
         * 
         * In some calculators and computer programming languages a % b is the same as a
         * mod b is the same as a modulo b where % or mod are used as the modulo
         * operators.
         */
    }

    public static int lcm(int firstNumber, int secondNumber) {
        int i = 1;
        while (true) {
            int factor = firstNumber * i;
            if (factor % secondNumber == 0) {
                return factor;
            }
            i++;
        }
    }

    private static int[] generateRandomArray(int length) {
        int[] arr = new int[length];
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        return arr;
    }

    public static int[] extendArray(int[] arr) {
        int newArrayLength = arr.length * 2;// 10
        int[] resultArray = Arrays.copyOf(arr, newArrayLength);// 34 38 73 88 64 0 0 0 0 0
        // creates a new array resultArray that is a copy of arr, but with a length of
        // newArrayLength.

        System.out.println(Arrays.toString(resultArray));

        // 5 // 5 - 5 = 0
        for (int i = arr.length; i < newArrayLength; i++) {
            resultArray[i] = arr[i - arr.length] * MULTIPLIER;
            // resultArray[5] = arr[0] * 2 = 34 * 2 = 68
        }
        return resultArray;
    }

    private static void verticalReflection(double[][] matrix) {
        double temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    private static void horizontalReflection(double[][] matrix) {
        double temp;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = temp;
            }
        }
    }

    private static void transposeMatrix(double[][] matrix) {
        double temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotate90(double[][] matrix) {
        transposeMatrix(matrix);
        verticalReflection(matrix);
    }

    public static void rotate180(double[][] matrix) {
        verticalReflection(matrix);
        horizontalReflection(matrix);
    }

    public static void rotate270(double[][] matrix) {
        transposeMatrix(matrix);
        horizontalReflection(matrix);
    }

    private static boolean rotateMatrix(double[][] matrix, int mode) {
        switch (mode) {
            case 1:
                System.out.println("90 degrees rotated: " + System.lineSeparator());
                rotate90(matrix);
                break;
            case 2:
                System.out.println("180 degrees rotated: " + System.lineSeparator());
                rotate180(matrix);
                break;
            case 3:
                System.out.println("270 degrees rotated: " + System.lineSeparator());
                rotate270(matrix);
                break;
            default:
                System.out.println("You seleceted non-exiting mode!");
                return false;
        }
        return true;
    }

    private static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Double.valueOf(Integer.toString(i) + "." + Integer.toString(j));
            }
        }
        return matrix;
    }

    private static String[] filterNulls(String[] arr) {
        int newArraySize = 0;
        for (String word : arr) {
            if (word != null) {
                newArraySize++;
            }
        }

        String[] filteredArray = new String[newArraySize];

        int filteredArrayIndex = 0;
        for (String word : arr) {
            if (word != null) {
                filteredArray[filteredArrayIndex++] = word;
            }
        }
        return filteredArray;
    }

    public static String[] filterWordsByLength(int minLength, String[] words) {
        String[] arrOfWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= minLength) {
                arrOfWords[i] = words[i];
            }
        }
        arrOfWords = filterNulls(arrOfWords);
        return arrOfWords;
    }
    // ===================== SOLUTION WITH STREAM API

    public static String[] filterWordsByLengthStreamApi(int minLength, String[] words) {
        return Arrays.stream(words)
                .filter(s -> s.length() >= minLength)
                .toArray(String[]::new);
    }

    public static int amountOfText(String text) {
        return text.split("[\\p{P}\\s]+").length;
    }

    public static void drawRectangle(int height, int width) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int findMaxIntInArray(int[] intArray) {
        int max = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
        // return Arrays.stream(intArray).max().getAsInt();
    }

}
