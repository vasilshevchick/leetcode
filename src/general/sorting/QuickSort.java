package general.sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {2, 5, 3, 4};
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));

  }

  public static void quickSort(int[]a, int low, int high){
    int partition = partition(a, low, high);
    if(partition-1 > low){
      quickSort(a, low, partition-1);
    }
    if(partition +1 < high){
      quickSort(a, partition + 1, high);
    }
  }

  private static int partition(int[] a, int low, int high) {
    int pivot = a[high];
    for (int i = low; i < high; i++) {
      if(a[i] < pivot){
        int tmp = a[low];
        a[low++] = a[i];
        a[i] = tmp;
      }
    }
    int tmp = a[low];
    a[low] = pivot;
    a[high] = tmp;
    return low;
  }
}
