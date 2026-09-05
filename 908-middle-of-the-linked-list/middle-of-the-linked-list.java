/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}


/*

        ListNode crr=head;
        int count=0;
        while(crr!=null){
            crr=crr.next;
            count++;
        }
        int mid=count/2+1;

        count=1;
        crr=head;
        while(count<mid){
            crr=crr.next;
            count++;
        }

        return crr;
        */