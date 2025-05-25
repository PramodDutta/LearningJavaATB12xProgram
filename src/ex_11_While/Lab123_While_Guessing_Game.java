package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        //  n = 50
        // g = 80

        // We are going to use the logic building formula.
        // Step 1: Figure out the input output.
        // Step 2: Figure out the rough logic.
        // Step 3: Write the proper logic.
        // Step 4: Optimize.
        // Step 5: Error edge cases.

        Random random = new Random();
        int numberTOGuess = random.nextInt(100)+1;
//        System.out.println(numberTOGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;



        while(true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid token
                continue;
            }

             guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }




             if(guess < numberTOGuess){
                 System.out.println("Too low, try again");
             }else if(guess > numberTOGuess) {
                 System.out.println("Too high, try again");
             }
             else{
                 System.out.println("Correct! You guessed it in " + attempts + " attempts");
                 break;
             }
        }









    }
}
