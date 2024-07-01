
//Question-3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal, time, rate, SimpleInterest, Famount;
        System.out.print("Enter the Amount: ");
        principal = input.nextInt();
        System.out.print("Enter the Rate: ");
        rate = input.nextInt();
        System.out.print("Enter the Time: ");
        time = input.nextInt();

        SimpleInterest = (principal * time * rate )/ 100;
        Famount = principal + SimpleInterest;
        System.out.println("Simple Interest is: " + SimpleInterest);
        System.out.println("The Final Amount will be: " + Famount);
    }
}
