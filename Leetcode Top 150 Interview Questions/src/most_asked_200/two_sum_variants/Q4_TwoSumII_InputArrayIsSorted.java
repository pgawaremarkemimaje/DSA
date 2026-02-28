package most_asked_200.two_sum_variants;

import java.util.Arrays;

public class Q4_TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j =  nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target)
                i++;
            else if (sum > target)
                j--;
            else
                return new int[]{i + 1, j + 1};
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
