package steps.step1.linkedlist;

public class RemoveNthNodeFromEndofList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }
  }

  public static void main(String[] args) {
    ListNode prev = null;
    ListNode head = null;
    for (int i = 2; i > 0; i--) {
      head = new ListNode(i);
      head.next = prev;
      prev = head;
    }
    RemoveNthNodeFromEndofList solution = new RemoveNthNodeFromEndofList();
    ListNode result = solution.removeNthFromEnd(head, 2);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    for (int i = 0; i < n + 1; i++) {
      first = first.next;
    }
    while (first !=null){
      first = first.next;
      second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
  }
}
