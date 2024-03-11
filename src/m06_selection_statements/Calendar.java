package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Use a `switch statement` to display the month name when given an `int` `monthNum`.
If an invalid `monthNum` is given print `Invalid month`

Ex:
  monthNum is 5:
  Output: May

  monthNum is 1:
  Output: January

  monthNum is 20:
  Output: Invalid month
 */

public class Calendar extends TestBase {
    public static void main(String[] args) {
        int monthNum = args.length > 0 ? Integer.parseInt(args[0]) : 1;

        // WRITE YOUR CODE BELOW


    }

    @Test
    public void test1() {
        Calendar.main(new String[]{"1"});
        assertEquals("January", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Calendar.main(new String[]{"2"});
        assertEquals("February", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Calendar.main(new String[]{"3"});
        assertEquals("March", outContent.toString().trim());
    }

    @Test
    public void test4() {
        Calendar.main(new String[]{"4"});
        assertEquals("April", outContent.toString().trim());
    }

    @Test
    public void test5() {
        Calendar.main(new String[]{"5"});
        assertEquals("May", outContent.toString().trim());
    }

    @Test
    public void test6() {
        Calendar.main(new String[]{"6"});
        assertEquals("June", outContent.toString().trim());
    }

    @Test
    public void test7() {
        Calendar.main(new String[]{"7"});
        assertEquals("July", outContent.toString().trim());
    }

    @Test
    public void test8() {
        Calendar.main(new String[]{"8"});
        assertEquals("August", outContent.toString().trim());
    }

    @Test
    public void test9() {
        Calendar.main(new String[]{"9"});
        assertEquals("September", outContent.toString().trim());
    }

    @Test
    public void test10() {
        Calendar.main(new String[]{"10"});
        assertEquals("October", outContent.toString().trim());
    }

    @Test
    public void test11() {
        Calendar.main(new String[]{"11"});
        assertEquals("November", outContent.toString().trim());
    }


    @Test
    public void test12() {
        Calendar.main(new String[]{"12"});
        assertEquals("December", outContent.toString().trim());
    }

    @Test
    public void test13() {
        Calendar.main(new String[]{"13"});
        assertEquals("Invalid month", outContent.toString().trim());
    }
}
