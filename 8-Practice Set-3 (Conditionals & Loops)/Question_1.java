
//Question-1: Area Of Circle Java Program.


import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        double pi = 3.142, area;
        area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
