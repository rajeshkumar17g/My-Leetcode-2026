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
        
        int length=0;
        ListNode crr=head;
        while(crr!=null){
            length++;
            crr=crr.next;
        }        

       int mid=length/2+1;
       int count=1;
       crr=head;
       while(count<mid){
            count++;
            crr=crr.next;
       }
        return crr;




    }
}