
//Question-9: Volume Of Cone Java Program

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        double r=input.nextDouble();
        System.out.print("Enter the height of cone: ");
        double h=input.nextDouble();
        double pi = 3.142;

        double  volume=(pi*r*r*h)/3;

        System.out.println("Volume Of Cone is:" +volume);
    }
}
