import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

/**
 * Write a description of class NumberGuessing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class NumberGuessing
{
    public static void main(String[] args) {
        int n = 0;
        Random rand = new Random();
        int secret = rand.nextInt(10) + 1;

        Scanner reader = new Scanner(System.in);  
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number 1-10.");

        while (n != secret) {
            System.out.print("Enter a number: ");
            try {
                n = reader.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("INVALID INPUT, YOU KNOW BETTER THAN THAT");
                System.out.print("Enter a number: ");
                n = reader.nextInt();
            }
            
            if (n != secret) {
                System.out.println("WRONG");
            }
        }
        

        
        System.out.println("Good job you win. The number was " + secret);


        reader.close();
    }
}
