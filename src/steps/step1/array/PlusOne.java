package steps.step1.array;

import java.util.Arrays;

public class PlusOne {

  public static void main(String[] args) {

    PlusOne singleNumber = new PlusOne();
    int[] array = {4, 1, 2, 1, 2};
    int[] array2 = {9, 9, 9};
    int[] array3 = new int[5];
    System.out.println(Arrays.toString(array3));
    System.out.println(Arrays.toString(singleNumber.plusOne(array)));
    System.out.println(Arrays.toString(singleNumber.plusOne(array2)));
  }

  public int[] plusOne(int[] digits) {
    boolean fullArray = false;
    int additionalDigit = 0;
    for (int i = digits.length - 1; i > -1; i--) {
      if (i == digits.length - 1) {
        digits[i] += 1 + additionalDigit;
      } else {
        digits[i] += additionalDigit;
      }
      if (digits[i] == 10) {
        additionalDigit = 1;
        digits[i] = 0;
        if (i == 0) {
          fullArray = true;
        }
      } else {
        break;
      }
    }

    if (fullArray) {
      int[] biggerArray = new int[digits.length + 1];
      biggerArray[0] = 1;
      return biggerArray;
    } else {
      return digits;
    }
  }
}
