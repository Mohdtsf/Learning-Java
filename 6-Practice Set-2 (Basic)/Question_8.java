
//Question-8: To find out whether the given Number is Palindrome or not.

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, reversedNum = 0, remainder;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
            }
    }
}
