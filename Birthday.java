/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int m;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("What month were you born in hmm? I wont tell anyone, pinkie promise");  //prompt the user for a birth month
        m = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (m == 1){
            System.out.println("Alright you were born in a month with 31 days");}
        else if (m == 2){
            System.out.println("You were born in the month with 29 days huh? Thats small boomer energy");}
        else if (m == 3){
            System.out.println("March huh? I feel like you learned this at school, but it has 31 days");}
        else if (m == 4){
            System.out.println("It has 31 days, Ha got you, it has 30 days");}
        else if (m == 5){
            System.out.println("May, nothing special that i know, except that it has 31 days");}
        else if (m == 6){
            System.out.println("June has 30 days, very cool i know");}
        else if (m == 7){
            System.out.println("You got big boomer energy cause this month has 31 days and legal fireworks");}
        else if (m == 8){
            System.out.println("This month kinda sucks, the 31 days though");}
        else if (m == 9){
            System.out.println("This month has 30 days, i don't got anything on his one");}
        else if (m == 10){
            System.out.println("BOOOOOOO, OwO, this month has 31 days");}
        else if (m == 11){
            System.out.println("I was born on one of the 31 days of this month");}
        else if (m == 12){
            System.out.println("Merry Christmas, this is actually my favorite month with 31 days");}
        //output the result to the user
        System.out.println("I know when you were born now, fear me");
    }
}