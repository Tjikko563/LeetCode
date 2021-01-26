/**********************************************************************************
 * Source - https://leetcode.com/problems/length-of-last-word/
 * Description
    * Given a string s consists of some words separated by spaces, return the length of the last word in the string.
    * If the last word does not exist, return 0.
    * A word is a maximal substring consisting of non-space characters only.
 * Examples
    * Example 1:
        Input: s = "Hello World"
        Output: 5
    * Example 2:
        Input: s = " "
        Output: 0
 ***********************************************************************************/
package Easy_1;

public class Length_Of_Last_Word {
    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {
                return length;
            }
        }
        return length;
    }
}
