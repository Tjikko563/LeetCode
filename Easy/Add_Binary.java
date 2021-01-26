/**********************************************************************************
 * Source - https://leetcode.com/problems/add-binary/
 * Description
    * Given two binary strings a and b, return their sum as a binary string.
 * Examples
    * Example 1:
        Input: a = "11", b = "1"
        Output: "100"
    * Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101"
 ***********************************************************************************/
package Easy_1;

public class Add_Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        return Integer.toString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2), 2);
    }
}
