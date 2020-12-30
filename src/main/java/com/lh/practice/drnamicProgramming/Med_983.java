package com.lh.practice.drnamicProgramming;


import com.lh.practice.utils.TestUtils;

import java.util.HashMap;
import java.util.Map;

public class Med_983 {

  final static int[] dayArr = {1, 7, 30};

  public static int mincostTickets(int[] days, int[] costs) {
    int len = days.length;
    Map<Integer, Integer> records = new HashMap<>(len);
    return calculateTotalCost(days, 0, 0, costs, records);
  }

  private static int calculateTotalCost(int[] days, int start, int sum, int[] costs, Map<Integer, Integer> records) {
    if (start >= days.length) {
      return sum;
    }
    Integer min = records.get(start);
    if (min != null) {
      return min + sum;
    }
    min = Integer.MAX_VALUE;
    for (int i = 0; i < costs.length; i++) {
      int nextIdx = getNextIndex(days, start, dayArr[i]);
      int tempSum = nextIdx == -1 ? sum + costs[i] : calculateTotalCost(days, nextIdx, costs[i] + sum, costs, records);
      min = Math.min(tempSum, min);
    }
    records.put(start, min - sum);
    return min;
  }

  private static int getNextIndex(int[] days, int currentIndex, int plus) {
    int invalidDay = days[currentIndex] + plus;
    for (int i = currentIndex + 1; i < days.length; i++) {
      if (days[i] >= invalidDay) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int a = 128;
    Integer b = 128;
    Integer c = 128;
    System.out.println(a == b);
    System.out.println(b == c);
    Integer q = 88;
    Integer w = 88;
    System.out.println(q == w);

    TestUtils.assertEquals(mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}), 11);
    TestUtils.assertEquals(mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{7, 2, 15}), 6);
    TestUtils.assertEquals(
        mincostTickets(new int[]{1, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 27, 28},
                       new int[]{3, 13, 45}), 44);

  }
}
