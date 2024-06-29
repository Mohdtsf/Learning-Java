import java.util.Scanner;

public class Counting_Occurrences {
    public static void main(String[] args) {
        System.out.println(" Enter the number to find the occurrences: ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        System.out.println(" Enter the number to you want to find: ");
        int n = input.nextInt();
        int count = 0;

        while(num>0){
            long rem = num%10;
            if (rem == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(" The given number " + n + " occurred " + count + " times");
    }
}
