package dev.tolja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicProgramming {
    /*
    === Test Data for ArraySolution ===
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    List<List<Integer>> triangleData = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
     */

    /*
    You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. How many distinct ways can you reach the top? Note that n is a positive integer.Date 8.30
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    /*
    Given an integer array nums, you need to find a contiguous subarray (containing at least one element) with the largest sum and return the maximum sum.Date 8.30
     */
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    /*
    Given an unordered array of integers, find the length of the longest increasing subsequence.Date 8.30
     */
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    /*
    Given a Triangle array, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.Date 8.30
     */
    public static int minPathSumTriangle(List<List<Integer>> triangle) {
        int rows = triangle.size();

        int[][] dp = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp[i][j] = row.get(j);
            }
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = dp[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        return dp[0][0];
    }
}


