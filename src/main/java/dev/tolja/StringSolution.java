package dev.tolja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringSolution {
    /*
    Given a string s, find the length of the longest substring without repeating characters. Date 8.29
     */
    public int LengthOfLongestSubstringM1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c))
                start = Math.max(map.get(c) + 1,start);
            max = Math.max(max, end - start + 1);
            map.put(c, end);
        }
        return max;
    }

    public int lengthOfLongestSubstringM2(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
