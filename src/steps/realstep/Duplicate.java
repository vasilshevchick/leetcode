package steps.realstep;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

  //  An array contains n numbers ranging from 0 to n-2.
  //  There is exactly one number duplicated inthe array.
  //  How do you find the duplicated number? For example,
  //if an array with length 5 contains numbers {0, 2, 1, 3, 2}, the duplicated number is 2.
  //
  //      */

  public static void main(String[] args) {
    int[] array = {0, 2, 1, 3, 2};

    Duplicate duplicate = new Duplicate();
    System.out.println(duplicate.duplicate(array));
  }

  int duplicate(int numbers[]) {
    Set<Integer> numSet = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {
      if (numSet.contains(numbers[i])) {
        return numbers[i];
      } else {
        numSet.add(numbers[i]);
      }
    }
    return numbers[0];
  }
}
