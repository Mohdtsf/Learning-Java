
//Question-11: Volume Of Cylinder.

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double pi = 3.142;

        double volume = pi * radius * radius * height;
        System.out.println("The volume of the cylinder is " + volume);
    }
}
