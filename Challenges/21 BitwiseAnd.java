import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator\n");
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: " + result);

        String binary[] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
                "1011", "1100", "1101", "1110", "1111" };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        // a = 0011
        // b = 0110
        // a|b = 0111
        // a&b = 0010
        // a^b = 0101
        // ~a&b|a&~b = 0101
        // ~a = 1100
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println("      a|b = " + binary[c]);
        System.out.println("      a&b = " + binary[d]);
        System.out.println("      a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("       ~a = " + binary[g]);
    }
    /*
     * 
     * 
     * The Bitwise ANDThe AND operator, &, produces a 1 bit if both operands are
     * also 1. A zero is produced in all other cases. Here is an example:
     * 00101010 42
     * &00001111 15
     * __________
     * 00001010 10
     * 04-ch04.indd 67 14/02/14 4:45 PM
     */
}
