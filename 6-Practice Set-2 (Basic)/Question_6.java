
//Question-6: Input currency in rupees and output in USD.

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        double rupees, dollar;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rupees: ");
        rupees = input.nextFloat();
        dollar = rupees / 83.45;
        System.out.println(rupees + " Rupees is equals to " + dollar);
    }
}
