package dev.tolja;

public class ListNodeSolution {
    /*
    === Test Data for ArraySolution ===
    ListNode listNode1 = new ListNode(1);
    listNode1.next = new ListNode(2);
    listNode1.next.next = new ListNode(3);
    listNode1.next.next.next = new ListNode(4);
    listNode1.next.next.next.next = new ListNode(5);

    ListNode listNode2 = new ListNode(1);
    listNode2.next = new ListNode(3);
    listNode2.next.next = new ListNode(4);

    listNodes for testing.
     */

    /*
    Prints the elements of a ListNode.
     */
    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    /*
    Given a ListNode, remove the n-th node from the end of the list and return its head. Date 8.29
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) { //two pointer
        ListNode listNode = new ListNode(0);
        listNode.next = head;

        ListNode first = listNode;
        ListNode second = listNode;

        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return listNode.next;
    }

    /*
    Given 2 linkedNodes, return the sum of the 2 linkedNodes. Date 8.29
     */
    public static ListNode sumOfTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return listNode.next;
    }

    /*
    Given a ListNode, checks whether it contains a cycle. Date 8.29
     */
    public static boolean hasCycle(ListNode head) { // two pointer
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}