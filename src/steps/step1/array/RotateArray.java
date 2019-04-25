package steps.step1.array;

public class RotateArray {

  public static void main(String[] args) {
    RotateArray solution = new RotateArray();
    int[] array1 = {1, 2, 3, 4, 5, 6, 7};
    int[] array2 = {-1, -100, 3, 99};
    solution.rotate(array1, 3);
    solution.rotate(array2, 2);
  }

  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int prev, tmp;
    for (int j = 0; j < k; j++) {
      prev = nums[nums.length - 1];
      for (int i = 0; i < nums.length; i++) {
        tmp = nums[i];
        nums[i] = prev;
        prev = tmp;
      }
    }
  }
}