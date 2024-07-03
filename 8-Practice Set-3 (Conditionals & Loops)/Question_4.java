
//Question-4: Area Of Triangle by using 3 sides of the triangle.

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side a: ");
        double a = input.nextDouble();
        System.out.print("Enter the side b: ");
        double b = input.nextDouble();
        System.out.print("Enter the side c: ");
        double c = input.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area);
    }
}
