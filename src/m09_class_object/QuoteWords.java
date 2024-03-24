package m09_class_object;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Create a Scanner object and accept two words. Use the words to make the following sentence with the words surrounded by quotation marks:

    I will learn $topic1 and $topic2 at Cydeo.

    Ex:
      Input:
        Java
        SQL

      Output:
        I will learn "Java" and "SQL" at Cydeo.
 */

public class QuoteWords extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE



    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("Java", "SQL");
        main(null);
        assertEquals("I will learn \"Java\" and \"SQL\" at Cydeo.", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("API", "Selenium");
        main(null);
        assertEquals("I will learn \"API\" and \"Selenium\" at Cydeo.", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("SoftSkills", "Git");
        main(null);
        assertEquals("I will learn \"SoftSkills\" and \"Git\" at Cydeo.", outContent.toString().trim());
    }

}
