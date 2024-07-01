
//Question_2: Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
