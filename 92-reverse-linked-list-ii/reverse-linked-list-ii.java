class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right || head.next==null){
            return head;
        }
        //1. crr --> left
        int count=1;
        ListNode crr=head,prev=null;
        while(count<left){
            prev=crr;
            crr=crr.next;
            count++;
        }
        //System.out.println("Prev: "+prev.val+" Crr: "+crr.val);

        ListNode crr1=crr,after,rev_head=null;
        while(count<=right){
            after=crr1.next;
            crr1.next=rev_head;
            rev_head=crr1;
            crr1=after;
            count++;
        }
       // System.out.println("rev_head "+rev_head.val+" lastlinkl: "+crr1.val);
       if(prev==null){
        head=rev_head;
       }
       else{
        prev.next=rev_head;
       }
        crr.next=crr1;

        return head;
    }
}