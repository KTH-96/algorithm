package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lc148 {

    public ListNode sortList(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            int val = node.val;
            list.add(val);
            node = node.next;
        }
        Collections.sort(list);

        node = head;
        for (Integer integer : list) {
            node.val = integer;
            node = node.next;
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
