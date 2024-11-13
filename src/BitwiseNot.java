/*
A program that implements the bitwise NOT operation
with the display of a number and its complement to one in binary format
 */
public class BitwiseNot {
    public static void main(String[] args) {
        byte b = -34;

        System.out.print("Initial state of bits: ");
        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }

        System.out.println();

        System.out.print("Changed state of bits: ");
        // We changed the state of the bits to the opposite
        b = (byte) ~b;
        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}

