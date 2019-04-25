package general.sorting;

import java.util.Arrays;

public class BableSort {

  public static void main(String[] args) {
    int[] arr = {2, 5, 3, 4};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void sort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j + 1] < a[j]) {
          int tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
        }
      }
    }
  }
}
