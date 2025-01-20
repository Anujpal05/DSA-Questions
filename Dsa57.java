import java.util.*;
// You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

public class Dsa57 {

    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> majElement = new ArrayList<>();
        Map<Integer, Integer> numsMap = new HashMap<>();

        int n = nums.length;
        double limit = n / 3.0;

        for (int i = 0; i < n; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : numsMap.keySet()) {
            if (numsMap.get(key) > limit) {
                majElement.add(key);
            }
        }

        Collections.sort(majElement);

        return majElement;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
        List<Integer> list = findMajority(nums);
        for (Integer item : list) {
            System.out.print(item + "  ");
        }
    }
}
