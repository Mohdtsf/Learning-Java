import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int rev = 0;

        while (num >0){
            int rem = num % 10;
            num /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reverse of the number is: " + rev);
    }
}
