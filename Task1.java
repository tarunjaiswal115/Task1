import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            int number = 0;
            boolean ans = false;

            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; 


            System.out.println("Guess a number between 1 and 100:");
            int attempts = 0; 
            int maxAttempts = 3;

            while (!ans && attempts < maxAttempts)
             {
                number = scanner.nextInt();
                attempts++;

                if (number < 1 || number > 100)
                 {
                    System.out.println("Please enter a valid number between 1 and 100.");
                    attempts--;
                } 
                else if (number < randomNumber) 
                {
                    System.out.println("Too low! Try again:");
                } 
                else if (number > randomNumber) 
                {
                    System.out.println("Too high! Try again:");
                } 
                else 
                {
                    ans = true;
                    System.out.println("Congratulations! You guessed the number: " + randomNumber);
                }
                if (!ans && attempts < maxAttempts) 
                {
                    System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
                }
            }

            if (!ans)
             {
                System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");

        }
         while (playAgain);
        System.out.println("Thanks for playing!");
    }
}
