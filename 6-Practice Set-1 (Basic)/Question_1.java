
//Question-1: Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = input.nextInt();

        if((year % 4==0 && year % 100 != 0)|| year % 400 == 0){
            System.out.println(year + " is a Leap year");
        }else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
