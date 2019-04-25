package steps.step1.linkedlist;

public class MergeTwoSortedLists {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(5);
    l1.next.next = new ListNode(9);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(1);
    l2.next.next = new ListNode(7);
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    ListNode lists = mergeTwoSortedLists.mergeTwoLists(l1, l2);
    while (lists != null){
      System.out.println(lists.val);
      lists = lists.next;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode tmp = result;
    while (l1 != null && l2 != null) {
      int val;
      if (l1.val <= l2.val) {
        val = l1.val;
        l1 = l1.next;
      } else {
        val = l2.val;
        l2 = l2.next;
      }
      tmp.next = new ListNode(val);
      tmp = tmp.next;
    }
    while (l1 != null){
      tmp.next = new ListNode(l1.val);
      tmp = tmp.next;
      l1 = l1.next;
    }

    while (l2 != null){
      tmp.next = new ListNode(l2.val);
      tmp = tmp.next;
      l2 = l2.next;
    }

    return result.next;
  }
}
