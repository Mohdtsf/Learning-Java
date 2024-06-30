
//Question_5: Keep taking numbers as inputs till the user enters ‘0’, after that print sum of all.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
        System.out.print("Enter the number and enter '0' to exit to get the sum: ");
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
