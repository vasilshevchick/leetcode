package general.sorting;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    MergeSort mergeSort = new MergeSort();
    int[] a1 = {2, 5, 1, 0, -1, 1};
    int[] a2 = {2};
    int[] a3 = {};
    mergeSort.mergeSort(a1);
    mergeSort.mergeSort(a2);
    mergeSort.mergeSort(a3);
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));
    System.out.println(Arrays.toString(a3));
  }

  public void mergeSort(int[] a) {
    if (a.length < 2) {
      return;
    }

    int mid = a.length / 2;
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];
    for (int i = 0; i < mid; i++) {
      left[i] = a[i];
    }
    int index = 0;
    for (int i = mid; i < a.length; i++) {
      right[index++] = a[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(a, left, right);
  }

  private void merge(int[] arr, int[] left, int[] right) {
    int a = 0, l = 0, r = 0;
    while (l < left.length && r < right.length) {
      if (left[l] <= right[r]) {
        arr[a++] = left[l++];
      } else {
        arr[a++] = right[r++];
      }
    }
    while (l < left.length) {
      arr[a++] = left[l++];
    }
    while (r < right.length) {
      arr[a++] = right[r++];
    }
  }
}
