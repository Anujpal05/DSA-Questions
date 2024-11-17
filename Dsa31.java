//1669. Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
// Output: [10,1,13,1000000,1000001,1000002,5]
// Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

import java.util.List;

public class Dsa31 {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public class LinkList {
        ListNode head;

        public LinkList() {
            this.head = null;
        }
    }

    public static ListNode mergeCustomList(ListNode list1, ListNode list2, int a, int b) {
        ListNode currNode = list1;
        for (int i = 0; i < b + 1; i++) {
            if (i < a - 1) {
                currNode = currNode.next;
            } else {
                while (list2 != null) {
                    currNode = list2;
                    list2 = list2.next;
                }
            }
        }

        return list1;
    }

    public static void main(String[] args) {

    }
}
