package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java programme that takes three numbers as input to calculate and
 * print the average of the number.
 */

public class Programme_13_AverageOfNumbers {
    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c ) / 3;
        System.out.println("The average of " + a + " , " + b + " and " + c + " is :" + average);
    }

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = scanner.nextDouble(); // can also use a,b,c instead of x,y,z
        System.out.println("Enter the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        // closing the scanner object
        scanner.close();
    }
}
