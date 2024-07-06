
//Question-15: Total Surface Area Of Cube.

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the sides of the cube: ");
        double side= input.nextDouble();
        double  SurfaceArea= 6 * side * side;

        System.out.println("Total surface area of the cube is: " + SurfaceArea);
    }
}
