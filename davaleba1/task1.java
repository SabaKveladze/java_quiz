class Operation {
    // Method 1
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method 2
    public static int difference(int a, int b) {
        return a - b;
    }

    // Method 3
    public static int product(int a, int b) {
        return a * b;
    }

    // Method 4
    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 4
        int[] array = {14, 88, -8, 109, 44, 1488, -55, 321, 74, 99};

        // Task 5
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Task 6
        multiplyElementsByIndex(array);

        // Task 7
        int sumOfElements = sumOfArrayElements(array);
        System.out.println("Sum of elements in each member: " + sumOfElements);

        // Task 9
        System.out.println("Odd elements:");
        printOddElements(array);

        // Task 10
        System.out.println("Even elements:");
        printEvenElements(array);

        // Task 11
        System.out.println("Values at odd indices:");
        printValuesAtOddIndices(array);

        // Task 12
        System.out.println("Values at even indices:");
        printValuesAtEvenIndices(array);
    }

    // Task 6
    public static void multiplyElementsByIndex(int[] array) {
        System.out.println("Multiplication of each member by its index:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * i);
        }
    }

    // Task 7
    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Task 9
    public static void printOddElements(int[] array) {
        System.out.println("Odd elements:");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Task 10
    public static void printEvenElements(int[] array) {
        System.out.println("Even elements:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Task 11
    public static void printValuesAtOddIndices(int[] array) {
        System.out.println("Values at odd indices:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Task 12
    public static void printValuesAtEvenIndices(int[] array) {
        System.out.println("Values at even indices:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
