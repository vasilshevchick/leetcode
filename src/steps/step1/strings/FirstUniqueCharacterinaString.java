package steps.step1.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

  public static void main(String[] args) {
    FirstUniqueCharacterinaString solution = new FirstUniqueCharacterinaString();
    System.out.println(solution.firstUniqChar("leetcode"));
    System.out.println(solution.firstUniqChar("loveleetcode"));
  }

  public int firstUniqChar(String s) {
    Map<Character, Integer> entries = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character key = s.charAt(i);
      Integer count = entries.get(key) == null ? 1 : entries.get(key) + 1;
      entries.put(key, entries.getOrDefault(key, 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
      if (entries.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
