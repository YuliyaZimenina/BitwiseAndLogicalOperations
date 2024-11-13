/*
Program to prevent division by 0 using ternary
operator (operation ? )
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int result;
        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0; // Preventing division by 0
            if (i != 0)
                System.out.println("100 / " + i + " = " + result);
        }
    }
}
