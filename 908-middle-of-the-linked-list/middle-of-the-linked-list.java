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
        
        ListNode crr=head;
        int len=0;
        while(crr!=null){
            len++;
            crr=crr.next;
        }
        
        int mid=len/2+1;

        crr=head;
        int count=1;
        while(count<mid){
            count++;
            crr=crr.next;
        }

        return crr;







    }
}