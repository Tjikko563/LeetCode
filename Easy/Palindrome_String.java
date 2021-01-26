/**********************************************************************************
 * Source - https://leetcode.com/problems/valid-palindrome/
 * Description
    * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * Examples
    * Example 1:
        Input: "A man, a plan, a canal: Panama"
        Output: true
    * Example 2:
        Input: "race a car"
        Output: false
 ***********************************************************************************/
package Easy_1;

public class Palindrome_String {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        return s.equals(String.valueOf(new StringBuilder(s).reverse()));
    }
}
