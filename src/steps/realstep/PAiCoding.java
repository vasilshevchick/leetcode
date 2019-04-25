package steps.realstep;

public class PAiCoding {
  //
  //  "1011" // = 11
  //      "101"  // = 5
  //
  //  sum = "10000" // 16

  public static void main(String[] args) {
    System.out.println(sum("1011", "101"));
  }

  public static String sum(String a, String b) {
    int aIndex = a.length();
    int bIndex = b.length();
    Integer previousSum = 0;
    StringBuilder total = new StringBuilder();
    while (Math.max(aIndex, bIndex) > 0) {
      if (aIndex > 0 && bIndex > -1) {
        previousSum = calcEndSum(a, aIndex, previousSum, total);
      } else if (bIndex > 0 && aIndex > -1) {
        previousSum = calcEndSum(b, bIndex, previousSum, total);
      } else {
        char aChar = a.charAt(aIndex - 1);
        char bChar = b.charAt(bIndex - 1);
        int sum = Character.getNumericValue(aChar) + Character.getNumericValue(bChar);
        if (Character.getNumericValue(aChar) > 0 && Character.getNumericValue(bChar) > 0) {
          sum = previousSum;
          previousSum = 1;
        } else {
          sum = sum + previousSum;
          if (sum > 1) {
            sum = 0;
            previousSum = 1;
          }
        }
        total.insert(0, sum);
      }
      aIndex--;
      bIndex--;
    }
    //    while (aIndex > 0) {
    //      previousSum = calcEndSum(a, aIndex, previousSum, total);
    //      aIndex--;
    //    }
    //    while (bIndex > 0) {
    //      previousSum = calcEndSum(b, bIndex, previousSum, total);
    //      bIndex--;
    //    }
    if (previousSum == 1) {
      total.insert(0, previousSum);
    }
    return total.toString();
  }

  private static int calcEndSum(String a, int aIndex, Integer previousSum, StringBuilder total) {
    int aValue = Character.getNumericValue(a.charAt(aIndex - 1));
    if (previousSum == 1 && aValue == 1) {
      total.insert(0, 0);
      previousSum = 1;
    } else {
      total.insert(0, Math.max(aValue, previousSum));
      previousSum = 0;
    }
    return previousSum;
  }
}
