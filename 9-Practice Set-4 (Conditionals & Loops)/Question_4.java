
//Question-4: Calculate Discount Of Product.

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        double bill, discount;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        bill = input.nextInt();

        System.out.print("Enter discount percentage: ");
        discount = input.nextInt();
        double discountFinal = (bill * discount / 100);
        double billFinal = bill - discountFinal;

        System.out.println("Discount price is: " + discountFinal);
        System.out.println("After discount your bill is: " + billFinal);
    }
}
