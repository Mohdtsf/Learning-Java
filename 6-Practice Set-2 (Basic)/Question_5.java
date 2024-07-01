
//Question-5: Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = input.nextInt();
        System.out.print("Enter the number b: ");
        int b = input.nextInt();
        System.out.print("Enter the number c: ");
        int c = input.nextInt();

        if (a>b && a>c){
            System.out.println("The largest no. is: "+ a);
        } else if (b>a && b>c) {
            System.out.println("The largest no. is: "+ b);
        }else {
            System.out.println("The largest no. is: "+ c);
        }

    }
}
