import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Unary Arithmetic Operator
        // +, -, ++, --

        System.out.println("====== Unary Arithmetic Operatorsm =====");

        int i = 0;
        int i2 = -10;
        int i3 = ++i;
        int i4 = i++;
        int i5 = --i;
        int i6 = i--;

        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i = " + i6);

        System.out.println();

        // Binary Arithmetic operators
        // + - / % *
        int i7 = 10 + 1;
        int i8 = i7 - 1;
        int i9 = i8 / 2;
        int i10 = i9 % 2;
        int i11 = 5 % 3;
        int i12 = i10 * 3;

        System.out.println("i7 = " + i7);
        System.out.println("i8 = " + i8);
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);
        System.out.println("i11 = " + i11);
        System.out.println("i12 = " + i12);
        System.out.println("Hello " + "World" + "!");

        System.out.println();

        // Assignment Operators
        // =, +=, -=, *=, /=, %=

        System.out.println("====== Assignement Operators =====");

        int i13 = 10;
        i13 += 2;
        System.out.println(i13);

        System.out.println();

        // Relational Operator
        // ==, !=, >, <, >=, <=

        int i14 = 10;
        int i15 = 20;

        System.out.println(i14 == i15);
        System.out.println(i14 != i15);
        System.out.println(i14 > i15);
        System.out.println(i14 < i15);
        System.out.println(i14 >= i15);
        System.out.println(i14 <= i15);

        System.out.println();

        // Logical Operators

        // &, && -> shortcircut And, |, || -> shortcircut OR, ! -> Logical unary not, ^
        // -> Logical XOR
        // Works on boolen oprands

        // System.out.println(false & (5 / 0 == 0)); // Runtime Exception
        // System.out.println(false && (5 / 0 == 0)); // false
        // System.out.println(true | (5 / 0 == 0)); // Runtime Exception
        // System.out.println(true || (5 / 0 == 0));// true
        System.out.println("!true " + !true); // false
        System.out.println(true ^ true); // false // It returns false if both conditions are true
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true

        System.out.println();

        // Bitwise Operator
        // & -> bitnary And Operator -> Copies a bit to the result it exist in both
        // oprands, | -> binar OR operator -> copies a bit if it exists operand binary,
        // ^ -> binary XOR operator copies a bit if it's set in one operand but not bith
        // binary ones , ~ -> complement operator is unary and has the effect of
        // flipping bits, >> -> Binary right shift operator -> the left operands value
        // is moved right by the number of bits specified by the right operand, >>>
        // ->shifter zero feel operator -> The left operand value is moved right by the
        // number of bits specified by the operand and shifted values are filled up with
        // zeros, << -> Binary left shift operator -> The left operands value is moved
        // left by the number of bits specified by the right operand

        System.out.println("4 & 5 = " + (4 & 5));

        /*
         * 1 -> true, 0 -> false
         * true + false = false
         * 1 0 0 ---> 4
         * & & &
         * 1 0 1 ---> 5
         * - - -
         * 1 0 0 --> 4
         */

        System.out.println("4 | 5 = " + (4 | 5));

        /*
         * false + false = true
         * true + false = true
         * 1 0 0 ---> 4
         * | | |
         * 1 0 1 ---> 5
         * - - -
         * 1 0 1 --> 5
         */

        System.out.println("4 ^ 5 = " + (4 ^ 5));

        /*
         * true + true = false
         * true + false = true
         * 1 0 0 ---> 4
         * ^ ^ ^
         * 1 0 1 ---> 5
         * - - -
         * 0 0 1 --> 1
         */

        System.out.println("~1 = " + ~1); // 00000001
        System.out.println(Integer.toBinaryString(1)); // 11111110
        System.out.println(Integer.toBinaryString(-2)); // -2
        System.out.println((byte) 0b11111110); // -128 = -(2 ^ 7)
        System.out.println((byte) 0b10000000); // -64 = -(2 ^ 7) + (2 ^ 6)

        System.out.println("5 = " + 0b101);
        System.out.println("5 >> 1 = " + (0b101 >> 1));
        System.out.println("5 in binary format = " + Integer.toBinaryString((5)));
        System.out.println("2 in binary format = " + Integer.toBinaryString((2)));

        System.out.println("5 = " + 0b101);
        System.out.println("5 >>> 1 = " + (0b101 >>> 1));

        int negativeByteValue = 0b111111111111111111111110000000;
        System.out.println("-128 = " + negativeByteValue);
        System.out.println("-128 >>> 1 = " + (negativeByteValue >>> 1));
        System.out.println("-128 = " + (negativeByteValue >> 1));

        System.out.println("5 = " + 0b101);
        System.out.println("5 << 1 = " + (0b101 << 1));
        System.out.println("5 in binary format = " + Integer.toBinaryString((5)));
        System.out.println("10 in binary format = " + Integer.toBinaryString(10));

        System.out.println("10 * 2 = 10 << 1 = " + (10 << 1)); // x << y = x * (2 ^ y)
        System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1)); // x >> y = x / (2 ^ y)

        System.out.println();

        // Ternary operator

        // (condition) ? true expression : false expresssion

        System.out.println(2 > 1 ? "2 is greater then one" : "2 is not less then one");
        System.out.println(2 < 1 ? "2 is greater then one" : "2 is not less then one");

        System.out.println();

        // Operators Precedence

        // ()
        // []
        //

        // ++
        // --

        // Learn operator precedence from this table (from highest to lowest)

        // Operators with integers and floating-point numbers, BigDecimal type

        int j = 20;
        System.out.println(j / 3); // 6
        System.out.println(j / (6 * 3)); // 2
        System.out.println((double) j / 3); // 6.666666666667

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP).setScale(2);
        System.out.println(chargePerPerson); // 6.67

        double d = 3.1;
        double d2 = 1.21;

        System.out.println(d - d2);

        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3.subtract(bd4));

        // Math class, NaN, Infinity

        System.out.println(Math.PI);
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(2.4, 3.4));
        System.out.println(Math.random() * 10);

        int absoluteValue = Math.abs(-5);
        System.out.println(absoluteValue);

        System.out.println(Math.sqrt(-1));
        System.out.println(0 / 0.0);
        System.out.println((0 / 0.0) + 5);

        // System.out.println(5 / 0.0);
        // System.out.println(-5 / 0.0);

        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100));
        System.out.println((int) (Math.random() * 100) + 100);

        // Type of the expression in java
        // Expression -> An expression is a constuct made up of verbose operators and
        // methods and locations
        // statements -> are roughly equivalent to sentences in natural languages. A
        // statement forms a compelete unit of execution.

        byte b = 1;
        short s = 1;
        int o = 1;
        long l = 1;

        float f = 1.0F;
        double v = 1.0;

        char c = 1;

        int intExpressionType = b + b;
        int intExpressionType2 = s * s;
        int intExpressionType3 = b + o + c;

        long longExpressionType = i + l;
        float floatExpressionType = l + f;
        double doubleExpressionType = f + d;

        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

        System.out.println("Hello " + 1);
        System.out.println("hello " + null);

        // Compare Primitive and Reference Type & Java Memory Model

        int int1 = 128;
        int int2 = 128;

        System.out.println("int1 == int2 " + (int1 == int2));
        System.out.println("1 == 2 " + (1 == 2));
        System.out.println("65 == 'A' " + (65 == 'A'));

        Integer p1 = 127;
        Integer p2 = 127;

        System.out.println("p1 == p2: " + (i == 12));

        // Interger p3 = new Integer(127);
        // Interger p4 = new Integer(127);
        // System.out.println("p3 == p4" + (p3 == p4));

        Integer p5 = Integer.valueOf(127);
        Integer p6 = Integer.valueOf(127);
        System.out.println("p5 == p6" + (p5 == p6));

        System.out.println("i.equals(p1): " + p1.equals(p2));

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };

        System.out.println("arr1 == arr2: " + (arr1 == arr2));
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2));
        // System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1,
        // arr2));

        arr1 = arr2;
        System.out.println(arr1 == arr2);

        // Comparing values 128 == 128
        // Comparing variables which has reference type i1 == i2 it will no equal to
        // same or false condition

        // JAVA MEMORY MODEL

        /*
         * STACK
         * ()main
         * int -> 128, int 128
         * integer -> reference
         * int[] arr1
         * int[] arr2
         * integer reference
         */

        /*
         * Heap
         * Java uses Heap space for dynamic method allocation for java objects and
         * classes and the runtime.
         * Eveyr time we are creating new object, it's created in Heap
         * space,[" but reference to this object is stored in stack memory"]
         * Integer Object - 128
         * Array Object {1,2,3}
         * Array Object {1,2,3}
         * integer Object - 128
         */

        // Read Use Input from Console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter any word: ");
        String word = sc.next();
        System.out.println("You eneterd this word: " + word);
        System.out.println("Please, enter any integer number: ");
        int in = sc.nextInt();
        System.out.println("You eneterd this integer number: " + in);

        sc.close();

    }
}