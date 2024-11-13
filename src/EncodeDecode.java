/*
Using the XOR (^) operation to encode and decode a message
 */
public class EncodeDecode {
    public static void main(String[] args) {
        String message = "This is a test message";
        String encodeMessage = ""; // String for encoded message
        String decodeMessage = ""; // String for decoded message
        int key = 88;

        System.out.println("Original message: " + message);

        // Encoding the message
        for (int i = 0; i < message.length(); i++) {
            encodeMessage = encodeMessage + (char) (message.charAt(i) ^ key);
        }
        System.out.println("Encoded message: " + encodeMessage);

        // Decoding yhr message
        for (int i = 0; i < message.length(); i++) {
            decodeMessage = decodeMessage + (char) (encodeMessage.charAt(i) ^ key);
        }
        System.out.println("Decoded message: " + decodeMessage);

    }
}
