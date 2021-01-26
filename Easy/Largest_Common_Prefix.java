/**********************************************************************************
 * Source - https://leetcode.com/problems/longest-common-prefix/
 * Description
    * Write a function to find the longest common prefix string amongst an array of strings.
    * If there is no common prefix, return an empty string "".
 * Examples
    * Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
    * Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
 ***********************************************************************************/
package Easy_1;

public class Largest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix2(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char testChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                try {
                    char currentChar = strs[j].charAt(i);
                    if (currentChar != testChar) {
                        flag = false;
                    }
                } catch (Exception e) {
                    flag = false;
                }
            }
            if (flag) {
                sb.append(testChar);
            } else {
                break;
            }
        }

        return sb.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
