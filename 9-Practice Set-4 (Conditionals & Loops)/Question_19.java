
//Question-19: You are allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days you can go out in the month.

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month name: ");
        String month = input.nextLine();
        int i=1;
        int count = 0;
        while(i<=30){
            if(i%2==0){
                count++;
            }
            i++;
        }
        System.out.println("Number of days you can go out in a month is: " + count);
    }
}
