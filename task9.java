import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programmer: Arafath Ahmed");
        System.out.println("Capstone Project: " + new Date());
        System.out.println();
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        generateRandom();
    }

    public static void generateRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(11);
        guess(randomNum);
    }

    public static void guess(int randomNum) {
        Scanner in = new Scanner(System.in);
        // Welcome Message
        System.out.println("");
        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 0-10: ");
        int guess = in.nextInt();
        System.out.println("");

        while (guess < 0 || guess > 10) {
            System.out.print("Guess a number between 0-10: ");
            guess = in.nextInt();
            System.out.println("");
        }

        // try again until you guess the correct number
        int tries = 0;
        while (guess != randomNum) {
            tries++;
            System.out.println("Wrong Guess!");
            System.out.print("Guess again: ");
            guess = in.nextInt();
            System.out.println("");

            // input validation
            while (guess < 0 || guess > 10) {
                System.out.print("Guess a number between 0-10: ");
                guess = in.nextInt();
                System.out.println("");
            }
        }

        // Game Won
        System.out.println("Correct Answer. You Won!");
        System.out.println("Wrong Tries: " + tries);
        System.out.println("");

        // Play again or exit?
        System.out.println("Press 1 to Play again.");
        System.out.println("Press 0 to exit.");
        int choice = in.nextInt();

        if (choice == 1)
            generateRandom();
        else
            return;
    }
}
