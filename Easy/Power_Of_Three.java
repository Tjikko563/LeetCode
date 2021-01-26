/**********************************************************************************
 * Source - https://leetcode.com/problems/power-of-three/
 * Description
    * Given an integer n, return true if it is a power of three. Otherwise, return false.
    * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * Examples
    * Example 1:
        Input: n = 27
        Output: true
    * Example 2:
        Input: n = 0
        Output: false
    * Example 3:
        Input: n = 9
        Output: true
    * Example 4:
        Input: n = 45
        Output: false
 ***********************************************************************************/
package Easy_1;

public class Power_Of_Three {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
