import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Task 1
            logger.info("Task 1: Printing 'Hello world!' and its length");
            String helloWorld = "Hello world!";
            logger.info(helloWorld);
            logger.info("Length: " + helloWorld.length());

            // Task 2
            logger.info("Task 2: Concatenating two strings");
            String str1 = "Hello, ";
            String str2 = "world!";
            String combinedString = concatenateStrings(str1, str2);
            logger.info(combinedString);

            // Task 3
            logger.info("Task 3: Comparing two strings");
            String str3 = "Hello";
            String str4 = "World";
            logger.info(compareStrings(str3, str4));

            // Task 4
            logger.info("Task 4: Extracting first word from a multi-word text");
            String text = "This is a multi-word text";
            logger.info(getFirstWord(text));

            // Task 5
            logger.info("Task 5: Extracting third word from a multi-word text");
            logger.info(getWordAtIndex(text, 2));

            // Task 6
            logger.info("Task 6: Splitting a string into an array of words");
            String fruits = "apple,banana,orange";
            logger.info(Arrays.toString(splitString(fruits)));

            // Task 7
            logger.info("Task 7: Reversing a string");
            String reversedText = reverseString(text);
            logger.info(reversedText);

            // Task 8
            logger.info("Task 8: Converting string to uppercase");
            String upperCaseText = "hello world";
            printUpperCase(upperCaseText);

            // Task 9
            logger.info("Task 9: Converting string to lowercase");
            String lowerCaseText = "HELLO WORLD";
            printLowerCase(lowerCaseText);

            // Task 10
            logger.info("Task 10: Counting words in a text");
            String countText = "This is a sentence with five words";
            logger.info(countWords(countText));

            // Task 11
            logger.info("Task 11: Trimming whitespace from a text");
            String trimmedText = "    this is a text    ";
            logger.info(trimmedText.trim());

            // Task 12
            logger.info("Task 12: Replacing characters in a string");
            String replacedText = replaceCharacters("banana", 'a', '-');
            logger.info(replacedText);

            // Task 13:
            Map<String, Integer> ageMap = new HashMap<>();
            // Task 14
            logger.info("Task 14: Adding values to the map");
            ageMap.put("Giorgi", 16);
            ageMap.put("Vazha", 20);
            ageMap.put("Merabi", 30);
            ageMap.put("Nutsa", -21); 
            ageMap.put("Nika", 25);

            // Task 15
            logger.info("Task 15: Searching for Vazha's age");
            logger.info("Vazha's age: " + ageMap.get("Vazha"));

            // Task 16
            logger.info("Task 16: Printing map size");
            logger.info("Map size: " + ageMap.size());

            // Task 17
            logger.info("Task 17: Adding 1 to each member's age");
            for (String name : ageMap.keySet()) {
                ageMap.put(name, ageMap.get(name) + 1);
            }

            // Task 18
            logger.info("Task 18: Printing each person and their age");
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                logger.info(entry.getKey() + " - " + entry.getValue());
            }

            // Task 19
            logger.info("Task 19: Printing names with negative age");
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                if (entry.getValue() < 0) {
                    logger.info("Name: " + entry.getKey());
                }
            }

            // Task 20
            logger.info("Task 20: Removing persons with negative age and reprinting map");
            ageMap.entrySet().removeIf(entry -> entry.getValue() < 0);
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                logger.info(entry.getKey() + " - " + entry.getValue());
            }
        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
        }
    }

    private static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    private static String compareStrings(String str1, String str2) {
        return str1.equals(str2) ? "equals" : "not equals";
    }

    private static String getFirstWord(String text) {
        return text.split(" ")[0];
    }

    private static String getWordAtIndex(String text, int index) {
        String[] words = text.split(" ");
        if (index >= 0 && index < words.length) {
            return words[index];
        }
        return "";
    }

    private static String[] splitString(String text) {
        return text.split(",");
    }

    private static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    private static void printUpperCase(String text) {
        logger.info(text.toUpperCase());
    }

    private static void printLowerCase(String text) {
        logger.info(text.toLowerCase());
    }

    private static int countWords(String text) {
        return text.split("\\s+").length;
    }

    private static String replaceCharacters(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }
}
