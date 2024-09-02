package katas_santillana;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonElementsTest {

    @Test
    void testFindCommonElements() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] expected = {4, 5};
        int[] actual = CommonElements.findCommonElements(array1, array2);
        assertArrayEquals(expected, actual);

        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};
        int[] expected2 = {};
        int[] actual2 = CommonElements.findCommonElements(array3, array4);
        assertArrayEquals(expected2, actual2);

        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2, 3};
        int[] expected3 = {1, 2, 3};
        int[] actual3 = CommonElements.findCommonElements(array5, array6);
        assertArrayEquals(expected3, actual3);

        int[] array7 = {};
        int[] array8 = {1, 2, 3};
        int[] expected4 = {};
        int[] actual4 = CommonElements.findCommonElements(array7, array8);
        assertArrayEquals(expected4, actual4);

        int[] array9 = {};
        int[] array10 = {};
        int[] expected5 = {};
        int[] actual5 = CommonElements.findCommonElements(array9, array10);
        assertArrayEquals(expected5, actual5);
    }

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        CommonElements.main(new String[]{});

        System.setOut(originalOut);

        String expectedOutput = "Common elements:\n4\n5\n";
        String actualOutput = outContent.toString();

        System.out.println("Actual Output: [" + toHex(actualOutput) + "]");
        System.out.println("Expected Output: [" + toHex(expectedOutput) + "]");

        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n").trim();
        String normalizedActualOutput = actualOutput.replace("\r\n", "\n").trim();

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }

    private String toHex(String str) {
        StringBuilder hex = new StringBuilder();
        for (char c : str.toCharArray()) {
            hex.append(String.format("\\u%04x", (int) c));
        }
        return hex.toString();
    }
}
