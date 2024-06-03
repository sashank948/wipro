/*Task 2: Two-Sum Problem
a) Given an array of integers, write a program that finds if there are two numbers that add up to a specific target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice. 
 Optimize the solution for time complexity. */


 import java.util.*;

public class day4T3 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null; 
    }
}

