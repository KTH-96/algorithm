package leetcode;

public class Lc141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode temp = head;
        int[] arr = new int[100001];
        while (temp.next != null) {
            if (temp.val < 0) {
                temp.val *= -1;
            }
            arr[temp.val]++;
            if (arr[temp.val] > 10) {
                return true;
            }
            temp = temp.next;
        }
        return false;

        //배열안의 숫자를 카우팅
//        if (head == null) {
//            return false;
//        }
//        ListNode temp = head;
//        int[] arr = new int[100001];
//        while (temp.next != null) {
//            if (temp.val < 0) {
//                temp.val *= -1;
//            }
//            arr[temp.val]++;
//            if (arr[temp.val] > 10) {
//                return true;
//            }
//            temp = temp.next;
//        }
//        return false;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
