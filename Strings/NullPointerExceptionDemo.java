package Strings;
public class NullPointerExceptionDemo {

    private static String text;
	private static String text2;

	static void generateNullPointerException() {
        text2 = null;
        System.out.println("Text length: " + text2.length());
    }

    // Method to handle NullPointerException
    static void handleNullPointerException() {
        text = null;
        try {
            System.out.println("Text length inside try: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        generateNullPointerException();
        handleNullPointerException();
    }
}
