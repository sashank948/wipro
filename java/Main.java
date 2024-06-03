/*Implement a method that takes a List as an argument and removes every second element from the list, 
then prints the resulting list. */

import java.util.*;

public class Main {
    public static void removeEverySecondElement(List<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.remove(i);
        }
        System.out.println("Resulting list after removing every second element: " + list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeEverySecondElement(numbers);
    }
}


