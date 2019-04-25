package steps.step1.array;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
    int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int len = solution.removeDuplicates(array);
    System.out.println(len);
    for (int i = 0; i < len; i++) {
      System.out.println(array[i]);
    }
  }

  public int removeDuplicates(int[] nums) {
    int currentIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[currentIndex]) {
        currentIndex++;
        nums[currentIndex] = nums[i];
      }
    }
    return ++currentIndex;
  }
}