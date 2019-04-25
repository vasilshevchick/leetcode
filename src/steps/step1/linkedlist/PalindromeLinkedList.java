package steps.step1.linkedlist;

public class PalindromeLinkedList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }
  }

  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    //    ListNode dummy = head;
    //    for (int i = 2; i < 6; i++) {
    //      dummy.next = new ListNode(i);
    //      dummy = dummy.next;
    //    }

    //    while (head!= null){
    //      System.out.println(head.val);
    //      head = head.next;
    //    }
    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
    boolean palindrome = palindromeLinkedList.isPalindrome2(head);
    System.out.println(palindrome);
  }

  public boolean isPalindrome(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    while (head != null && prev != null) {
      if (head.val != prev.val) {
        return false;
      }
      head = head.next;
      prev = prev.next;
    }
    return true;
  }

  public boolean isPalindrome2(ListNode head) {
    StringBuilder result1 = new StringBuilder();
    StringBuilder result2 = new StringBuilder();
    while (head != null) {
      result1.append(head.val);
      result2.insert(0,head.val);
      head = head.next;
    }
    return result1.toString().equals(result2.toString());
  }
}
