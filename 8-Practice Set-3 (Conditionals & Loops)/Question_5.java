
//Question-5: Area Of Rhombus.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first diagonal of the rhombus: ");
        double d1=input.nextDouble();
        System.out.print("Enter the second diagonal of the rhombus: ");
        double d2=input.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("Area of rhombus = " + area);
    }
}
