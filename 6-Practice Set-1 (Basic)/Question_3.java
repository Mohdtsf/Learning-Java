
//Question-3: Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int num = input.nextInt();
            System.out.println("The Multiplication Table of " + num);
        for (int i=1; i<=10;i++){
            int multi= num*i;
            System.out.println(num + " * " + i + " = " + multi);
        }
    }
}
