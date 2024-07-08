
//Question_17: Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0, product = 1, rem;
        while(num >0){
            rem = num %10;
            sum = sum + rem;
            product = product * rem;
            num /= 10;
        }
        int subtraction = product - sum;
        System.out.println("Product of the digits are: " + product);
        System.out.println("Sum of the digits are: " + sum);
        System.out.println("Subtraction of the Product and Sum of Digits are: " + subtraction);
    }
}
