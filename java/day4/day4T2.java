/*
 * Day 4:
Task 1: Array Sorting and Searching
a) Implement a function called BruteForceSort that sorts an array using the brute force approach. 
Use this function to sort an array created with InitializeArray.
b) Write a function named PerformLinearSearch that searches for a specific element in an array and
returns the index of the element if found or -1 if not found.
 */
import java.util.Arrays;

public class day4T2{
    public static void main(String[] args) {
        int[] array = initializeArray(10);
        System.out.println("Original array: " + Arrays.toString(array));
        bruteForceSort(array);
        System.out.println("Sorted array using Brute Force Sort: " + Arrays.toString(array));

        int elementToSearch = 7;
        int index = performLinearSearch(array, elementToSearch);
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array");
        }
    }

    public static void bruteForceSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int performLinearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}

