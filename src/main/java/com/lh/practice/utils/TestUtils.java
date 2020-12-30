package com.lh.practice.utils;

public class TestUtils {
  public static void assertEquals(int a, int b) {
    if (a != b) {
      System.out.println(a + " != " + b);
      throw new RuntimeException();
    }
  }
}
