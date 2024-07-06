
//Question-14: Curved Surface Area Of Cylinder.

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double pi = 3.142;

        double CurvedSurfaceArea = 2 * pi * radius * height;
        System.out.println("The curved surface area of the cylinder is " + CurvedSurfaceArea);
    }
}
