/**********************************************************************************
 * Source - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Description
    * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
    * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Examples
    * Example 1:
        Input: nums = [1,1,2]
        Output: 2, nums = [1,2]
        Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
            It doesn't matter what you leave beyond the returned length.
    * Example 2:
        Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4]
        Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3,
            and 4 respectively. It doesn't matter what values are set beyond the returned length.
 ***********************************************************************************/
package Easy_1;

public class Remove_Duplicates_From_Array {
    public static void main(String[] args) {
        int[] nums = {1};

        int len = removeDuplicates(nums);

        // any modification to nums in your function would be known by the caller.
        // using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int next = nums[i + 1];
            int current = nums[i];
            if (current != next) {
                nums[count] = current;
                count++;
            }
        }
        nums[count] = nums[nums.length - 1];
        return count + 1;
    }
}
