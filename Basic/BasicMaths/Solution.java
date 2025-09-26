package BasicMaths;

import java.util.Arrays;

public class Solution {
    public int maxFrequency(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        long sum = 0;
        int left = 0, res = 1;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left++];
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 4};
        int k = 5;
        int result = sol.maxFrequency(nums, k);
        System.out.println("Maximum frequency: " + result); // 
    }
}