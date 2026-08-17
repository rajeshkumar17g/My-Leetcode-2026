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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode first=head,prev=null;
        int count=1;
        while(count<left){
            count++;
            prev=first;
            first=first.next;
        }

        ListNode crr=first,after,rev_head=null;
        while(count<=right){
            count++;
            after=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=after;
        }
        if(prev==null){
            first.next=crr;
            return rev_head;
        }
        prev.next=rev_head;
        first.next=crr;
        return head;
    }
}