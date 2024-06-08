

public class DataTypes_Variables_Arrays {
    public static void main(String[] args) {
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
         * Name -> Long width -> 64 Range -> -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
         * int -> 64 -> -2,147,483,648 to + 2,147,483,647
         * Short -> 16 -> -32,768, to +32,767
         * Byte -> 8 -> -128 to +127
         * 
         * Byte
         * Range is -128 to + 127
         * Useful when working with stream of data from network to file.
         * When working eith raw binary data that may not be compatible with java's other built in types
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
         * Any integer expression containing byte, short, int and literal numbers are promoted to int before calculation
         * Used in inter math,
         * Type determines behaviour, not size
         * Exception is array -> byte is guaranteed to use only byte per array element short will use two bytes int will use four
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
         * Used when you need fractional component but high degree of precision is not required
         * Example dollars and cents
         * float hightemp, lowtemp
         * 
         * 2. Double
         * Uses 64 nits to store the value
         * Double precision is faster for some modern processors that have been modified for high speed mathematical calculations
         * All transcendental math functions such a sin(),
         * cos(), and sqrt() return double value
         * If you want to maintain accuracy over many iterative calculations Or are manipulating large values numbers
         * Double is the best choice
         * 
         * Characters
         * In c/c++ char is interger type that is 8 bits wide, which is NOT the cae in Java
         * Java uses Unicode to represent chars
         * Unicode defines all international characters set that can represent all of the characters found in all human languages
         * For this purpose it requires 16 bits
         * Range of char is 0 to 65,536
         * There are NO negative chars
         * Standard set of chars(ASCll) range is 0 to 127
         * Extended 8 bit char set ISO-Latin-1 ranges from 0-255
         * For creating applets, and applets are used worldwide, it should use Unicode to represent char
         * English, German, Spanish and french characters can easily be contained in 8 bits But for world wide use, Java should pay this price
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
         * Normally decimal (base 10) values. All other are Octal(base 8) and hexadecimal(base 16)
         * Octal (base 8) values are denoted by leading 0.
         * So 09 will throw an error becouse Octal range is 0 to 7
         * Hexadecimal only matches with modulo 8 word sizes like 8, 16,32 and 64bits
         * Interger literal creates int value which in java is 32 bit integer
         * When literal value is assigned to byte or short variable, no error is generated if literal value is within the range
         * For long, you have to explicitly tell the compiler that literal value is long
         * For this append uppercase L or lowercase l at the end
         * 
         * 2. Floating point literals
         * Decimal values with fractional component
         * Can be expressed in standard or scientific notation
         * Standard notation = wholenumber.fractional component e.g 2.0
         * Scientific notation = standard notation, floating point number plus a suffix by which The number is to be multiplied. E.g 6.022E23
         * By default double. To specify float, must append f or F
         * Explicitly specify double by appending d or D
         * Default double type consumes 64 bits of storage where less accurate float type Requires only 32 bits
         * 
         * 3. Boolean literals
         * Only two values true or false
         * true or false do not convert into numerical representation 
         * true is not equal to 1 not equal to 0
         * true or false can only be assigned to variables declared as boolean or used in expressions with boolean operators
         * 
         * Character literals
         * Unicode character set
         * 16 bit values that can be converted into intergers and manipulated with the integer operators (addition and subtraction operators)
         * Visible ascii charcters are entered inside single quotes
         * There is also a mechanism for directly entering the value of a character in octal or hexadecimal
         * For Octal notation use backslash followed by the three digit number
         * For e.g.\141 is the letter a
         * For hexadecimal you enter a backslash-u (\"u") then exactly 4 hexadecimal digits
         * For example '\u0061' is the ISO-Latin-1 'a' because the top byte is zero
         */
    }
}
