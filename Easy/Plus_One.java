/**********************************************************************************
 * Source - https://leetcode.com/problems/plus-one/
 * Description
    * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
    * The digits are stored such that the most significant digit is at the head of the list,
        and each element in the array contains a single digit.
    * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * Examples
    * Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
    * Example 2:
        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
    * Example 3:
        Input: digits = [0]
        Output: [1]
 ***********************************************************************************/
package Easy_1;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9, 9};
        digits = plusOne2(digits);
        for (int digit : digits) {
            System.out.println(digit);
        }
    }

    public static int[] plusOne(int[] digits) {
        boolean flag = false;
        int extra = 0;
        int lastDigit = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (lastDigit >= 10) {
                int head = lastDigit / 10;
                int tail = lastDigit % 10;
                digits[i] = tail;
                if (i == 0) {
                    extra = head;
                    flag = true;
                    break;
                } else {
                    digits[i - 1] += head;
                }
                lastDigit = digits[i - 1];
            } else {
                digits[i] = lastDigit;
                break;
            }
        }

        if (flag) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = extra;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }

    // Better
    public static int[] plusOne2(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
