/**********************************************************************************
 * Source - https://leetcode.com/problems/search-insert-position/
 * Description
    * Given a sorted array of distinct integers and a target value, return the index if the target is found.
    * If not, return the index where it would be if it were inserted in order.
 * Examples
    * Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2
    * Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1
    * Example 3:
        Input: nums = [1,3,5,6], target = 7
        Output: 4
    * Example 4:
        Input: nums = [1,3,5,6], target = 0
        Output: 0
    * Example 5:
        Input: nums = [1], target = 0
        Output: 0
 ***********************************************************************************/
package Easy_1;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target > nums[i]) {
                index = i + 1;
            }
        }
        return index;
    }
}
