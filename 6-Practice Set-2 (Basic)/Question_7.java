
//Question-7; To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("Enter the number of series : ");
        Scanner inout = new Scanner(System.in);
        int num = inout.nextInt();

        System.out.print(a);
        System.out.print(" " + b);
        for (int i = 1; i<= num-2; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}

