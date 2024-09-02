package katas_santillana;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArmstrongNumberTest {

    @Test
    void testIsArmstrongNumber() {
        assertTrue(ArmstrongNumber.isArmstrongNumber(0));
        assertTrue(ArmstrongNumber.isArmstrongNumber(1));
        assertTrue(ArmstrongNumber.isArmstrongNumber(153));
        assertTrue(ArmstrongNumber.isArmstrongNumber(370));
        assertTrue(ArmstrongNumber.isArmstrongNumber(371));
        assertTrue(ArmstrongNumber.isArmstrongNumber(407));

        assertTrue(ArmstrongNumber.isArmstrongNumber(2));
        assertFalse(ArmstrongNumber.isArmstrongNumber(10));
        assertFalse(ArmstrongNumber.isArmstrongNumber(100));
        assertFalse(ArmstrongNumber.isArmstrongNumber(123)); 
    }

    @Test
    void testMain() {

        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream("153\n".getBytes());
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new java.io.PrintStream(out));

        ArmstrongNumber.main(new String[0]);

        String output = out.toString();
        assertTrue(output.contains("153 is an Armstrong number."));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}
