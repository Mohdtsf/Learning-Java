
//Question-9: Compound Interest Java Program.

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principal, rate, time, n;
        System.out.print("Enter the Principal: ");
        principal = input.nextFloat();
        System.out.print("Enter the Rate of interest: ");
        rate = input.nextFloat();
        System.out.print("Enter the Time period: ");
        time = input.nextFloat();
        System.out.print("Enter the number of times that interest is compounded per unit t: ");
        n = input.nextFloat();

        double amount = principal * Math.pow(1 + (rate / n), n * time);
        double cinterest = amount - principal;
        System.out.println("Amount after " + time + " years: " + amount);
        System.out.println("Compound Interest after " + time + " years: " + cinterest);
    }
}

