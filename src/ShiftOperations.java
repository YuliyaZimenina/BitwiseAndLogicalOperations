// Demonstration of shift operations (<< and >>)
public class ShiftOperations {
    public static void main(String[] args) {
        int value = 1;

        System.out.println("Shift left: ");
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((value & t) != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
            value = value << 1; // shift left
        }
        System.out.println();
        System.out.println("Shift right: ");
        value = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((value & t) != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
            value = value >> 1;// shift right
        }
    }
}
