package steps.realstep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PAiWorldSearch {

  public List<String> disctionary = new ArrayList<>();

  public static class TreeNode {

    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String value) {
      this.value = value;
    }
  }

  public List<String> search(String prefix) {
    Map<String, List<String>> prefixMap = new HashMap<>();
    for (String world : disctionary) {
      if (world.startsWith(prefix)) {
        List<String> strings = prefixMap.computeIfAbsent(prefix, k -> new ArrayList<>());
        strings.add(world);
      }
    }

    return prefixMap.get(prefix);
  }

  public List<String> search2(String prefix) {

    List<String> currentSearch = new ArrayList<>();
    return search(disctionary, currentSearch, prefix);
  }

  private List<String> search(List<String> strings, List<String> currentSearch, String prefix) {
    int mediumIndex = strings.size() / 2;
    String world = strings.get(mediumIndex);
    if (world.startsWith(prefix)) {
      currentSearch.add(world);
    }
    if (prefix.compareTo(world) > 1) {
      search(strings.subList(mediumIndex, strings.size()), currentSearch, prefix);
    } else if (prefix.compareTo(world) < 0) {
      search(strings.subList(0, mediumIndex), currentSearch, prefix);
    }
    return currentSearch;
  }
}
