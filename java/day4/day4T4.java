/*Task 3: Understanding Functions through Arrays
a) Write a recursive function named SumArray that calculates and 
returns the sum of elements in an array, demonstarte with example. */

public class day4T4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("Sum of the array elements: " + sum);
    }

    public static int sumArray(int[] array) {
        return sumArrayRecursive(array, 0);
    }

    private static int sumArrayRecursive(int[] array, int index) {
        if (index == array.length) {
            return 0; 
        }
        return array[index] + sumArrayRecursive(array, index + 1); 
    }
}
