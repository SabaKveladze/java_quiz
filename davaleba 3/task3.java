import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Task 1
            logger.info("Program started.");

            // Task 2
            int num1 = getIntegerInput(scanner, "Enter the first integer:");
            int num2 = getIntegerInput(scanner, "Enter the second integer:");
            logger.info("Square of " + num1 + ": " + num1 * num1);
            logger.info("Square of " + num2 + ": " + num2 * num2);

            // Task 4
            num1 = getIntegerInput(scanner, "Enter the first integer:");
            num2 = getIntegerInput(scanner, "Enter the second integer:");
            if (num2 == 0) {
                logger.error("Division by zero is not allowed.");
            } else {
                logger.info("Division of " + num1 + " by " + num2 + ": " + ((double) num1 / num2));
            }

            // Task 6
            int age = getAgeInput(scanner);
            logger.info("Entered age: " + age);

            // Task 9
            logger.info("Enter a text type value:");
            String text = scanner.next();
            try {
                int intValue = Integer.parseInt(text);
                logger.info("Converted integer value: " + intValue);
            } catch (NumberFormatException e) {
                logger.error("Cannot convert text to integer: " + text);
            }

            // Task 12-19
            int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                int randomNumber = random.nextInt(233) - 88; 
                if (randomNumber % 2 == 0) {
                    if (randomNumber < 0) {
                        randomNumber *= -1; // Task 15
                    } else {
                        randomNumber += 10; // Task 16
                    }
                } else {
                    if (randomNumber < 0) {
                        randomNumber *= -2; // Task 17
                    } else {
                        randomNumber -= 20; // Task 18
                    }
                }
                array[i] = randomNumber;
            }
            logger.info("Generated array: " + java.util.Arrays.toString(array));
        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
        } finally {
            // Task 11
            logger.info("Program completed.");
        }
    }

    private static int getIntegerInput(Scanner scanner, String message) {
        while (true) {
            try {
                logger.info(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                logger.error("Input must be an integer.");
                scanner.next(); 
            }
        }
    }

    private static int getAgeInput(Scanner scanner) {
        while (true) {
            int age = getIntegerInput(scanner, "Enter your age:");
            if (age < 0) {
                try {
                    throw new AgeNegativeException("Age must be positive");
                } catch (AgeNegativeException e) {
                    logger.error(e.getMessage());
                }
            } else {
                return age;
            }
        }
    }

    static class AgeNegativeException extends Exception {
        public AgeNegativeException(String message) {
            super(message);
        }
    }
}
