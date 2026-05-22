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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode slow=head,fast=head;
        int count=1;
        while(fast.next!=null){
            fast=fast.next;
            count++;
        }
        fast.next=head;
        k=k%count;
        k=count-k;
         System.out.print(count+" "+k);
         ListNode prev=null;
        while(k>0){
            prev=slow;
            slow=slow.next;
            k--;
        }
        System.out.print(slow.val);
        head=slow;
        prev.next=null;
        return head;
    }
}