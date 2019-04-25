package steps.step1.array;

public class ContainsDuplicates {

  public boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int current = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (current == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
