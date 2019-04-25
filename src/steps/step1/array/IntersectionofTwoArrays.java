package steps.step1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {

  public static void main(String[] args) {
    IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
    int[] array1 = {4, 9, 5};
    int[] array2 = {9, 4, 9, 8, 4};
    int[] result = solution.intersect(array1, array2);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  //sorted solution
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        list.add(nums1[i]);
        i++;
        j++;
      }
    }
    int[] result = new int[list.size()];
    int index = 0;
    for (int a : list) {
      result[index++] = a;
    }
    return result;
  }
  //  public int[] intersect(int[] nums1, int[] nums2) {
  //    List<Integer> list = new ArrayList<>();
  //    for (int i = 0; i < nums1.length; i++) {
  //
  //      if(list.contains(nums1[i])){
  //        continue;
  //      }
  //      int duplicates1 = 0;
  //      int duplicates2 = 0;
  //      for (int k = i; k < nums1.length; k++) {
  //        if(nums1[i] == nums1[k]){
  //          duplicates1++;
  //        }
  //      }
  //      for (int j = 0; j < nums2.length; j++) {
  //        if(nums1[i] == nums2[j]){
  //          duplicates2++;
  //        }
  //      }
  //      if(duplicates1 > 0 && duplicates2 > 0){
  //        if(duplicates1 < duplicates2){
  //          for (int j = 0; j < duplicates1; j++) {
  //            list.add(nums1[i]);
  //          }
  //        }else {
  //          for (int j = 0; j < duplicates2; j++) {
  //            list.add(nums1[i]);
  //          }
  //        }
  //      }
  //    }
  //    int[] result = new int[list.size()];
  //    for (int i = 0; i < list.size(); i++) {
  //      result[i] = list.get(i);
  //    }
  //    return result;
  //  }
}
