/*Task 4: Advanced Array Operations
a)  Implement a method SliceArray that takes an array, a starting index, and an end index, then 
returns a new array containing the elements from the start to the end index.
b) Create a recursive function to find the nth element of a Fibonacci sequence and 
store the first n elements in an array. */

import java.util.Arrays;

public class dayT5 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 2;
        int end = 6;
        int[] slicedArray = sliceArray(originalArray, start, end);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sliced Array from index " + start + " to " + end + ": " + Arrays.toString(slicedArray));

        int n = 10;
        int[] fibonacciArray = new int[n];
        generateFibonacciSequence(fibonacciArray, n);
        System.out.println("First " + n + " elements of Fibonacci sequence: " + Arrays.toString(fibonacciArray));
    }

    public static int[] sliceArray(int[] array, int start, int end) {
        if (start < 0 || end > array.length || start > end) {
            throw new IllegalArgumentException("Invalid start or end index.");
        }
        int[] slicedArray = new int[end - start];
        for (int i = start; i < end; i++) {
            slicedArray[i - start] = array[i];
        }
        return slicedArray;
    }

    public static void generateFibonacciSequence(int[] array, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Invalid value for n.");
        }
        for (int i = 0; i < n; i++) {
            array[i] = fibonacci(i);
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
