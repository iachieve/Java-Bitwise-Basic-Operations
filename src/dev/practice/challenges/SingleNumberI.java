package dev.practice.challenges;

/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

    Example 1:
    Input: nums = [2,2,1]
    Output: 1
    Example 2:

    Input: nums = [4,1,2,1,2]
    Output: 4
    Example 3:

    Input: nums = [1]
    Output: 1

    Each element in the array appears twice except for one element which appears only once.
* */
public class SingleNumberI {
    public static void main(String[] args) {

    }

    /*
    * concepts:
    * 1- if we XOR of zero and some bit, it will return that bit
    * a ^ 0 = a;
    *
    * 2- If we take XOR of two same bits, it will return 0
    * a ^ a = 0;
    *
    * a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
    * */
    public static int SingleNumberI(int[] nums){
        int a = 0;
        for(int i  : nums) a ^= i;
        return a;
    }
}
