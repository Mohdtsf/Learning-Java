
//Question-17: Perfect Number In Java.

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
                sum = sum + i;
        }
        if (sum == num)
            System.out.println (num + " Is a perfect number");
        else
            System.out.println (num + " Is not a perfect number");
    }
}
