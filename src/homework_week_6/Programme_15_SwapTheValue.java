package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java programme to swap the variables.
 */

public class Programme_15_SwapTheValue {
    // Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b );
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The value of first variable is : " + a + " and second variable is : " + b);
    }
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first,second);
        // closing the scanner object
        scanner.close();
    }
}

