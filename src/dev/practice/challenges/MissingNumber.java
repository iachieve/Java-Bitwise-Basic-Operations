package dev.practice.challenges;

/*
    Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.

    Follow up: Could you implement a solution using only O(1) extra space complexity
    and O(n) runtime complexity?

    Example 1:

    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
     2 is the missing number in the range since it does not appear in nums.
    Example 2:

    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
     2 is the missing number in the range since it does not appear in nums.
    Example 3:

    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
     8 is the missing number in the range since it does not appear in nums.
    Example 4:

    Input: nums = [0]
    Output: 1
    Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1].
    1 is the missing number in the range since it does not appear in nums.


    solution using bit manipulation
        we initialize an integer to n and XOR it with every index and value, we will be left with the missing number.
        Consider the following example (the values have been sorted for intuitive convenience, but need not be):


    Index	0	1	2	3
    Value	0	1	3	4
    missing     = 4 ^ (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 3) ^ (3 ^ 4)
                = (4 ^ 4) ^ (0 ^ 0) ^ (1 ^ 1) ^ (3 ^ 3)  &^ 2
                = 0 ^ 0 ^ 0 ^ 0 ^ 2
                = 2
missing


=4∧(0∧0)∧(1∧1)∧(2∧3)∧(3∧4)
=(4∧4)∧(0∧0)∧(1∧1)∧(3∧3)∧2
=0∧0∧0∧0∧2
=2
​






*/
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{94, 96, 97}));
        // System.out.println(missingNumber(new int[]{0, 1}));
        // System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        // System.out.println(missingNumber(new int[]{0}));
    }
    public static int missingNumber(int[] nums) {
        int missing = 0;
        System.out.println(missing);
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^nums[i];
            System.out.println(missing);
        }
        return missing;
    }
}
