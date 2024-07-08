
//Question-20: Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        System.out.print("Enter the number and enter '0' to exit to get the largest number: ");
        while (true){
            int num = input.nextInt();
            if (num == 0){
                System.out.println("The largest number is: " + largest);
                break;
            }else if (num > largest){
                largest = num;
            }
        }
    }
}
