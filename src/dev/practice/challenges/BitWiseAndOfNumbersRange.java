package dev.practice.challenges;


/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: [5,7]
Output: 4
Example 2:

Input: [0,1]
Output: 0
 */
public class BitWiseAndOfNumbersRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
        System.out.println(rangeBitwiseAnd(0, 1));
    }

    public static int rangeBitwiseAnd(int m, int n) {
        // If m=n then all the bits are same so and operation will not make any change.
        // Also if m=0 then and operation will produce 0 so we return m i.e. 0 for that case also
        if (m == n || m == 0) {
            return m;
        }

        // Here is the trick we right shift both m and n until both the numbers become equal.
        // Because if m and n are not equal then the rightmost bit between numbers from m to n will have 0 for at least on case.
        // For example if m=5 and n =6 then the rightmost bit in 6 will be 0.
        // If m=3 and n =9 then all the even numbers between 3 and 9 will have 0 in the right most bit yielding 0 in the rightmost bit in that position.
        // We can right shift both m and until they are equal and keep count of how many bits are right shifted.
        int count = 0;
        while (m != n) {
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        // Now we found m and n are equal so the and operation between them will yield same value.
        // But we have omitted all the right bits.
        // So to recover the lost right bits after m we left shift m by the count i.e. the amount of right shifts done and return the result
        return m << count;
    }
}
