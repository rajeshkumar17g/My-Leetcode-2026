
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> seen=new HashSet<>();
        ListNode crr=head;
        while(crr!=null){
            if(seen.contains(crr)==true){
                return crr;
            }
            seen.add(crr);
            crr=crr.next;
        }
        return null;
    }
}