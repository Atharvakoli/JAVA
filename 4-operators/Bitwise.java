public class Bitwise {
    public static void main(String[] args) {

        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);

        // In this example, a and b have bit patterns that present all four
        // possibilities for two
        // binary digits: 0-0, 0-1, 1-0, and 1-1. You can see how the | and & operate on
        // each bit by the

        // Chapter 4 Operators 69
        // Part I
        // results in c and d. The values assigned to e and f are the same and
        // illustrate how the ^ works.
        // The string array named binary holds the human-readable, binary representation
        // of the
        // numbers 0 through 15. In this example, the array is indexed to show the
        // binary representation
        // of each result. The array is constructed such that the correct string
        // representation of a
        // binary value n is stored in binary[n]. The value of ~a is ANDed with 0x0f
        // (0000 1111 in
        // binary) in order to reduce its value to less than 16, so it can be printed by
        // use of the binary
        // array. Here is the output from this program:
        // a = 0011
        // b = 0110
        // a|b = 0111
        // a&b = 0010
        // a^b = 0101
        // ~a&b|a&~b = 0101
        // ~a = 1100
    }
}
