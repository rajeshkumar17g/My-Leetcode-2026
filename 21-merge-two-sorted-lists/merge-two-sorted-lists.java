
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }

        ListNode head,prev;
        if(list1.val<list2.val){
            head=list1;
            prev=list1;
            list1=list1.next;
        }
        else{
            head=list2;
            prev=list2;
            list2=list2.next;
        }
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                prev.next=list1;
                list1=list1.next;
                prev=prev.next;
            }
            else{
                prev.next=list2;
                list2=list2.next;
                prev=prev.next;
            }
        }

        if(list1!=null){
            prev.next=list1;
        }
        else{
            prev.next=list2;
        }

        return head;

    }
}