package steps.step1.array;

import java.util.Arrays;

public class MoveZeroes {

  public static void main(String[] args) {
    MoveZeroes solution = new MoveZeroes();
    int[] array1 = {0, 1, 0, 3, 12};
    int[] array2 = {0, 0, 1};
    solution.moveZeroes(array1);
    solution.moveZeroes(array2);
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
  }

  public void moveZeroes(int[] nums) {
    int lastNotZeroElementIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[lastNotZeroElementIndex++] = nums[i];
      }
    }
    for (int i = lastNotZeroElementIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
