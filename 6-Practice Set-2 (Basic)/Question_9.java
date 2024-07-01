
//Question-9: To find Armstrong Number between two given number.

import java.util.Scanner;
public class Question_9 {
    public static void main(String args[]){
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = input.nextInt();
        System.out.println("Enter the second number ::");
        num2 = input.nextInt();
        System.out.println("Armstrong numbers between "+ num1 + " and " + num2 + " are : ");
        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}