
//Question-3: Calculate Average Of N Numbers.

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        int num, count = 1;
        float  n, average, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        while (count <= n)
        {
            System.out.print("Enter the "+count+" number: ");
            num = input.nextInt();
            sum += num;
            ++count;
        }
        average = sum/n;
        System.out.println("The Average is: "+average);
    }
}
