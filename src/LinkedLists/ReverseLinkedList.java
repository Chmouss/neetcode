package LinkedLists;


import java.util.HashMap;
import java.util.Stack;

public class ReverseLinkedList {

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {

        //iteratively with 2 pointers (current element and previous element)
        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev; //prev is always null
            prev = current;
            current = temp;
        }

        return prev;
    }


}
