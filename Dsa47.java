// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,8,10], target = 8
// Output: [3,4]

import java.util.ArrayList;
import java.util.List;

public class Dsa47 {
    public static int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        boolean prev = false;
        boolean next = false;
        int[] numsArray = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && prev == false) {
                numsArray[0] = i;
                prev = true;
            } else if (nums[i] == target && prev == true) {
                numsArray[1] = i;
            }
        }

        if (numsArray[0] != -1 && numsArray[1] == -1) {
            numsArray[1] = numsArray[0];
        }

        return numsArray;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 10 };
        int target = 8;
        int[] searchTarget = searchRange(nums, target);
        for (int i : searchTarget) {
            System.out.println(i);
        }
    }
}
