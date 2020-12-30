package com.lh.practice.sort.practice;

public class QuickSortP1 {

  public void sort(Comparable[] c) {
    sort(c, 0, c.length - 1);
  }

  private void sort(Comparable[] c, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int j = partion(c, lo, hi);
    sort(c, lo, j - 1);
    sort(c, j + 1, hi);
  }

  private int partion(Comparable[] c, int lo, int hi) {
    Comparable mid = c[lo];
    int left = lo;
    int right = hi + 1;
    while (true) {
      while (c[++left].compareTo(mid) < 0) {
        if (left == hi) {
          break;
        }
      }
      while (c[--right].compareTo(mid) > 0) {
        if (right == lo) {
          break;
        }
      }
      if (left >= right) {
        break;
      }
      exch(c, left, right);
    }
    exch(c, lo, right);
    return right;
  }

  private void exch(Comparable[] c, int a, int b) {
    Comparable temp = c[a];
    c[a] = c[b];
    c[b] = temp;
  }
}
