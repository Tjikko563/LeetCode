/**********************************************************************************
 * Source - https://leetcode.com/problems/reverse-integer/
 * Description
    * Given a signed 32-bit integer x, return x with its digits reversed.
    * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
    * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Examples
    * Example 1:
        Input: x = 123
        Output: 321
    * Example 2:
        Input: x = -123
        Output: -321
    * Example 3:
        Input: x = 120
        Output: 21
***********************************************************************************/

package Easy_1;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x = 120;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if (x < 0) {
            x *= -1;
            flag = true;
        }

        int currentDigit = x % 10;
        while (x != 0) {
            sb.append(currentDigit);
            x = x / 10;
            currentDigit = x % 10;
        }

        int num = 0;
        try {
            num = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return num;
        }

        if (flag) {
            num *= -1;
        }
        return num;
    }
}

    /*StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (x < 0) {
        sb.replace(0, 1, "");
        sb.reverse();
        try {
        return Integer.parseInt(sb.toString()) * -1;
        } catch (Exception e) {
        return 0;
        }

        }
        sb.reverse();
        try {
        return Integer.parseInt(sb.toString());
        } catch (Exception e) {
        return 0;
        }*/
