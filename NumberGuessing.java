import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class NumberGuessing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class NumberGuessing
{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number 1-10.");


        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        

        for (int i=1; i <= n; i++) {
            System.out.println("I " + i + " times love CS!");
        }


        reader.close();
    }
}
