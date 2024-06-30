import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number a: ");
        int a = input.nextInt();

        System.out.print("Enter the Second Number b: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("The sum of a + b is: " + sum);
    }
}
