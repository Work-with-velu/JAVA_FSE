import java.util.Random;
import java.util.Scanner;

public class NumberGuessing_Game 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;
        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
        }

        input.close();
    }
}
