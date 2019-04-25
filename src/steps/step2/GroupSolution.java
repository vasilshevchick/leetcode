package steps.step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupSolution {

  public static void main(String[] args) {
    GroupSolution groupSolution = new GroupSolution();
    String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> lists = groupSolution.groupAnagrams(strings);
    System.out.println(lists);
  }
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      String original = strs[i];
      char[] chars = original.toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);
      List<String> strings = map.computeIfAbsent(sorted, k -> new ArrayList<>());
      strings.add(original);
    }
    return new ArrayList<>(map.values());
  }
}
