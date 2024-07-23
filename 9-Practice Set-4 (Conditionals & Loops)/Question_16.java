
//Question-16: Java Program Vowel Or Consonant.

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = input.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
