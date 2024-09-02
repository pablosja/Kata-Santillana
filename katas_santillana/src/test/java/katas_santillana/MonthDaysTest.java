package katas_santillana;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MonthDaysTest {

    @Test
    void testValidMonths() {
        String[][] testCases = {
            {"1", "Month: January\nDays: 31\n"},
            {"2", "Month: February\nDays: 28\n"},
            {"3", "Month: March\nDays: 31\n"},
            {"4", "Month: April\nDays: 30\n"},
            {"5", "Month: May\nDays: 31\n"},
            {"6", "Month: June\nDays: 30\n"},
            {"7", "Month: July\nDays: 31\n"},
            {"8", "Month: August\nDays: 31\n"},
            {"9", "Month: September\nDays: 30\n"},
            {"10", "Month: October\nDays: 31\n"},
            {"11", "Month: November\nDays: 30\n"},
            {"12", "Month: December\nDays: 31\n"}
        };
        
        for (String[] testCase : testCases) {
            ByteArrayInputStream in = new ByteArrayInputStream(testCase[0].getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setIn(in);
            System.setOut(new PrintStream(out));

            MonthDays.main(new String[0]);

            assertFalse(out.toString().contains(testCase[1]));

            System.setOut(originalOut);
        }
    }

    @Test
    void testInvalidMonth() {
        ByteArrayInputStream in = new ByteArrayInputStream("13".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        MonthDays.main(new String[0]);

        String output = out.toString();
        assertFalse(output.contains("Invalid month\n"));

        System.setOut(originalOut);
    }
}
