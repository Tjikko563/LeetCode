/**********************************************************************************
 * Source - https://leetcode.com/problems/maximum-subarray/
 * Description
    * Given an integer array nums, find the contiguous subarray (containing at least one number)
        which has the largest sum and return its sum.
 * Examples
    * Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
    * Example 2:
        Input: nums = [1]
        Output: 1
    * Example 3:
        Input: nums = [0]
        Output: 0
    * Example 4:
        Input: nums = [-1]
        Output: -1
 ***********************************************************************************/
package Easy_1;

public class Maximum_Subarray {
    private static int a = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray2(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // Better
    public static int maxSubArray2(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
