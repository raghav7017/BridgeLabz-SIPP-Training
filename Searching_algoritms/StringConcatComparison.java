package Searching_algoritms;

public class StringConcatComparison {
	public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        // Measure time for StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbBuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;

        // Measure time for StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbBuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;

        // Output the results
        System.out.println("Time taken by StringBuilder: " + (durationBuilder / 1_000_000.0) + " ms");
        System.out.println("Time taken by StringBuffer: " + (durationBuffer / 1_000_000.0) + " ms");
    }

}
