
//Question-1: Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num % 2==0){
            System.out.println("The number " + num + " is an even number");
        }else {
            System.out.println("The number " + num + " is an odd number");
        }
    }
}
