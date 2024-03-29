/**
 * Skeleton of a program that convertes temperature from Fahrenheit to Celsius
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //used to get user input

public class TempConverter
{
    public static void main( String[] args) {
        //variable declarations
        double f;
        double c;
        //enable user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Fahrenheit:  ");
        f = keys.nextDouble();  //converts keyboard input into a floating point number
        keys.close();  //close the keyboard scanner
        
        //temperature conversion
        c = 5.0/9.0 * (f-32.0);
        
        //output to user
        System.out.println("Your degrees in celsius is " + c +"" );
    }
}