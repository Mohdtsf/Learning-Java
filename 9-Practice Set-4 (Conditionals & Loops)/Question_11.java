
//Question-11: Sum Of N Numbers.

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the sum: ");
        int num = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }

        System.out.println("Sum of " + num + " numbers = " + sum);
    }
}
