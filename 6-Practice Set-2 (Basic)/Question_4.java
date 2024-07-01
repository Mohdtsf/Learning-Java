
//Question-4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the first number: ");
        int b = input.nextInt();
        int ans = 0;
        System.out.println("Enter the Operation\nAddition: +\nSubtraction: -\nMultiplication: *\nDivision: /\nExit: x");
        char c = input.next().charAt(0);
        while (true) {
            if (c == '+') {
                ans = a + b;
            } else if (c == '-') {
                ans = a - b;
            } else if (c == '*') {
                ans = a * b;
            } else if (c == '/') {
                if (b == 0) {
                    System.out.println("Value will be undefined");
                } else {
                    ans = a / b;
                }
            } else {
                if (c == 'x') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
            }
            System.out.println("Your Answer is: "+ ans);
            break;
        }
    }
}
