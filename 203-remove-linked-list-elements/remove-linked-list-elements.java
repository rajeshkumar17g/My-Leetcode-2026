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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode crr=head,prev=null;
        while(crr!=null){
            if(crr.val==val){
                prev.next=crr.next;
                crr=crr.next;
            }
            else{
                prev=crr;
                crr=crr.next;
            }
        }
        if(prev==null){
            return head;
        }
        prev.next=null;

        return head;
    }
}