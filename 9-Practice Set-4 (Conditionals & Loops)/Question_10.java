
//Question-10: Calculate Average Marks.

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");

        int n = input.nextInt();

        int[] array = new int[n];

        double avg=0;

        System.out.println("Enter marks: ");

        for(int i=0; i<n ;i++)
        {
            array[i] = input.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            avg = avg + array[i];
        }

        System.out.print("Average of (");

        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+",");
        }
        System.out.println( ") = " + avg/n);
    }
}
