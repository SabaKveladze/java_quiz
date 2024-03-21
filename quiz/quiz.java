import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] array1 = new int[10];
        
        // Task 2
        determineArrayValues(array1);
        
        // Task 3
        printArray(array1);
        
        // Task 4
        int[] array2 = new int[20];
        
        // Task 5
        determineRandomArrayValues(array2);
        
        // Task 7
        sortArray(array1);
        
        // Task 8
        double median = findMedian(array1);
        System.out.println("Median of Array 1: " + median);
        
        // Task 9
        int[][] matrix1 = {
            {4, 8, 19, 0},
            {-55, 934, 67, 1},
            {4, 7, 144, 88},
            {0, -123, -7, 1488}
        };
        
        // Task 10
        printMatrix(matrix1);
        
        // Task 11
        int sumOfMatrix1 = sumOfMatrix(matrix1);
        System.out.println("Sum of Matrix 1: " + sumOfMatrix1);
        
        // Task 12
        int[][] matrix2 = {
            {43, 81, 1, 10},
            {-5, 94, 7, 11},
            {43, 17, 14, 9},
            {-8, -13, 7, 1}
        };
        
        // Task 13
        printMatrixSum(matrix1, matrix2);
        
        // Task 14
        int upperDiagonalSum = sumOfUpperDiagonal(matrix1);
        System.out.println("Sum of Upper Diagonal: " + upperDiagonalSum);
        
        // Task 15
        int lowerDiagonalSum = sumOfLowerDiagonal(matrix1);
        System.out.println("Sum of Lower Diagonal: " + lowerDiagonalSum);
        
        // Task 16
        int diagonalSum = sumOfDiagonal(matrix1);
        System.out.println("Sum of Diagonal: " + diagonalSum);
    }
    
    // Task 2
    public static void determineArrayValues(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    
    // Task 3
    public static void printArray(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }
    
    // Task 5
    public static void determineRandomArrayValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(233) - 88; // Range from -88 to 144
        }
    }
    
    // Task 7
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
    
    // Task 8
    public static double findMedian(int[] array) {
        if (array.length % 2 == 0) {
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }
    
    // Task 10
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // Task 11
    public static int sumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
    
    // Task 13
    public static void printMatrixSum(int[][] matrix1, int[][] matrix2) {
        int sum1 = sumOfMatrix(matrix1);
        int sum2 = sumOfMatrix(matrix2);
        System.out.println("Sum of Matrices: " + (sum1 + sum2));
    }
    
    // Task 14
    public static int sumOfUpperDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    // Task 15
    public static int sumOfLowerDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    // Task 16
    public static int sumOfDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
