
//Question-8: Perimeter Of Parallelogram.

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the height of the Parallelogram: ");

        double h= input.nextDouble();

        System.out.print("Enter the breadth of the Parallelogram: ");

        double b= input.nextDouble();

        double  perimeter=2*(h+b);

        System.out.println("perimeter of Parallelogram is: " + perimeter);
    }
}
