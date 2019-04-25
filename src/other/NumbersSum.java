package other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumbersSum {

  public static void main(String[] args) {
    //[2,3,6,3,5,0] and target number: 6

    int[] a = {2,3,6,3,5,0};
    findNumber(a, 6);
  }

  static void findNumber(int[] numbers, int targetNum) {
    Map<Integer, Set<Integer>> mapValueIndex = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      Set<Integer> indexes = mapValueIndex.get(numbers[i]);
      if (indexes == null) {
        indexes = new HashSet<>();
        mapValueIndex.put(numbers[i], indexes);
      }
      indexes.add(i);
    }

    for (int i = 0; i < numbers.length; i++) {
      Set<Integer> indexes = mapValueIndex.get(targetNum - numbers[i]);
      if(indexes!= null){
        int finalI = i;
        indexes.stream().filter(index -> index != finalI).
            forEach(index -> System.out.println("( "+ numbers[finalI] +"; "+ numbers[index]+")"));
      }
    }
  }
}
