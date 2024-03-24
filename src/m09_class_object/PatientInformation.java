package m09_class_object;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a Scanner object to read the information about a patient from the console. Then build and print a summary of the information

    Use print statements with questions followed by Scanner methods. The order of questions and inputs must match the following:
    first name, last name, email, street, city, state, zip code, work phone number, personal phone number, age, height, weight, are they married

    use this print statement output: "Enter your $field"
----------------------------------------------------------------------
    Example program flow:
        Welcome to the patient portal!
        Please enter your personal information
        Enter your first name
          James
        Enter your last name
          May
        Enter your email
          jamesmay@gmail.com
        Enter your street
          7925 Jones Branch Dr
        Enter your city
          McLean
        Enter your state
          VA
        Enter your zip code
          22102
        Enter your work phone number
          7896542314
        Enter your personal phone number
          2406542314
        Enter your age
          35
        Enter your height
          5.10
        Enter your weight
          173.2
        Are you married?
          true
----------------------------------------------------------------------

    declare and assign new variables based on previous inputs:
        contact: $workPhone, $personalPhone, $email
        fullName: $firstName $lastName
        address: $street, $city, $state, $zipcode
    Create a summary of all the patient information:
        Example:
        Patient personal information
        Full name: James May
        Address: 7925 Jones Branch Dr, McLean, VA 22102
        Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
        Age: 35
        Height: 5.1
        Weight: 173.2 pounds
        Married: true

*/

public class PatientInformation extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE


    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("James", "May", "jamesmay@gmail.com", "7925 Jones Branch Dr", "McLean", "VA", "22102", "7896542314", "2406542314", "35", "5.1", "173.2", "true");
        main(null);
        String expected =
                "Patient personal information\n" +
                "Full name: James May\n" +
                "Address: 7925 Jones Branch Dr, McLean, VA 22102\n" +
                "Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com\n" +
                "Age: 35\n" +
                "Height: 5.1\n" +
                "Weight: 173.2 pounds\n" +
                "Married: true";
        assertEquals(expected, simplifyOutput("Patient personal information"));
    }

    @Test
    public void test2() {
        provideInput("Mike", "Tyson", "miketyson@gmail.com", "7911 Westpark Dr", "McLean", "VA", "22102", "7896542333", "2406542135", "44", "6.2", "185.5", "false");
        main(null);
        String expected =
                "Patient personal information\n" +
                "Full name: Mike Tyson\n" +
                "Address: 7911 Westpark Dr, McLean, VA 22102\n" +
                "Contact: work phone number: 7896542333, personal phone number: 2406542135, email: miketyson@gmail.com\n" +
                "Age: 44\n" +
                "Height: 6.2\n" +
                "Weight: 185.5 pounds\n" +
                "Married: false";
        assertEquals(expected, simplifyOutput("Patient personal information"));
    }
}
