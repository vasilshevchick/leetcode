package steps.realstep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PeopleSolution {

  public static void main(String[] args) {
    PeopleSolution solution = new PeopleSolution();
    int[] arr = {1, 1, 1, 2, 3, 4, 4};
    int[] arr2 = {};
    int[] arr3 = {-1, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
    int[] arr4 = {1};
    solution.duplicate(arr);
    solution.duplicate2(arr);
    solution.duplicate(arr2);
    solution.duplicate2(arr2);
    solution.duplicate(arr3);
    solution.duplicate2(arr3);
    solution.duplicate(arr4);
    solution.duplicate2(arr4);
  }

  public void duplicate(int[] arr) {
    if (arr.length == 0) {
      return;
    }
    Set<Integer> numbers = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (numbers.contains(arr[i])) {
        System.out.println(arr[i]);
      } else {
        numbers.add(arr[i]);
      }
    }
  }

  public void duplicate2(int[] arr) {
    if (arr.length == 0) {
      return;
    }
    Arrays.sort(arr);
    int number = arr[0];
    int index = 1;
    int duplicateCount = 0;
    while (index < arr.length) {
      if (arr[index] == number) {
        ++duplicateCount;
        if (duplicateCount == 1) {
          System.out.println(arr[index]);
        }
      } else {
        duplicateCount = 0;
        number = arr[index];
      }
      index++;
    }
  }
}
