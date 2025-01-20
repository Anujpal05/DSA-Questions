
//{ Driver Code Starts
import java.util.*;

public class Dsa56 {
    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> majElement = new ArrayList<>();
        int n = nums.length;
        double limit = n / 3.0;

        int prev = nums[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + " " + count);
            if (prev != nums[i]) {
                if (count > limit) {
                    System.out.println("true");
                    majElement.add(prev);
                }
                count = 0;
                prev = nums[i];
            } else {
                count++;
                prev = nums[i];
            }
        }

        return majElement;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
        List<Integer> list = findMajority(nums);
        System.out.println(list.toString());
    }
}
