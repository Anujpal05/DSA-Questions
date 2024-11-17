import java.util.Arrays;

public class Dsa30 {
    public int threeSumClosest(int[] nums , int target){
        int add = 0;
        Arrays.sort(nums);
        int minSum = target;

        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int[] minArray = new int[3];
                if(sum == target){
                    minSum = target;
                    return minSum;
                }else if(sum < minSum){
                    if(minSum < sum)
                    left ++;
                }


            }
        }
        
        return add;
    }
    public static void main(String[] args) {
        
    }
}
