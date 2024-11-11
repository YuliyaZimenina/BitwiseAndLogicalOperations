/*
Using the | operations to convert uppercase letters to
lowercase letters.
 */
public class LowerCase {
    public static void main(String[] args) {
        char letter;
        for (int i = 0; i < 10; i++) {
            letter = (char) ('A' + i);
            System.out.print(letter + " => ");

            // This operator turns on bit 6;
            letter = (char) ((int) letter | 32); // Now variable letter contains a lowercase letter
            System.out.print(letter + " ");
        }
    }
}
