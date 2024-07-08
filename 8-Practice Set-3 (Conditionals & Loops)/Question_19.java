
//Question-19: Take integer inputs till the user enters 0 and print the sum of all numbers.

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number and enter '0' to exit to get the sum: ");
        while (true){
            int num = input.nextInt();
            if (num == 0){
                System.out.println("The sum is:" + sum);
                break;
            }else {
                sum += num;
            }
        }
    }
}
