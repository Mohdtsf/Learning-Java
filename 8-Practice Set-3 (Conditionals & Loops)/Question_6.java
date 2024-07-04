
//Question-6: Perimeter Of Circle.

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        double pi = 3.142;
        double perimeter = 2 * pi * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
