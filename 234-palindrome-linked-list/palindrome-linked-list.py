# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        rev=None
        crr=head
        while crr!=None:
            newnode=ListNode(crr.val)
            if rev==None:
                rev=newnode
            else:
                newnode.next=rev
                rev=newnode
            crr=crr.next
        
        crr1=head
        crr2=rev
        while crr1!=None:
                if crr1.val!=crr2.val:
                    return False
                else:
                    crr1=crr1.next
                    crr2=crr2.next
        return True


