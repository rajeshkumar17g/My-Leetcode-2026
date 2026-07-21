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
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
              HashSet<ListNode> seen=new HashSet<>();
      ListNode crr=head;
      while(crr!=null){
        if(seen.contains(crr)){
            return crr;
        }
        seen.add(crr);
        crr=crr.next;
      }
      return null;
    }
}