package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
SDET Motors Inc. is recalling all vehicles from model years:

2001-2002,
2004-2006,
2015-2018

Given a variable modelYear write a statement that prints the message "RECALL"
if the value of modelYear falls within those ranges. Otherwise print "NOT RECALL"

ex:
    modelYear is 2002
    Output:
        RECALL

    modelYear is 2023
    Output:
        NOT RECALL
 */

public class VehicleRecall extends TestBase {
    public static void main(String[] args) {
        int modelYear = args.length > 0 ? Integer.parseInt(args[0]) : 2002;

        // WRITE YOUR CODE BELOW:




    }

    @Test
    public void test1() {
        VehicleRecall.main(new String[]{"2001"});
        assertEquals("RECALL", outContent.toString().trim());
    }

    @Test
    public void test2() {
        VehicleRecall.main(new String[]{"2004"});
        assertEquals("RECALL", outContent.toString().trim());
    }

    @Test
    public void test3() {
        VehicleRecall.main(new String[]{"2017"});
        assertEquals("RECALL", outContent.toString().trim());
    }

    @Test
    public void test4() {
        VehicleRecall.main(new String[]{"2023"});
        assertEquals("NOT RECALL", outContent.toString().trim());
    }

    @Test
    public void test5() {
        VehicleRecall.main(new String[]{"2000"});
        assertEquals("NOT RECALL", outContent.toString().trim());
    }
}
