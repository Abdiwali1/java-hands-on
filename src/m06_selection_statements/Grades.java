package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variable testScore, write conditional statements to assign the matching grade.
testScore 90 or more => A
testScore 80 - 89 => B
testScore 70 - 79 => C
testScore 60 - 69 => D
testScore less than 60 => F
 */

public class Grades extends TestBase {
    public static void main(String[] args) {
        int testScore = args.length > 0 ? Integer.parseInt(args[0]) : 77;
        char grade;




    }

    @Test
    public void test1() {
        Grades.main(new String[]{"95"});
        assertEquals("A", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Grades.main(new String[]{"83"});
        assertEquals("B", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Grades.main(new String[]{"71"});
        assertEquals("C", outContent.toString().trim());
    }

    @Test
    public void test4() {
        Grades.main(new String[]{"60"});
        assertEquals("D", outContent.toString().trim());
    }

    @Test
    public void test5() {
        Grades.main(new String[]{"10"});
        assertEquals("F", outContent.toString().trim());
    }
}
