
public class Dsa51 {
    public static boolean canJump(int[] nums) {
        int farsest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farsest) {
                return false;
            }

            farsest = Math.max(farsest, i + nums[i]);

            if (farsest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(nums));
    }
}
