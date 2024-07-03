
//Question-3: Area Of Rectangle Program.

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = (length * width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
