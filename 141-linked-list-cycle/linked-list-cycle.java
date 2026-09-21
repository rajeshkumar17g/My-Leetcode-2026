
public class Solution {
    public boolean hasCycle(ListNode head) {
      
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

    }
}


/*
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;
*/