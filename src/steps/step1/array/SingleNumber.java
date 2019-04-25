package steps.step1.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

  public static void main(String[] args) {

    SingleNumber singleNumber = new SingleNumber();
    int[] array = {4, 1, 2, 1, 2};
    System.out.println(singleNumber.singleNumber(array));
  }

  public int singleNumber(int[] nums) {
    Set<Integer> set = new HashSet<>(Collections.emptyList());

    for (int i = 0; i < nums.length; i++) {
      if (!set.remove(nums[i])) {
        set.add(nums[i]);
      }
    }
    return set.stream().findFirst().get();
  }

  //  public int singleNumber(int[] nums) {
  //    Arrays.sort(nums);
  //
  //    int a = nums[0];
  //    for (int i = 1; i < nums.length ; i++) {
  //      a = a ^ nums[i];
  //    }
  //    return nums[nums.length-1];
  //  }

  //  public int singleNumber(int[] nums) {
  //    for (int i = 1; i < nums.length ; i++) {
  //      nums[0] = nums[0] ^ nums[i];
  //    }
  //    return nums[0];
  //  }
}
