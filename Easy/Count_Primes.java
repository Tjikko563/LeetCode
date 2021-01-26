/**********************************************************************************
 * Source - https://leetcode.com/problems/count-primes/
 * Description
    * Count the number of prime numbers less than a non-negative number, n.
 * Examples
    * Example 1:
        Input: n = 10
        Output: 4
        Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
    * Example 2:
        Input: n = 0
        Output: 0
    * Example 3:
        Input: n = 1
        Output: 0
 ***********************************************************************************/
package Easy_1;

public class Count_Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes2(100));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        int numRoot = (int) Math.sqrt(num);
        for (int i = 2; i <= numRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Better
    public static int countPrimes2(int n) {
        int count = 0;
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i])
                count++;
        }
        return count;
    }
}
