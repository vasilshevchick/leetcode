package steps.step1.linkedlist;

public class ReverseLinkedList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode tmp = head;
    for (int i = 2; i < 6; i++) {
      tmp.next = new ListNode(i);
      tmp = tmp.next;
    }
//    while (head != null){
//      System.out.println(head.val);
//      head = head.next;
//    }
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode result = reverseLinkedList.reverseList(head);
    while (result != null){
      System.out.println(result.val);
      result = result.next;
    }
  }

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    while (current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }

}
