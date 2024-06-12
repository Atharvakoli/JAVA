
public class NumberSystems {
    public static void main(String[] args) {

        // Number Systems
        /*
         * Data Types
         * 
         * Decimal -> Base value or Radix 10 (1,2,3,4,5,6,7,8,9)
         * Binary -> Base Value or Radix 2 (0,1)
         * index starts from right
         * 1 -> 1 * 2 power 3 -by calculating -> 8
         * 0 -> 0 * 2 power 1 -by calculating -> 0
         * 1 -> 1 * 2 power 1 -by calculating -> 2
         * 1 -> 1 * 2 power 0 -by calculating -> 1
         * 
         * 8 + 0 + 2 + 1 = 11 in decimal
         * 
         * Octal -> Base Value 8 or Radix (0,1,2,3,4,5,6,7)
         * index starts from right
         * 7 -> 7 * 8 power 3 -by calculating -> 3584
         * 2 -> 2 * 8 power 2 -by calculating -> 128
         * 0 -> 0 * 8 power 1 -by calculating -> 0
         * 5 -> 5 * 8 power 0 -by calculating -> 5
         * 
         * 3584 + 128 + 0 + 5 = 3717 in decimal
         * 
         * Hexadecimal -> Base Value or Radix 16 (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
         * 
         * index starts from right
         * 1 -> 1 * 16 power 3 -by calculating -> 4096
         * 3 -> 3 * 16 power 2 -by calculating -> 768
         * A -> 10 * 16 power 1 -by calculating -> 160
         * E -> 14 * 16 power 0 -by calculating -> 14
         * 
         * 4096 + 768 + 160 + 14 = 5038 in decimal
         * 
         * Binary, octal and hex literals in Java
         */

        int dec = 152;
        int binary = 0b10011000;
        int oct = 0230;
        int hex = 0x98;

        System.out.println(dec);
        System.out.println(binary);
        System.out.println(oct);
        System.out.println(hex);

        // Take piece of paper and do some calculations: What decimal number is encoded
        // in hexadecimal name of the rock band - ACDC?

    }
}
