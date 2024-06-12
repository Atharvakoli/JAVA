
public class DataTypes_Variables_Arrays {
    public static void main(String[] args) {
        // Thoery
        /*
         * Java is "Strongly Typed Language"
         * Every variable has a type
         * Every exapression has a type
         * Every type is strictly defined
         * All assignment are checked for type compatiblity
         * 
         * Simple Types
         * type -> integers, Floating point nos, Characters, Boolean
         * Subtype -> byte, short,int, long, float and double, char boolean
         * 
         * Integers
         * Name -> Long width -> 64 Range -> -9,223,372,036,854,775,808 to
         * +9,223,372,036,854,775,807
         * int -> 64 -> -2,147,483,648 to + 2,147,483,647
         * Short -> 16 -> -32,768, to +32,767
         * Byte -> 8 -> -128 to +127
         * 
         * Byte
         * Range is -128 to + 127
         * Useful when working with stream of data from network to file.
         * When working eith raw binary data that may not be compatible with java's
         * other built in types
         * Example: byte b, c
         * 
         * Short
         * Signed 16-bit type
         * Range is from -32,768 to + 32,767
         * Least used data type, because it is defined as having its high byte first'=
         * Mostly applicable to 16 bit computers
         * Example
         * Short s;
         * Short t;
         * 
         * Int
         * Signed 32 bit type
         * Range from -2,147,483,648 to +2,147,483,647
         * Used for control loops and index arrays
         * Any integer expression containing byte, short, int and literal numbers are
         * promoted to int before calculation
         * Used in inter math,
         * Type determines behaviour, not size
         * Exception is array -> byte is guaranteed to use only byte per array element
         * short will use two bytes int will use four
         * 
         * Long
         * 64 bit type
         * Used when integer is not large enough to hold the desired value
         * Large range of long is usefull when big, whole numbers are needed
         * 
         * Floating point types
         * 1. float
         * Single precision value that uses 32-bit of storage
         * Faster on some processors and takes less space than double precison
         * But not precision for very large or very small values
         * Used when you need fractional component but high degree of precision is not
         * required
         * Example dollars and cents
         * float hightemp, lowtemp
         * 
         * 2. Double
         * Uses 64 nits to store the value
         * Double precision is faster for some modern processors that have been modified
         * for high speed mathematical calculations
         * All transcendental math functions such a sin(),
         * cos(), and sqrt() return double value
         * If you want to maintain accuracy over many iterative calculations Or are
         * manipulating large values numbers
         * Double is the best choice
         * 
         * Characters
         * In c/c++ char is interger type that is 8 bits wide, which is NOT the cae in
         * Java
         * Java uses Unicode to represent chars
         * Unicode defines all international characters set that can represent all of
         * the characters found in all human languages
         * For this purpose it requires 16 bits
         * Range of char is 0 to 65,536
         * There are NO negative chars
         * Standard set of chars(ASCll) range is 0 to 127
         * Extended 8 bit char set ISO-Latin-1 ranges from 0-255
         * For creating applets, and applets are used worldwide, it should use Unicode
         * to represent char
         * English, German, Spanish and french characters can easily be contained in 8
         * bits But for world wide use, Java should pay this price
         * 
         * Booleans
         * Simple type for logical values
         * Can have only two values true and false
         * Type returned by all relational operators
         * Type required for control statements if and for
         * 
         * Literals
         * 1. Interger Literals
         * Any whole number value is integer literal
         * Normally decimal (base 10) values. All other are Octal(base 8) and
         * hexadecimal(base 16)
         * Octal (base 8) values are denoted by leading 0.
         * So 09 will throw an error becouse Octal range is 0 to 7
         * Hexadecimal only matches with modulo 8 word sizes like 8, 16,32 and 64bits
         * Interger literal creates int value which in java is 32 bit integer
         * When literal value is assigned to byte or short variable, no error is
         * generated if literal value is within the range
         * For long, you have to explicitly tell the compiler that literal value is long
         * For this append uppercase L or lowercase l at the end
         * 
         * 2. Floating point literals
         * Decimal values with fractional component
         * Can be expressed in standard or scientific notation
         * Standard notation = wholenumber.fractional component e.g 2.0
         * Scientific notation = standard notation, floating point number plus a suffix
         * by which The number is to be multiplied. E.g 6.022E23
         * By default double. To specify float, must append f or F
         * Explicitly specify double by appending d or D
         * Default double type consumes 64 bits of storage where less accurate float
         * type Requires only 32 bits
         * 
         * 3. Boolean literals
         * Only two values true or false
         * true or false do not convert into numerical representation
         * true is not equal to 1 not equal to 0
         * true or false can only be assigned to variables declared as boolean or used
         * in expressions with boolean operators
         * 
         * Character literals
         * Unicode character set
         * 16 bit values that can be converted into intergers and manipulated with the
         * integer operators (addition and subtraction operators)
         * Visible ascii charcters are entered inside single quotes
         * There is also a mechanism for directly entering the value of a character in
         * octal or hexadecimal
         * For Octal notation use backslash followed by the three digit number
         * For e.g.\141 is the letter a
         * For hexadecimal you enter a backslash-u (\"u") then exactly 4 hexadecimal
         * digits
         * For example '\u0061' is the ISO-Latin-1 'a' because the top byte is zero
         * 
         * Character escape sequence
         * 
         * Escape Sequence
         * \ddd -> Octal Character (ddd)
         * "\"uxxxx -> Hexa decimal UNICODE CHARACTER(xxxx)
         * \` -> single quote
         * \"" -> Double quote
         * \\ -> Backslash
         * \r -> Carriage return
         * \n -> New line (also known as line feed)
         * \f -> Form feed
         * \t -> Tab
         * \b -> Backspace
         * 
         * String Literals
         * Specified by enclosing sequence of characters between pair of double quotes
         * "Hello world"
         * "Two \n lines"
         * "\" This is in quotes\""
         * Important: They must begin and end on the same line.
         * There is no line continuation escape sequence as there as in other language
         * C/C++: Strings are implemented as arrays of characters.
         * But this is "Not" the case in Java
         * Strings are actually object types
         * Java has extensuve String handling capabilities
         * 
         * Variables
         * Variable is basic unit of storage in java
         * Defined by combination of an identifier, a type and an optional intializer
         * All variables have a scope, which defines their visiblity and lifetime
         * 
         * Declaring a variable
         * In Java, all variables must be declared before they can be used
         * Type Identifier [=value][,identifier[=value]...];
         * The type is one of java's automatic types, or the name of class or interface
         * identifier is the name of variable
         * Initialize the variable by specifying an equal sign and a value
         * The initialization expression must result in a value of the same (or
         * compatible) Type as specified by variable
         * To declare more than one variable of the specified type, use a
         * comma-separated list
         * e.g
         * int a,b,c; // declares three int a, b and c
         * int d= 3,e,f=5 // declares three more ints initializing d and f
         * Byte z = 22; // initializes z
         * double pi = 3.14159 declares an approximation
         * Char x = "X"
         * 
         * Dynamic Initialization
         * Java allows variables to be initialized dynamically, using any expression
         * valid at the time the variable is declared
         * e.g Computing the hypotrnuse of right angle triangle given the lengths of its
         * two opposite sides
         * 
         * // demonstrate dynamic initialization
         * class DynInit {
         * public static void main(String args[]) {
         * double a = 3.0, b = 4.0
         * double c = Math.sqrt(a * a + b * b); // c is dynamically initialized
         * System.out.println("Hypotenuse is " + c);
         * }
         * }
         * 
         * Scope and lifetime of variables
         * Java allows variables to be declared within any block
         * { // Opening curly brace
         * }//Closing curly brace
         * is a block
         * Block defines a scope
         * 
         * If this method has parameter they too are included within the methods scope
         * 
         * As a general rule variables declared inside scope are not visible (that is
         * accessible)
         * Scopes can be nested. For example each time you create a block of code, you
         * are creating a new, nested scope. When this occurs the outer scope encloses
         * Inner scope
         * This means that objects declared in outer scope will be visible to code
         * within inner scope.
         * However, the reverse is not true.
         * 
         * Variables - some important points
         * Within a block, variables can be declared at any point, but they are valid
         * only after they are declared
         * Also, if you declare a variable at end of block, it is effectively useless
         * because no code Have access ti it
         * 
         * // This fragment is wrong!
         * count 100;
         * int count;
         * Variables are created when their scope is entered and destroyed when their
         * scope is left -- meaning variable will not hold its value once it has gone
         * out of scope
         * Therefore, variables declared within a block will not hold their values
         * between calls to that method
         * If variable declaration includes an initializer, then that variable will be
         * reinitialized Each time the block in which it is declared is entered
         * 
         * Java's automatic conversions
         * When one type of data is assigned to another type of variable an automatic
         * typ conversion will take place if the following two conditions are met:
         * The two types are compatible
         * The destination type is larger than source type
         * // Demonstrate Lifetime of variable
         * class LifeTime {
         * public static void main(String args[]) {
         * int x;
         * for(x = 0;x < 3;x++) {
         * int y = -1;
         * 
         * System.out.println("y is " + y);
         * y = 100;
         * System.out.println("Y is now " + y);
         * }
         * }
         * }
         * Although blocks can be nested, you cannot declare a variable to have the same
         * name as one in outer scope
         * 
         * class ScopeErr {
         * public static void main(String args[]) {
         * int bar = 1;
         * {//creates a new scope
         * int bar = 2; // compile time error - bar already defined!
         * }
         * }
         * }
         * 
         * TYPE CONVERSION AND CASTING
         * It is fairly common to assign a value of one type to another type.
         * If two types are compatible, then java will perform the conversion
         * automatically
         * For e.g it is possible to assign int value to a long variable
         * However, not all types are compatible, so not all type conversions are
         * implicitly allowed.
         * For e.g there is no conversion defined from double to byte.
         * Fortunately it is still possible to obtain a conversion between incompatible
         * types--
         * for that you have to use CAST, which performs an explicit conversion between
         * incompatible types
         * 
         * Casting incompatible types
         * Although the automatic type conversions are helpful they will not filfill all
         * needs.
         * For e.g. What if you want to assign int value to a byte variable..?
         * This conversion will not take place automatically - because byte is smaller
         * than int
         * This is narrowing conversion
         * For casting incompatible types, you must use a cast-Explicit type conversion
         * General form: (target-type) value
         * Here target type specifies the desired type to convert the specified value
         * to.
         * E.g
         * int a;
         * byte b;
         * //...
         * b = (byte) a;
         * 
         * A different type of conversion will occur when a floating point value is
         * assigned To interger type : truncation
         * 
         * Integer do not have fractional components.
         * Thus when a floating point value is assigned to an integer type, The
         * fractional Component will be lost
         * For example, if 1.23 is assigned to integer, resulting value will simply be
         * 1.
         * 
         * class Conversion {
         * public static void main(String args[]) {
         * byte b;
         * int i = 257;
         * double d = 323.142;
         * System.out.println("Conversion of int to byte");
         * b = (byte) i;
         * System.out.println("I and b: " + i + " " + b);
         * System.out.println("Conversion of double to int");
         * i = (int) d;
         * System.out.println("d and i" + d + " " + i);
         * System.out.println("\nConversion of double to byte");
         * b = (byte) d;
         * System.out.println("d and b" + d + " " + b);
         * 
         * }
         * }
         * 
         * Automatic type promotion in expressions
         * other than Assignment, in expression also certain type conversion may occur.
         * 
         * The preision required of an intermediate value will sometimes excees the
         * range of Either operand.
         * 
         * E.g. Examine the following expression:
         * Byte a = 40;
         * Byte b = 50;
         * Byte c = 100;
         * int d = a * b / c;
         * The result of the intermediate term a * b easily exceeds the range of either
         * of its byte Operands.
         * To handle this, Java automatically promotes each byte or short operand to int
         * when Evaluating an expression. -> Here subexpression a * b is perfomed using
         * integers, not bytes
         * 
         * Automatic promotions can cause confusing compile time errors
         * 
         * e.g: Byte b = 50;
         * B = b * 2; // Error ! Cannot assign an int to a byte!
         * Explaination:
         * 50 * 2 are perfect byte value, back into byte variables. but because the
         * operands were automatically promoted to int while evaluating the
         * expression-result also promoted to int, which can't be stored to byte -
         * without casting!
         * You should use like:
         * Byte b = 50;
         * b = (byte) (b * 2)
         * 
         * TYPE PROMOTION rules-for expressions
         * All byte and short values are promoted to int
         * If one operand is long, the whole expression is promoted to long
         * If one operand is float, entire expression is evaluted to float.
         * If any one of operands is double, the result is double
         * 
         * class Promote {
         * public static void main(String args[]) {
         * byte b = 42;
         * char c = 'a';
         * short s = 1024;
         * int i = 50000;
         * float f = 5.67f;
         * double d = .1234;
         * double result = (f * b) + (i / c) - (d * s);
         * // In first subexpression, (f * b) is promoted to float and the result of the
         * subexpression is float.
         * // In the subexpression i / c, c is promoted to int and result is of type int
         * // in (d * s) the value of s is promoted to double
         * // Finally these three intermediate values, float, int and double are
         * considered.
         * I. Outcome of float + int is float
         * II. Resultant float-double is double
         * III. Final result is double
         * 
         * System.out.println((f * b) + " + " + (i / c) + "-" + (d * s));
         * System.out.println("result = " + result);
         * }
         * }
         * 
         * ARRAYS
         * An array is a group of like typed variables that are referred to by a common
         * name.
         * Array of any type can be created and may have one or more dimensions.
         * One dimensional arrays:
         * One dimensional array is essentially a list of like-typed variables.
         * To create an array, you first must create an array variable of desired type
         * Syntax"
         * Type var-name[];
         * Here, type = base(data) tyoe of array
         * e.g: int month_days[]; --// no initialisation, only set to null
         * To allpcate memory, use new: Syntax is: array- var = new type[size]; // after
         * new all elemnets in array will set to 0
         * Arrays can be created when they are declared.
         * Array initializer is a list of comma - seperated expressions surrounded by
         * curly braces.
         * The array will automatically be created large enough to hold the number of
         * elements. You specify in the array initializer. There is no need to use new
         * Java automatically checks at runtime if you are accidently storing or
         * accessing the Array elements that are outside the range or negative indexes
         * 
         * Multi dimensional Arrays
         * In java, actuallly multi dimensional array of arrays.
         * These, as you might expect look and act like regular multidimensinal array.
         * 
         * To declare a multi dimensional array variable specify each additional index
         * using another Set of square brackets.
         * 
         * int twoD[][] = new int[4][5];
         * 
         * This allocates a 4 by 5 array and assigns it to twoD
         * 
         * class TwoDArray {
         * public static void main(String args[]){
         * int twoD[][] = new int[4][5];
         * int i,j, k = 0;
         * 
         * for (i = 0; i < 4; i++) {
         * for (j = 0; j < 5; j++) {
         * twoD[i][j] = k;
         * k++;
         * }
         * }
         * 
         * for (i = 0; i < 4; i++) {
         * for (j = 0; j < 5; j++) {
         * System.out.println(twoD[i][j] + " ");
         * }
         * System.out.println();
         * }
         * }
         * }
         * 
         * Mutil Dimensional Array with different dimensions
         * When you allocate memory for a multidimensional array you need only specify
         * the memory for the first (leftmost) dimension.
         * You can allocate the remaining dimensions seperately.
         * //Manually allocate differing sized dimensions'
         * 
         * int twoD[][] = new int[4][];
         * twoD[0] = new int[1];
         * twoD[1] = new int[2];
         * twoD[2] = new int[3];
         * twoD[3] = new int[4];
         * 
         * int i, j, k = 0;
         * for (i = 0; i < 4; i++) {
         * for (j = 0; j < 5; j++) {
         * twoD[i][j] = k;
         * k++;
         * }
         * }
         * 
         * for (i = 0; i < 4; i++) {
         * for (j = 0; j < 5; j++) {
         * System.out.println(twoD[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * 
         */

        // Practical

        // long
        // int lightSpeed;
        // long days;
        // long seconds;
        // long distance;

        // byte b = 1;
        // short s;
        // s = 2;
        // int i = 3;
        // long l = 4;

        // char c = 'a';

        // boolean bool = true;

        // float f = 1.2F;

        // long l2 = 2_000_000_000_000L;

        // double d = 1.3;

        // var v = 1;
        // // v = true;
        // // v = 1.3;

        // int i3 = s;

        // char c2 = 100;
        // System.out.println(c2);

        // double d2 = i3;
        // d2 = l;

        // b = (byte) i3;

        // byte b2 = (byte) 128;
        // System.out.println(b2);

        // long number = 499_999_999_000_000_001L;
        // double converted = (double) number;
        // System.out.println(number - (long) converted);

        // Integer i4 = 1;

        // int i5 = i4;

        // lightSpeed = 186000;
        // days = 1000; //specify number of days
        // seconds = days * 24 * 60 * 60; // conversion to seconds took place

        // distance = lightSpeed * seconds;

        // System.out.print("In " + days);

        // System.out.println("days light will travel about");
        // System.out.print(distance + " miles.");

        // Double
        // double pi, r, a;
        // r = 10.8;
        // pi = 3.1416;
        // a = pi * r * r;//calculate area formula
        // System.out.println("Area of circle is calculated " + a);
        // when we do not need extra precision we use FLOATING POINT DATA TYPE and when
        // we want extra precision we use Double precision value

        // Character

        // char ch1, ch2;

        // ch1 = 88;
        // ch2 = 'Y';

        // System.out.println("ch1= " + ch1 + ", ch2=" + ch2);

        // char ch3;
        // ch3 = 'X';

        // System.out.println("Ch1 contains " + ch1);
        // ch3++;

        // System.out.println("ch3 is now " + ch3);

        // BOOLEAN

        // boolean b;
        // b = false;

        // System.out.println("b is "+b);

        // b = true;

        // System.out.println("b is " + b);

        // int x; // known or visible throughout my main

        // x = 10;

        // if(x == 10) {
        // int y = 20; // is visible only here

        // System.out.println("x and y " + x + " " + y);

        // x = y * 2;
        // }

        // // y = 100;
        // System.out.println("X is " + x / 2);

        // Life time

        // int x;
        // for(x = 0; x < 3;x++) {
        // int y = -1;
        // System.out.println("Y is " + y);
        // y = 100;
        // System.out.println("Y is " + y);
        // }

        // Conversion

        // byte b;
        // int i = 257;
        // double d = 323.142;

        // System.out.println("I am converting int to byte");

        // b = (byte) i;

        // System.out.println("i and b is " + i + " "+ b);

        // System.out.println("I am converting double to int");

        // i = (int) d;

        // System.out.println("d and i is " + d + " "+ i);

        // System.out.println("I am converting double to byte");

        // b = (byte) d;

        // System.out.println("d and b is " + d + " "+ b);

        // Learn the Keywords
        // Read paragraph 5.1.2 and 5.1.3 here

        // Widening conversion
        // A widening primitive conversion does not lose information about the overall
        // magnitude of a numeric value.

        // byte to short, int, long, float, double
        // short to int , long, float or double
        // char to int, long, float or double
        // int to long, float, double
        // long to float or double
        // float to double

        // A widening conversion of an int or a long value to float, or of a long value
        // to double, may result in loss of precision

        // int big = 1234567890;
        // float approx = big;
        // System.out.println(big - (int) approx);

        // Narrowing Primitive Conversion
        // A narrowing primitive conversion may lose information about the overall
        // magnitude of a numeric value and may also lose precision and range.
        // Short to byte or char
        // char to byte or short
        // int to byte, short or char
        // long to byte, short, charor int
        // float to byte, short char int or long
        // double to byte =, short, char, int, long or float

        float fmin = Float.NEGATIVE_INFINITY;
        float fmax = Float.POSITIVE_INFINITY;
        System.out.println("long: " + (long) fmin + " - " + (long) fmax);
        System.out.println("int: " + (int) fmin + " - " + (int) fmax);
        System.out.println("short: " + (short) fmin + " - " + (short) fmax);
        System.out.println("char: " + (char) fmin + " - " + (char) fmax);
        System.out.println("byte: " + (byte) fmin + " - " + (byte) fmax);
        // The results for char, int, and long are unsurprising, producing the minimum
        // and maximum representable values of the type.

        // The results for byte and short lose information about the sign and magnitude
        // of the numeric values and also lose precision. The results can be understood
        // by examining the low order bits of the minimum and maximum int. The minimum
        // int is, in hexadecimal, 0x80000000, and the maximum int is 0x7fffffff. This
        // explains the short results, which are the low 16 bits of these values,
        // namely, 0x0000 and 0xffff; it explains the char results, which also are the
        // low 16 bits of these values, namely, '\u0000' and '\uffff'; and it explains
        // the byte results, which are the low 8 bits of these values, namely, 0x00 and
        // 0xff.

        // Narrowing Primitive Conversions that lose information
        // A narrowing of int to short loses high bits:
        System.out.println("(short)0x12345678==0x" +
                Integer.toHexString((short) 0x12345678));
        // An int value too big for byte changes sign and magnitude:
        System.out.println("(byte)255==" + (byte) 255);
        // A float value too big to fit gives largest int value:
        System.out.println("(int)1e20f==" + (int) 1e20f);
        // A NaN converted to int yields zero:
        System.out.println("(int)NaN==" + (int) Float.NaN);
        // A double value too large for float yields infinity:
        System.out.println("(float)-1e100==" + (float) -1e100);
        // A double value too small for float underflows to zero:
        System.out.println("(float)1e-50==" + (float) 1e-50);

    }
}
