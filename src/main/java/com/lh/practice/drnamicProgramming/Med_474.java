package com.lh.practice.drnamicProgramming;


import com.lh.practice.utils.TestUtils;

public class Med_474 {


  public static int findMaxForm(String[] strs, int m, int n) {
    int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
    int idx = 1;
    for (String str : strs) {
      int[] cnt = countZeroAndOne(str);
      int zeros = cnt[0];
      int ones = cnt[1];
      for (int zero = 0; zero <= m; zero++) {
        for (int one = 0; one <= n; one++) {
          dp[idx][zero][one] = dp[idx - 1][zero][one];
          if (zero >= zeros && one >= ones) {
            dp[idx][zero][one] = Math.max(dp[idx - 1][zero][one], dp[idx - 1][zero - zeros][one - ones] + 1);
          }
        }
      }
      idx++;
    }
    return dp[strs.length][m][n];
  }

  private static int[] countZeroAndOne(String str) {
    int[] cnt = new int[2];
    for (char c : str.toCharArray()) {
      cnt[c - '0']++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    TestUtils.assertEquals(findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3), 4);
    TestUtils.assertEquals(findMaxForm(
        new String[]{"011", "1", "11", "0", "010", "1", "10", "1", "1", "0", "0", "0", "01111", "011", "11", "00", "11",
                     "10", "1", "0", "0", "0", "0", "101", "001110", "1", "0", "1", "0", "0", "10", "00100", "0", "10",
                     "1", "1", "1", "011", "11", "11", "10", "10", "0000", "01", "1", "10", "0"}, 44, 39), 45);
  }
}
