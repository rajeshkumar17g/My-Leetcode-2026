
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy=new ListNode();
        ListNode prev=dummy;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                l1=l1.next;
            }
            else{
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        if(l1!=null){
            prev.next=l1;
        }
        else if(l2!=null){
            prev.next=l2;
        }
        return dummy.next;




    }
}