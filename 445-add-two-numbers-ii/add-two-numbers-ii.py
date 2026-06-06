# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        def rev(head):
            rev_head=None
            crr=head
            while crr!=None:
                after=crr.next
                crr.next=rev_head
                rev_head=crr
                crr=after
            return rev_head
        #-------------------------------------




        l1=rev(l1)
        l2=rev(l2)
        carry=0
        dummy=ListNode()
        prev=dummy
        while l1!=None or l2!=None or carry!=0:
            newnode=ListNode()
            prev.next=newnode
            prev=newnode
            if l1!=None and l2!=None:
                sum=l1.val+l2.val+carry
                newnode.val=sum%10
                carry=sum//10
                l1=l1.next
                l2=l2.next
            elif l1==None and l2!=None:
                sum=l2.val+carry
                newnode.val=sum%10
                carry=sum//10
                l2=l2.next
            elif l1!=None and l2==None:
                sum=l1.val+carry
                newnode.val=sum%10
                carry=sum//10
                l1=l1.next
            elif l1==None and l2==None:
                sum=carry
                newnode.val=sum%10
                carry=sum//10
        return rev(dummy.next)