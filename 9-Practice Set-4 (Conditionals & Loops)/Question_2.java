
//Question-2: Calculate Electricity Bill.


import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the electricity units used: ");
        int units = input.nextInt();

        double billToPay = 0;
        if(units < 200)
        {
            billToPay = 0;
        }
        else if(units > 200 && units<400){
            billToPay = 200 * 3 + (units - 200) * 4.5;
        }
        else if(units > 400 && units<800)
        {
            billToPay = 200 * 3 + 200 * 4.5 + (units - 400) * 6.5;
        }
        else if(units > 800 && units<1200)
        {
            billToPay = 200 * 3 + 200 * 4.5 + 400 * 6.5 + (units - 800) * 7;
        }
        else if(units > 1200)
        {
            billToPay =  200 * 3 + 200 * 4.5 + 400 * 6.5 + 400 * 7 + (units - 800) * 8;
        }
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);
    }
}
