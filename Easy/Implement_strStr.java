/**********************************************************************************
 * Source - https://leetcode.com/problems/implement-strstr/
 * Description
    * Implement strStr().
    * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Clarification
    * What should we return when needle is an empty string? This is a great question to ask during an interview.
    * For the purpose of this problem, we will return 0 when needle is an empty string.
    * This is consistent to C's strstr() and Java's indexOf().
 * Examples
    * Example 1:
        Input: x = 4
        Output: 2
    * Example 2:
        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 ***********************************************************************************/
package Easy_1;

public class Implement_strStr {
    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
