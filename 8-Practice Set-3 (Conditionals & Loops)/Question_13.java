
//Question-13: Volume Of Pyramid.

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the pyramid: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = input.nextDouble();

        double volume = (length * width * height)/3;
        System.out.println("The volume of the prism is " + volume);
    }
}
