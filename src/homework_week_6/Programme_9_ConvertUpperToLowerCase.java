package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to convert the upper case to lower case.
 */

public class Programme_9_ConvertUpperToLowerCase {
    // Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
        // uppercase is variable
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase); // call instance method
        // closing the scanner object
        scanner.close();
    }
}
