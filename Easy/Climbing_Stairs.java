/**********************************************************************************
 * Source - https://leetcode.com/problems/climbing-stairs/
 * Description
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Examples
    * Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two wrays to climb to the top.
            1. 1 step + 1 step
            2. 2 steps
    * Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
            1. 1 step + 1 step + 1 step
            2. 1 step + 2 steps
            3. 2 steps + 1 step
 ***********************************************************************************/
package Easy_1;

public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        int[] f = new int[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n + 1];
    }
}
