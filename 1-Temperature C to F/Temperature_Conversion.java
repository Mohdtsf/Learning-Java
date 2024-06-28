import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] arg){
        System.out.print("Enter the Temperature in Celcius: ");
        Scanner input = new Scanner(System.in);
        float Celsius = input.nextFloat();

        float Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("The converted temperature in Fahrenheit is: " + Fahrenheit);
    }
}