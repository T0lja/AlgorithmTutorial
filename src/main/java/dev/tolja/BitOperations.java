package dev.tolja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BitOperations {
    /*
    Given an integer, adjust if it's a power of 2. Date 9.5
     */
    public static boolean isPowerOfTwo(int a) {
        return (a & (a - 1)) == 0;
    }

    /*
    Hamming Weight. Date 9.5
     */
    public static int hammingWeight(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a &= (a - 1);
        }
        return count;
    }

    /*
    Given an array of integers,find out the only element that never appear twice. Date 9.5
     */
    public static int findSingle(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
