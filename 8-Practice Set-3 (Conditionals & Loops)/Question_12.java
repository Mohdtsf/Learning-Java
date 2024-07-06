
//Question-12: Volume Of Sphere.

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        int radius = input.nextInt();
        double pi = 3.142, volume;
        volume = (4 * pi * radius * radius * radius)/3;
        System.out.println("The volume of the sphere is: " + volume);
    }
}
