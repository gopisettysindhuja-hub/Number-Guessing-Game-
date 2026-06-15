import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = 50; // Fixed number for testing
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too Low!");
            } else if (guess > target) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct!");
            }

        } while (guess != target);

        System.out.println("Attempts Taken: " + attempts);

        sc.close();
    }
}