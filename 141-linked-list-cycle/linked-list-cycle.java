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
    public boolean hasCycle(ListNode head) {
       
      HashSet<ListNode> seen=new HashSet<>();
      ListNode crr=head;
      while(crr!=null){
        if(seen.contains(crr)){
            return true;
        }
        seen.add(crr);
        crr=crr.next;
      }
      return false;
    }
}