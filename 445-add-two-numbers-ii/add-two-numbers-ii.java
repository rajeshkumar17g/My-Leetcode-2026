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
     public ListNode reverseList(ListNode head) {
        
    ListNode crr=head,after,rev_head=null;

    while(crr!=null){
        after=crr.next;
        crr.next=rev_head;
        rev_head=crr;
        crr=after;
    }

    return rev_head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverseList(l1);
        l2=reverseList(l2);

        ListNode head=null,tail=null;
       int digit1,digit2,carry=0;
       
       while(l1!=null || l2!=null || carry==1){
          digit1=(l1!=null)?l1.val:0;
          digit2=(l2!=null)?l2.val:0;

          int sum=digit1+digit2+carry;
          ListNode newnode=new ListNode(sum%10);
          if(head==null){
            head=newnode;
            tail=newnode;
          }
          else{
            tail.next=newnode;
            tail=newnode;
          }
          carry=(sum>=10)?1:0;

          if(l1!=null){
            l1=l1.next;
          }
          if(l2!=null){
            l2=l2.next;
          }
       }

       return reverseList(head);


    }
}