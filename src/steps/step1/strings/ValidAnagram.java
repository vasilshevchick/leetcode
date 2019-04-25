package steps.step1.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public static void main(String[] args) {
    ValidAnagram anagram = new ValidAnagram();
    System.out.println(anagram.isAnagram("anagram", "nagaram"));
    System.out.println(anagram.isAnagram("rat", "car"));
    System.out.println(anagram.isAnagram("ab", "a"));
    System.out.println(anagram.isAnagram("a", "ab"));
    System.out.println(anagram.isAnagram("rat", "car"));
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> mapS = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sCharacter = s.charAt(i);
      char tCharacter = t.charAt(i);
      mapS.put(sCharacter, mapS.getOrDefault(sCharacter, 0) + 1);
      mapS.put(tCharacter, mapS.getOrDefault(tCharacter, 0) - 1);
    }

    for (Character character : mapS.keySet()) {
      if (mapS.get(character) != 0) {
        return false;
      }
    }
    return true;
  }
}
