package com.lh.practice.leetcode.drnamicProgramming;


import com.lh.practice.utils.TestUtils;

public class Med_300 {

  public static int lengthOfLIS(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums.length;
    }
    int maxLen = 1;
    int preMin = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int start = nums[i];
      if (start > preMin){
        continue;
      }
      int len = 1;
      preMin = Math.min(start,preMin);
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] > start) {
          return len + maxLength(j, nums, start);
        }
      }
      maxLen = Math.max(len, maxLen);
    }
    return maxLen;
  }

  private static int maxLength(int startIdx, int[] nums, int currentNum) {
    if (startIdx >= nums.length) {
      return 0;
    }
    for (int i = startIdx; i < nums.length; i++) {
      if (nums[i] > currentNum) {
        return Math.max(maxLength(i+ 1, nums, nums[i]) + 1, maxLength(i+ 1, nums, currentNum));
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    TestUtils.assertEquals(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}), 4);
    TestUtils.assertEquals(lengthOfLIS(new int[]{10,9,2,5,3,4}), 3);
    TestUtils.assertEquals(lengthOfLIS(new int[]{3,4,5,6,2,4}), 4);

  }
}
