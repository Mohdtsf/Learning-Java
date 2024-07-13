
//Question-5: Calculate Distance Between Two Points.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.print("Enter the Co-ordinate x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter the Co-ordinate x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter the Co-ordinate y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter the Co-ordinate y2: ");
        y2 = input.nextDouble();
       double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between x1: " + x1 + " ,x2: " + x2 + " and y1: " + y1 + " ,y2: " + y2 + " is: " + distance);
    }
}
