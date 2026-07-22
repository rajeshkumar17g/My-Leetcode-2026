/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

  HashSet<ListNode> seen=new HashSet<>();
        ListNode crr=head;
        while(crr!=null){
            if(seen.contains(crr)==true){
                return true;
            }
            seen.add(crr);
            crr=crr.next;
        }
        return false;
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
       
    }
}






