/**********************************************************************************
 * Source - https://leetcode.com/problems/merge-sorted-array/
 * Description
    * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    * The number of elements initialized in nums1 and nums2 are m and n respectively.
    * You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 * Examples
    * Example 1:
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
    * Example 2:
        Input: nums1 = [1], m = 1, nums2 = [], n = 0
        Output: [1]
 ***********************************************************************************/
package Easy_1;

import java.util.Arrays;

public class Merge_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[count++];
        }
        Arrays.sort(nums1);
    }
}
