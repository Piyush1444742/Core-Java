//Celsius to Fahrenheit

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        System.out.println("Temperature inn celsius");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int Fahrenheit = (9 * temp)/5 + 32 ;
        System.out.println("The Celsius to Fahrenheit temperature is "+ Fahrenheit);
    }
}
