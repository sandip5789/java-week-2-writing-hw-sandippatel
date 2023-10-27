package homework_week_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division method
 * all with parameter and use string concatenation method.
 * (Note: Two static and Two instance methods.)
 */

public class Programme_5_Calculator {
    // static method
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
   // static method
    public static int subtraction(int a, int b) { // no void as return
        return a - b; // with return
    }
    //instance method
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }
    // instance method
    public int division(int a,int b) {
        return a / b;
    }
    public static void main(String[] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        addition(a, b);

       int subResult = subtraction(a, b); // subResult means subtraction result
        System.out.println("The subtraction of " + a + " and " + b + " is : "  + subResult);

        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        // closing the scanner object
        scanner.close();
    }
}
