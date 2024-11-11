public class UpperCase {
    /*
    Using the & operations to convert lowercase letters to
    uppercase letters by clearing the sixth bit.
     */
    public static void main(String[] args) {
        char letter;
        for (int i = 0; i < 10; i++) {
            letter = (char) ('a' + i);
            System.out.print(letter + " => ");

            // This operator turns off bit 6;
            /*
            The number 65503 is the decimal representation of the binary number
            1111 1111 1101 1111 with bit 6 set to 0;
            As a result, all bits in the & operation will be left unchanged
            except for bit 6.
             */
            letter = (char) ((int) letter & 65503);// Now variable letter contains an uppercase letter

            System.out.print(letter + " ");

        }
    }
}