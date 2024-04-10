import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Task 1
            int[] fibonacciArray = generateFibonacciArray(100);
            // Task 2
            printFibonacciArray(fibonacciArray);

            // Task 6
            int magicNumber = generateMagicNumber();
            logger.info("Magic number: " + magicNumber);

            // Task 7-14
            playGuessingGame(magicNumber);

        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
        }
    }

    private static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }

    private static void printFibonacciArray(int[] array) {
        logger.info("Printing Fibonacci sequence:");
        for (int num : array) {
            logger.info(num);
        }
    }

    private static int getNthFibonacciTerm(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    private static int generateMagicNumber() {
        Random random = new Random();
        return random.nextInt(1475) + 14;
    }

    private static void playGuessingGame(int magicNumber) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean guessed = false;

        do {
            logger.info("Guess the magic number (between 14 and 1488):");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < magicNumber) {
                logger.info("Too low!");
            } else if (guess > magicNumber) {
                logger.info("Too high!");
            } else {
                guessed = true;
                logger.info("Congratulations! You guessed the magic number: " + magicNumber);
                logger.info("Number of attempts: " + attempts);
            }
        } while (!guessed);

        logger.info("Would you like to play again? (y/n)");
        String choice = scanner.next().toLowerCase();
        if (choice.equals("y") || choice.equals("yes")) {
            playGuessingGame(generateMagicNumber());
        } else if (choice.equals("n") || choice.equals("no")) {
            logger.info("Thank you for playing! Goodbye.");
        } else {
            logger.info("Incorrect text. Ending the game.");
        }
    }
}
