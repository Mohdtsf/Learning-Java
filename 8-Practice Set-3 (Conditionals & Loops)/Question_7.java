
// Question-7: Perimeter Of Equilateral Triangle.

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the side of the Triangle: ");

        double a= input.nextDouble();

        double  perimeter=3*a;

        System.out.println("perimeter of Triangle is: " + perimeter);
    }
}
