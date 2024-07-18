
//Question-9: Calculate Batting Average.

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int runs, matches, notout;
        System.out.print("Enter the run of the batsman: ");
        runs = input.nextInt();
        System.out.print("Enter the number of the matches batsman played: ");
        matches = input.nextInt();
        System.out.print("Enter the number of matches batsman remained notout: ");
        notout = input.nextInt();

        int out = matches - notout;

        int avg = (runs) / out;
        if (avg <= 0 || out <= 0) {
            System.out.print("Not Available");
        } else {
            System.out.print("The batting average of the batsman is: " + avg);
        }
    }
}
