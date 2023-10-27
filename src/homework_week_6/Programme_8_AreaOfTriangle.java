package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to calculate the area of a triangle.
 */

public class Programme_8_AreaOfTriangle {
    // calculating the area of triangle with no return type with parameter method
    public static void areaOftriangle(int length, int height){
        int area = (length * height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }
    public static void main(String[] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOftriangle(height, length);
        // closing the scanner object
        scanner.close();
    }
}
