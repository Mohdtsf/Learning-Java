
//Question-7: Calculate Depreciation of Value.

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        long amount,deppercent,year,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = input.nextLong();
        System.out.print("Enter Depreciation percentage: ");
        deppercent = input.nextLong();
        System.out.print("Enter  number of years: ");
        year = input.nextLong();
        temp = amount;
        for(int i=0;i<year;i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        System.out.println("After depreciation = " + temp);
    }
}
