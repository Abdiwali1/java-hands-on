package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
    Given integer variable hour, write conditional statements to print out matching greeting.
    hour 5 - 11 => Good morning
    hour 12 - 17 => Good afternoon
    hour 18 - 23 or 0 - 5 => Good evening
    Any other hour => Invalid hour
    Ex:
    hour is 7
      output:
        Good morning
    hour is 14
      output:
        Good afternoon
    hour is 22
      output:
        Good evening
 */

public class GreetingHours extends TestBase {
    public static void main(String[] args) {
        int hour = args.length > 0 ? Integer.parseInt(args[0]) : 1;




    }

    @Test
    public void test1() {
        GreetingHours.main(new String[]{"6"});
        assertEquals("Good morning", outContent.toString().trim());
    }

    @Test
    public void test2() {
        GreetingHours.main(new String[]{"13"});
        assertEquals("Good afternoon", outContent.toString().trim());
    }

    @Test
    public void test3() {
        GreetingHours.main(new String[]{"20"});
        assertEquals("Good evening", outContent.toString().trim());
    }

    @Test
    public void test4() {
        GreetingHours.main(new String[]{"3"});
        assertEquals("Good evening", outContent.toString().trim());
    }

    @Test
    public void test5() {
        GreetingHours.main(new String[]{"27"});
        assertEquals("Invalid hour", outContent.toString().trim());
    }

}
