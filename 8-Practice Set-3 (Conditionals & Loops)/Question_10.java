
//Question-10: Volume Of Prism.

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the prism: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = input.nextDouble();
        System.out.print("Enter the length of the prism: ");
        double length = input.nextDouble();

        double volume = (length * base * height)/2;
        System.out.println("The volume of the prism is " + volume);
    }
}
