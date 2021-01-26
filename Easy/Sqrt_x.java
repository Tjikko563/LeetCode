/**********************************************************************************
 * Source - https://leetcode.com/problems/sqrtx/
 * Description
    * Given a non-negative integer x, compute and return the square root of x.
    * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
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

public class Sqrt_x {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
