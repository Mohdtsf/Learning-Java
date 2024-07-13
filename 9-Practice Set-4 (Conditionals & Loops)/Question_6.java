
//Question-6: Calculate Commission Percentage.

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");

        double amount = input.nextDouble();

        System.out.print("Enter commissionPercentage: ");

        double percentage = input.nextDouble();

        double commission=(percentage/100)*amount;

        System.out.println("Commission amount = " + commission);
    }
}
