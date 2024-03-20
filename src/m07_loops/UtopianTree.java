package m07_loops;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a `loop` to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then afterward it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.

     Use the format:
     year x - growth x cm
     tree size: x cm

     where the 'x' values are different values of year, the growth amount, and the total tree size up to that year

     Example Flow:
     year 1 - growth 1 cm
     tree size: 1 cm

     year 2 - growth 1 cm
     tree size: 2 cm

     year 3  - growth 1 cm
     tree size: 3 cm

     year 4 - growth 2 cm
     tree size: 5 cm

     year 5 - growth 2 cm
     tree size: 7 cm

     ... until you reach year 10

 */

public class UtopianTree extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE




    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        main(null);
        assertEquals("year 1 growth 1 cm\n" +
                "tree size: 1\n" +
                "\n" +
                "year 2 growth 1 cm\n" +
                "tree size: 2\n" +
                "\n" +
                "year 3 growth 1 cm\n" +
                "tree size: 3\n" +
                "\n" +
                "year 4 growth 2 cm\n" +
                "tree size: 5\n" +
                "\n" +
                "year 5 growth 2 cm\n" +
                "tree size: 7\n" +
                "\n" +
                "year 6 growth 2 cm\n" +
                "tree size: 9\n" +
                "\n" +
                "year 7 growth 2 cm\n" +
                "tree size: 11\n" +
                "\n" +
                "year 8 growth 2 cm\n" +
                "tree size: 13\n" +
                "\n" +
                "year 9 growth 2 cm\n" +
                "tree size: 15\n" +
                "\n" +
                "year 10 growth 2 cm\n" +
                "tree size: 17", outContent.toString().trim());
    }
}
