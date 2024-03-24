package m09_class_object;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Create a program that will build a custom laptop by allowing the user to select each part and computing the total price. Use the following requirements for each section:

    First ask the user about the screen size
        Select screen size:
        - For a screen size of `13.3`, add `$200` to the total price
        - For a screen size of `15.0`, add `300` to the total price
        - For screen size of `17.3`, add `$400` to the total price

    Then ask the user about the CPU
        Select CPU type:
        - For a CPU of `i5`, add `$250` to the total price
        - For a CPU of `i7`, add `$350` to the total price
        - For a CPU of `i3`, add `$150` to the total price

    Then ask the user about the RAM size
        Select RAM size:
        - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

    Then ask the user about the storage type and amount
        Select storage type:
        - For `HDD`, add `$50` to the total price for every 500GB
        - For `SSD`, add `$100` to the total price for every 500GB

    Then ask the user about the screen resolution
        Select screen resolution:
        - For `FULLHD`, add `$100` to the total price
        - For `4K`, add `$200` to the total price

    At the end display the total price of the custom computer
        Final price is: $amount

    Example Flow:
      Select screen size:
        13.3
      Select CPU type:
        i7
      Select RAM size:
        8
      Select storage type:
        SSD
      Select storage size:
        1000
      Select screen resolution:
        4K
      Final price is: $1050.0
 */

public class ComputerBuilder extends TestBase {

    public static void main(String[] args) {
        // WRITE YOUR CODE HERE




    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("13.3", "i3", "4", "HDD", "500", "FULLHD");
        main(null);
        String expected = "Final price is: $550.0";
        assertEquals(expected, simplifyOutput("Final price is:"));
    }

    @Test
    public void test2() {
        provideInput("13.3", "i3", "16", "HDD", "500", "FULLHD");
        main(null);
        String expected = "Final price is: $700.0";
        assertEquals(expected, simplifyOutput("Final price is:"));
    }

    @Test
    public void test3() {
        provideInput("17.3", "i7", "8", "SSD", "1000", "FULLHD");
        main(null);
        String expected = "Final price is: $1150.0";
        assertEquals(expected, simplifyOutput("Final price is:"));
    }

    @Test
    public void test4() {
        provideInput("13.3", "i7", "8", "SSD", "1000", "4K");
        main(null);
        String expected = "Final price is: $1050.0";
        assertEquals(expected, simplifyOutput("Final price is:"));
    }

}
