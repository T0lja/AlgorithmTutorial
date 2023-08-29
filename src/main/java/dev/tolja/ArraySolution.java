package dev.tolja;

import java.util.*;

public class ArraySolution {
    /*
    === Test Data for ArraySolution ===
    int[] arr1 = {1,2,3,5,7,9};
    int[] arr2 = {1,2,2,3,4,5,6,6,7,10};
    int[] arr3 = {3,5,3,2,2,1,7,4};
    int[] arr4 = {6,3,4,1,5};
    int[] arr6 = {9,9,9};
    int k = 1;
    String[] arr5 = {"flower","flow","flight"};
    */

    /*
    Given two sorted arrays, find the intersection of the 2 arrays. Date 8.29
     */
    public static ArrayList<Integer> sortedArraysIntersection (int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0,j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    /*
    Given two unsorted arrays, find the intersection of the 2 arrays. Date 8.29
     */
    public static ArrayList<Integer> unsortedArraysIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result;
    }

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. Date 8.29
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num.containsKey(complement)) {
                return new int[]{num.get(complement), i};
            }
            num.put(nums[i], i);
        }

        return new int[0];
    }

    /*
    Given an array, find the element that appears twice. Date 8.29
     */
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }

    /*
    Given an array, find the longest common prefix. Date 8.29
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    /*
    The best time to buy and sell stocks. Date 8.29
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    /*
    Given an array,rotate the array to the right by k steps, where k is non-negative. Date 8.29
     */
    public static int[] rotateM1(int[] nums, int k) {//reverse
        int n = nums.length;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateM2(int[] nums, int k) { //extra array
        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        return rotated;
    }

    public static int[] rotateM3(int[] nums, int k) { //cyclic replacement
        int n = nums.length;
        k = k % n;

        int[] rotated = new int[n];
        int count = 0;

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }

        for (int i = 0; i < n; i++) {
            rotated[i] = nums[i];
        }

        return rotated;
    }

    /*
    Given an array, remove the duplicates in place such that each element appears only once and return the new length. Date 8.29
     */
    public static ArrayList<Integer> removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 1;
        result.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
                result.add(nums[i]);
            }
        }
        return result;
    }

    /*
    Given an array of an integer,add 1 to the last element and return the array. Date 8.29
     */
    public static int[] plusOne(int[] nums) {
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

}
